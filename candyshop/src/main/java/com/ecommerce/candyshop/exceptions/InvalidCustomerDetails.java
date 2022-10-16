package com.ecommerce.candyshop.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class InvalidCustomerDetails extends RuntimeException{

    public InvalidCustomerDetails(String message) {
        super(message);
    }

}
