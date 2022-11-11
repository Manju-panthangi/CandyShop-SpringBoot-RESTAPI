package com.ecommerce.candyshop.models;

import java.util.ArrayList;

public class OrderRequest {

    private String phoneNumber;
    private ArrayList<CandyQuantityPair> candyQuantityPairList;


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<CandyQuantityPair> getCandyQuantityPairList() {
        return candyQuantityPairList;
    }

    public void setCandyQuantityPairList(ArrayList<CandyQuantityPair> candyQuantityPairList) {
        this.candyQuantityPairList = candyQuantityPairList;
    }
}
