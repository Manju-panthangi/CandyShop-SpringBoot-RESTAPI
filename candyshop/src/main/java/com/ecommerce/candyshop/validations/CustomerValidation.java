package com.ecommerce.candyshop.validations;

import com.ecommerce.candyshop.models.Customer;

public interface CustomerValidation {
    boolean checkIfNameIsEmptyString(Customer customer);

}
