package com.ecommerce.candyshop.service.impl;

import com.ecommerce.candyshop.models.Candy;
import com.ecommerce.candyshop.repository.CandyRepository;
import com.ecommerce.candyshop.service.CandyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandyServiceImpl implements CandyService {

    @Autowired
    private CandyRepository candyRepository;


    @Override
    public Candy addCandy(Candy candy) {
        return candyRepository.save(candy);
    }

    @Override
    public List<Candy> getAllCandies() {
        return candyRepository.findAll();
    }
}
