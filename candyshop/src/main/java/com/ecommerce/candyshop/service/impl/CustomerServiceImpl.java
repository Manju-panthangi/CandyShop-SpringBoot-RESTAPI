package com.ecommerce.candyshop.service.impl;

import com.ecommerce.candyshop.exceptions.InvalidCustomerDetails;
import com.ecommerce.candyshop.models.Customer;
import com.ecommerce.candyshop.repository.CustomerRepository;
import com.ecommerce.candyshop.service.CustomerService;
import com.ecommerce.candyshop.validations.CustomerValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    //private CustomerValidation customerValidation;


    @Override
    public Customer registerCustomer(Customer customer) {
        System.out.println("Tesing Service");

//        if(checkIfNameIsEmptyString(customer)){
//
//            throw new InvalidCustomerDetails("Name can't be an empty string");
//        } else if (checkIfPhoneNumberAlreadyExists(customer)) {
//            throw new InvalidCustomerDetails("Name can't be an empty string");
//        }
//        System.out.println("Testing return");
        return customerRepository.save(customer);
    }





}
