package com.ecommerce.candyshop.service.impl;

import com.ecommerce.candyshop.exceptions.InvalidCustomerDetails;
import com.ecommerce.candyshop.models.Customer;
import com.ecommerce.candyshop.repository.CustomerRepository;
import com.ecommerce.candyshop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public Customer registerCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer getById(Long customerId) {
        return customerRepository.findById(customerId).get();
    }


}
