package com.ecommerce.candyshop.repository;

import com.ecommerce.candyshop.models.Candy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandyRepository extends JpaRepository<Candy,Long> {

}
