package com.ecommerce.candyshop.service;

import com.ecommerce.candyshop.models.Order;
import com.ecommerce.candyshop.models.OrderRequest;

public interface OrderService {

    Order placeOrder(OrderRequest orderRequest);

}
