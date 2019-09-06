package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JTemplate extends JdbcTemplate{

	@Autowired
	private DataSource dataSource;
	
	private javax.sql.DataSource ds=dataSource;
	public JTemplate(DataSource ds) {
		//System.out.println(ds);
		this.dataSource=ds;
	}
	
	public JTemplate() {
		super();
	}
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
}
