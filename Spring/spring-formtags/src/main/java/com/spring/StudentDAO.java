package com.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;



@Component(value="studentDAO")
public class StudentDAO {

	@Autowired
	JTemplate jtemplate ;

	public StudentDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDAO(JTemplate jtemplate) {
		super();
		this.jtemplate = jtemplate;
	}
	public JTemplate getJtemplate() {
		return jtemplate;
	}

	public void setJtemplate(JTemplate jtemplate) {
		this.jtemplate = jtemplate;
	}
	public void createStudent(Student Student)
	{
		String query = "insert into student (name,dept,year,intrest) values(?,?,?,?)";
		Object obj[]= {Student.getName(),Student.getDepartment(),Student.getYear(),Student.getIntrests()};
		
		jtemplate.update(query,obj);
		System.out.println("inserted");
	}
	public List<Student> getAllStudent(){
		return jtemplate.query("select * from student", new StudentRowMapper());
		
	}
}
