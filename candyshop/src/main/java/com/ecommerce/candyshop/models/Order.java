package com.ecommerce.candyshop.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @ManyToOne
    @NotNull(message = "Customer shouldn't be null")
    private Customer customer;

    @ManyToOne
    @NotNull(message = "Candy shouldn't be null")
    private Candy candy;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Order status shouldn't be null")
    private ORDER_STATUS order_status = ORDER_STATUS.INPROGRESS;

    private Integer quantity;
    @NotNull
    private double amount;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Candy getCandy() {
        return candy;
    }

    public void setCandy(Candy candy) {
        this.candy = candy;
    }

    public ORDER_STATUS getOrder_status() {
        return order_status;
    }

    public void setOrder_status(ORDER_STATUS order_status) {
        this.order_status = order_status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
