package com.spring;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/student")
public class FormController {
	@GetMapping("/")
	public String goHome()
	{
		return "student-main-menu";
	}
	
	
	@GetMapping("/showprocessform")
	public String ShowPage(Model theModel) {
		
		
		
		
	Student student =  new Student();
	theModel.addAttribute("student",student);
	return "insert-student";
	
	}
	
	@PostMapping("/processform")
	public String ProcessPage(@ModelAttribute("student") Student theStudent,Model theModel) {
		//Student student =  new Student();
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDAO dao = context.getBean("studentDAO", StudentDAO.class);
		dao.createStudent(new Student(theStudent.getName(),theStudent.getDepartment(),theStudent.getYear(),theStudent.getIntrest()));
		List <Student>details=dao.getAllStudent();
		theModel.addAttribute("tempstudent",details);
		
		
		return "show-student";
	}
}
