package comm.company.myapp.dao;

import comm.company.myapp.entity.Instructor;
import comm.company.myapp.factory.InstructorFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class InstructorDAOImpl implements InstructorDAO {
	
	private static Session session=null;
	{
		session=InstructorFactory.getMySession();
	}
	@Override
	public void createInstructor(Instructor instructor) {
		
		session.getTransaction().begin();
		session.persist(instructor);
		session.getTransaction().commit();
	}

	

}