package com.ecommerce.candyshop.service.impl;

import com.ecommerce.candyshop.models.*;
import com.ecommerce.candyshop.repository.CandyRepository;
import com.ecommerce.candyshop.repository.CustomerRepository;
import com.ecommerce.candyshop.repository.OrderRepository;
import com.ecommerce.candyshop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
        Candy candy = candyRepository.findById(orderRequest.getCandieId()).get();
        Customer customer = customerRepository.findByPhoneNumber(orderRequest.getPhoneNumber()).get();
        order.setCustomer(customer);
        order.setCandy(candy);
        order.setQuantity(orderRequest.getQuantity());
        order.setAmount(candy.getPrice()*orderRequest.getQuantity());

        return orderRepository.save(order);
    }

    @Override
    public List<Order> findByCustomerId(Customer customer) {
        return orderRepository.findByCustomer(customer);
    }

    @Override
    public Order findById(Long id) {
        return orderRepository.findById(id).get();
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order updateOrderStatus(Long orderId, String orderStatus) {
        Order order = new Order();
        orderStatus=orderStatus.toUpperCase();
        order = orderRepository.getReferenceById(orderId);
        order.setOrder_status(ORDER_STATUS.valueOf(orderStatus));
        orderRepository.save(order);
        return orderRepository.getReferenceById(orderId);
    }
}
