package comm.example.config;


import java.beans.PropertyVetoException;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(basePackages="comm.example")
public class CustomerConfig implements WebMvcConfigurer {
	
	@Bean
	public DataSource myDataSource() {
		ComboPooledDataSource datasource = new ComboPooledDataSource();
		datasource.setUser("root");
		try {
			datasource.setDriverClass("com.mysql.cj.jdbc.Driver");
		} catch (PropertyVetoException e) {
			
			e.printStackTrace();
		}
		
		datasource.setJdbcUrl("jdbc:mysql://localhost:3306/customerdb");
		datasource.setPassword("root");
		datasource.setMinPoolSize(10);
		datasource.setMaxPoolSize(20);
		datasource.setMaxIdleTime(30000);
		return datasource;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory =  new LocalSessionFactoryBean();
		sessionFactory.setDataSource(myDataSource());
		sessionFactory.setHibernateProperties(getProperty());
		sessionFactory.setPackagesToScan("comm.example");
		return sessionFactory;
	}

	private Properties getProperty() {
		Properties props=new Properties();
		props.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		props.put("hibernate.show_sql", "true");
		return props;
	}
	
	@Bean
	@Autowired
	public HibernateTransactionManager transactionManagement(SessionFactory sessionFactory) {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory);

		return txManager;
	}
	
	

}
