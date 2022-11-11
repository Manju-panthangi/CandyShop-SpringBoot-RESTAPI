package com.ecommerce.candyshop.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;


    @ManyToOne(cascade = CascadeType.PERSIST)
    @NotNull(message = "Customer shouldn't be null")
    private Customer customer;


    @OneToMany(cascade = CascadeType.PERSIST)
    @NotNull(message = "Candy orders shouldn't be null")
    private List<CandyOrders> candyOrdersList;


    @Enumerated(EnumType.STRING)
    @NotNull(message = "Order status shouldn't be null")
    private ORDER_STATUS order_status = ORDER_STATUS.INPROGRESS;

    @NotNull
    private double amount;

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

    public List<CandyOrders> getCandyOrdersList() {
        return candyOrdersList;
    }

    public void setCandyOrdersList(List<CandyOrders> candyOrdersList) {
        this.candyOrdersList = candyOrdersList;
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
