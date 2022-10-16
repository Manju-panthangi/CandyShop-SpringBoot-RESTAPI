package com.ecommerce.candyshop.controllers;

import com.ecommerce.candyshop.models.Customer;
import com.ecommerce.candyshop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/customer")
@Validated
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/registration")
    public Customer registration(@RequestBody @Valid Customer customer){
        return customerService.registerCustomer(customer);
    }
}
