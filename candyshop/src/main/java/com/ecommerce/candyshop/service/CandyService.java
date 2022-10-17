package com.ecommerce.candyshop.service;

import com.ecommerce.candyshop.models.Candy;

import java.util.List;

public interface CandyService {
    Candy addCandy(Candy candy);
    List<Candy> getAllCandies();
}
