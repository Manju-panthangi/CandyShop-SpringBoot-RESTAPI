package com.ecommerce.candyshop.service;

import com.ecommerce.candyshop.models.Customer;
import com.ecommerce.candyshop.models.Order;
import com.ecommerce.candyshop.models.OrderRequest;

import java.util.List;

public interface OrderService {

    Order placeOrder(OrderRequest orderRequest);
    List<Order> findByCustomerId(Customer customerId);
    Order findById(Long id);
    List<Order> getAllOrders();

    Order updateOrderStatus(Long orderId,String orderStatus);

}
