package com.ecommerce.candyshop.service;

import com.ecommerce.candyshop.models.Customer;

public interface CustomerService {
    public Customer registerCustomer(Customer customer);
    public Customer getById(Long customerId);
}
