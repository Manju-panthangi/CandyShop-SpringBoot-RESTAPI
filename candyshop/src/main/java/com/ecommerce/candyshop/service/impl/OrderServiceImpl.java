package com.ecommerce.candyshop.service.impl;

import com.ecommerce.candyshop.models.Customer;
import com.ecommerce.candyshop.models.Order;
import com.ecommerce.candyshop.models.OrderRequest;
import com.ecommerce.candyshop.repository.CandyRepository;
import com.ecommerce.candyshop.repository.CustomerRepository;
import com.ecommerce.candyshop.repository.OrderRepository;
import com.ecommerce.candyshop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CandyRepository candyRepository;

    @Override
    public Order placeOrder(OrderRequest orderRequest) {

        Order order = new Order();
        order.setCustomer(customerRepository.findByPhoneNumber(orderRequest.getPhoneNumber()).get());
        order.setCandy(candyRepository.getReferenceById(orderRequest.getCandieId()));
        order.setQuantity(order.getQuantity());
        order.setAmount(candyRepository.getReferenceById(orderRequest.getCandieId()).getPrice()*orderRequest.getQuantity());

        return orderRepository.save(order);
    }
}
