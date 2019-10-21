package comm.example.dao;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import comm.example.Customer;


@Repository
public class CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	private Session session;

	@PostConstruct
	public void init() {
		session = sessionFactory.openSession();
	}
	
	@Transactional
	public List<Customer> getAllCustomer() {

	Query<Customer> query = session.createQuery("from Customer order by lname",Customer.class);
	
	
	List<Customer> customers = query.getResultList();
	//System.out.println(customers);
	return customers;
	}
	
	public void saveCustomer(Customer customer) {
	
		session.save(customer);
	}

	public void deleteCustomer(Customer customer) {
		
		session.delete(customer);
	}
}
