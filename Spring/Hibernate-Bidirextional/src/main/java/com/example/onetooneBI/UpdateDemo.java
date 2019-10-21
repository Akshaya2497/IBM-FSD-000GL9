package com.example.onetooneBI;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateDemo {
	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		try {
			String firstName="Aksh";
			Instructor tempInstructor = 
					session.get(Instructor.class, firstName);
			
			System.out.println("Found instructor: " + tempInstructor);
//		Instructor tempInstructor = 
//				new Instructor("Madhu", "Patel", "madh@luv2code.com");
		
		InstructorDetail tempInstructorDetail =
				new InstructorDetail(
						"http://www.youtube.com",
						"drums");
		
		if (tempInstructor != null) {
			
			System.out.println("Updating: " + tempInstructor);
			
			// Note: will ALSO delete associated "details" object
			// because of CascadeType.ALL
			//
			session.delete(tempInstructor);				
		}
		
		// commit transaction
		session.getTransaction().commit();
		
		System.out.println("Done!");
	
		
		
		
		
		//tempInstructor.setInstructorDetail(tempInstructorDetail);
		
		// start a transaction
//		session.beginTransaction();
//		
//		// save the instructor
//		//
//		// Note: this will ALSO save the details object
//		// because of CascadeType.ALL
//		//
//		System.out.println("Updating instructor: " + tempInstructor);
//		session.save(tempInstructor);					
//		
//		// commit transaction
//		session.getTransaction().commit();
//		
//		System.out.println("Done!");
	}
	finally {
		factory.close();
	}
}
}
