package comm.example.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import comm.example.spring.entity.Customer;


@Repository
public class CustomerDAO {

	@Autowired
	private SessionFactory session ;
	
	public List<Customer> getCustomer() {
	Session currentsession = session.getCurrentSession();
	Query<Customer> query = currentsession.createQuery("from Customer order by lname",Customer.class);
	
	
	List<Customer> customers = query.getResultList();
	System.out.println(customers);
	return customers;
	}
	
	public void saveCustomer(Customer customer) {
		Session currentsession = session.getCurrentSession();
		currentsession.save(customer);
	}
}
