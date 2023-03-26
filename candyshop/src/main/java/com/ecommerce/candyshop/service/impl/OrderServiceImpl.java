package com.ecommerce.candyshop.service.impl;

import com.ecommerce.candyshop.models.*;
import com.ecommerce.candyshop.repository.OrderLineRepository;
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
    @Autowired
    private OrderLineRepository orderLineRepository;

    @Override
    public Order placeOrder(OrderRequest orderRequest) {

        Order order = new Order();
        Customer customer = customerRepository.findByPhoneNumber(orderRequest.getPhoneNumber()).get();

        order.setCustomer(customer);
        orderRepository.save(order);

        List<CandyQuantityPair> candyQuantityPairList = orderRequest.getCandyQuantityPairList();
        double amount =0;

        for (CandyQuantityPair candyQuantityPair: candyQuantityPairList
             ) {

            OrderLine orderLine = new OrderLine();
            Candy candy = candyRepository.getReferenceById(candyQuantityPair.getCandieId());

            orderLine.setCandy(candy);
            orderLine.setQuantity(candyQuantityPair.getQuantity());
            amount = amount + candy.getPrice()*candyQuantityPair.getQuantity();
            orderLine.setOrder(order);

            orderLineRepository.save(orderLine);

        }
        order.setAmount(amount);
        return  orderRepository.save(order);
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
        Order order = orderRepository.findById(orderId).get();
        orderStatus=orderStatus.toUpperCase();
        order.setOrder_status(ORDER_STATUS.valueOf(orderStatus));
        orderRepository.save(order);
        return orderRepository.findById(orderId).get();
    }
}
