package com.ecommerce.candyshop.repository;

import com.ecommerce.candyshop.models.Customer;
import com.ecommerce.candyshop.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order,Long> {

    List<Order> findByCustomer(Customer customer);
}
