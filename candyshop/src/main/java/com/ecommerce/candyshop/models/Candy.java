package com.ecommerce.candyshop.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "candies")
public class Candy {

    //Fields for a candies

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long candieId;

    @NotNull(message = "Name shouldn't be null")
    @NotEmpty(message = "Name shouldn't be empty")
    private String name;

    @NotNull(message = "Price shouldn't be null")
    private double price;


    //Getter and Setter for the fields

    public Long getCandieId() {
        return candieId;
    }

    public void setCandieId(Long candieId) {
        this.candieId = candieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
