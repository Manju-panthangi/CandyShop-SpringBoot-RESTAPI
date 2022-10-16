package com.ecommerce.candyshop.validations;

import com.ecommerce.candyshop.models.Customer;
import com.ecommerce.candyshop.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;



public class CustomerValidationImpl implements CustomerValidation{

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public boolean checkIfNameIsEmptyString(Customer customer) {
        System.out.println("Name Test passed");
        if (customer.getName().isEmpty()){
            return true;
        }
        return false;
    }


}
