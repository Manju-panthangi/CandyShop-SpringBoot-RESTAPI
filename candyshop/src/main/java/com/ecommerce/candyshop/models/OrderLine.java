package com.ecommerce.candyshop.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "order_line")
public class OrderLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long candiesOrderId;

    @NotNull(message = "candy can't be null")
    @OneToOne
    private Candy candy;
    private int quantity=1;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_order_id")
    @JsonIgnore
    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }


    public Long getCandiesOrderId() {
        return candiesOrderId;
    }

    public void setCandiesOrderId(Long candiesOrderId) {
        this.candiesOrderId = candiesOrderId;
    }

    public Candy getCandy() {
        return candy;
    }

    public void setCandy(Candy candy) {
        this.candy = candy;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
