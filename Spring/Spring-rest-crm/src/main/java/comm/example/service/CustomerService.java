package comm.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import comm.example.dao.CustomerDAO;
import comm.example.Customer;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerDAO customerdao;
	
	@Transactional
	public List<Customer> getAllCustomer() {
		return customerdao.getAllCustomer();
	}
	
	@Transactional
	public void saveCustomer(Customer customer) {
		 customerdao.saveCustomer(customer);
	}
	@Transactional
	public void deleteCustomer(Customer theCustomer) {
	customerdao.deleteCustomer(theCustomer);
		
	}
}
