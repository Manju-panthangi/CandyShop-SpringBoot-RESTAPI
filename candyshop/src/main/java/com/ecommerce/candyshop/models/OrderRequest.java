package com.ecommerce.candyshop.models;

public class OrderRequest {

    private String phoneNumber;
    private Long candieId;
    private  int quantity;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getCandieId() {
        return candieId;
    }

    public void setCandieId(Long candieId) {
        this.candieId = candieId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
