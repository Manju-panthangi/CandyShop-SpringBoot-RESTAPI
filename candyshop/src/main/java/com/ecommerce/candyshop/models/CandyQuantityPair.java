package com.ecommerce.candyshop.models;

public class CandyQuantityPair {

    private Long candieId;
    private  int quantity;

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
