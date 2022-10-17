package com.ecommerce.candyshop.controllers;

import com.ecommerce.candyshop.models.Candy;
import com.ecommerce.candyshop.models.ORDER_STATUS;
import com.ecommerce.candyshop.models.Order;
import com.ecommerce.candyshop.service.CandyService;
import com.ecommerce.candyshop.service.CustomerService;
import com.ecommerce.candyshop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/admin")
@Validated
public class AdminController {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private CandyService candyService;
    @Autowired
    private OrderService orderService;


    @PostMapping("/addCandy")
    public Candy addCandy(@RequestBody @Valid Candy candy){
        return candyService.addCandy(candy);
    }

    @GetMapping("/orders")
    public List<Order> getAllOrders(){ return orderService.getAllOrders(); }

    @PutMapping("/updateOrderStatus")
    public Order update(@RequestParam Long orderId,@RequestParam String orderStatus){
        return orderService.updateOrderStatus(orderId,orderStatus);
    }

}
