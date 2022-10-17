package com.ecommerce.candyshop.controllers;

import com.ecommerce.candyshop.models.Candy;
import com.ecommerce.candyshop.models.Customer;
import com.ecommerce.candyshop.service.CandyService;
import com.ecommerce.candyshop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/customer")
@Validated
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private CandyService candyService;

    @PostMapping("/registration")
    public Customer registration(@RequestBody @Valid Customer customer){
        return customerService.registerCustomer(customer);
    }


    // To be shifted to admin controller
    @PostMapping("/addCandy")
    public Candy addCandy(@RequestBody @Valid Candy candy){
        return candyService.addCandy(candy);
    }

    @GetMapping("/menu")
    public List<Candy> displayMenu(){
        return candyService.getAllCandies();
    }


}
