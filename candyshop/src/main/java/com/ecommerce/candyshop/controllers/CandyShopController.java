package com.ecommerce.candyshop.controllers;

import com.ecommerce.candyshop.models.Candy;
import com.ecommerce.candyshop.service.CandyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CandyShopController {

    @Autowired
    private CandyService candyService;

    @GetMapping("/menu")
    public List<Candy> displayMenu(){
        return candyService.getAllCandies();
    }
}
