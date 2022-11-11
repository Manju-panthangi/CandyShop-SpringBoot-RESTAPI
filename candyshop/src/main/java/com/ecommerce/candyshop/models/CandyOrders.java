package com.ecommerce.candyshop.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "candy_orders")
public class CandyOrders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long candiesOrderId;

    @NotNull(message = "candy can't be null")
    @OneToOne
    private Candy candy;
    private int quantity=1;

    @NotNull(message = "order can't be null")
    @OneToOne
    private Order order;


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

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
