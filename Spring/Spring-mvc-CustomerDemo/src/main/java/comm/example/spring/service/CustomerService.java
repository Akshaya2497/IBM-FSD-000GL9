package comm.example.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import comm.example.spring.dao.CustomerDAO;
import comm.example.spring.entity.Customer;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerDAO customerdao;
	
	@Transactional
	public List<Customer> getCustomer() {
		return customerdao.getCustomer();
	}
	
	@Transactional
	public void saveCustomer(Customer customer) {
		 customerdao.saveCustomer(customer);
	}
}
