package com.docker.mobystore.service;

import com.docker.mobystore.model.Customer;
import com.docker.mobystore.repositories.CustomerRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	public Customer findById(Long customerId) {
		return customerRepository.findOne(customerId);
	}

	public Customer findByName(String name) {
		return customerRepository.findByName(name);
	}

	public void saveCustomer(Customer customer) {
		customerRepository.save(customer);
	}

	public void updateCustomer(Customer customer) {
		customerRepository.save(customer);
	}

	public void deleteCustomerById(Long customerId) {
		customerRepository.delete(customerId);
	}

	public void deleteAllCustomers() {
		customerRepository.deleteAll();
	}

	public List<Customer> findAllCustomers() {
		return customerRepository.findAll();
	}

	public boolean customerExist(Long customerId) {
		return customerRepository.findOne(customerId) != null;
	}

}