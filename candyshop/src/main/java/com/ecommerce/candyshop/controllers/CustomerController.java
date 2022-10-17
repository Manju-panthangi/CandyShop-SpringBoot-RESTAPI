package com.ecommerce.candyshop.controllers;

import com.ecommerce.candyshop.models.Candy;
import com.ecommerce.candyshop.models.Customer;
import com.ecommerce.candyshop.models.Order;
import com.ecommerce.candyshop.models.OrderRequest;
import com.ecommerce.candyshop.service.CandyService;
import com.ecommerce.candyshop.service.CustomerService;
import com.ecommerce.candyshop.service.OrderService;
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
    private OrderService orderService;

    @PostMapping("/registration")
    public Customer registration(@RequestBody @Valid Customer customer){
        return customerService.registerCustomer(customer);
    }

    @PostMapping("/order")
    public Order placeOrder(@RequestBody OrderRequest orderRequest){
        return orderService.placeOrder(orderRequest);
    }

    @GetMapping("/ordersByCustomerId/{customerId}")
    public List<Order> findOrdersByCustomerId(@PathVariable Long customerId){
        return orderService.findByCustomerId(customerService.getById(customerId));
    }
}
