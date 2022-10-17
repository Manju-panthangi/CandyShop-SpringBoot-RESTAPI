package com.ecommerce.candyshop.repository;

import com.ecommerce.candyshop.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    Optional<Customer> findByPhoneNumber(String phoneNumber);

}
