package com.ecommerce.candyshop.repository;

import com.ecommerce.candyshop.models.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineRepository extends JpaRepository<OrderLine,Long> {

}
