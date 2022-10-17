package com.ecommerce.candyshop.repository;

import com.ecommerce.candyshop.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
