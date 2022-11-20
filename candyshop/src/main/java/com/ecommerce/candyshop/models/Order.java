package com.ecommerce.candyshop.models;

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

    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<OrderLine> orderLineList;


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

    public List<OrderLine> getCandyOrdersList() {
        return orderLineList;
    }

    public void setCandyOrdersList(List<OrderLine> orderLineList) {
        this.orderLineList = orderLineList;
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
