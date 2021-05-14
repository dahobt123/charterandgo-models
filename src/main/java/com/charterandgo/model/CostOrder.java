package com.charterandgo.model;

import java.util.ArrayList;
import java.util.List;

public class CostOrder {

    private List<OrderDetails> options = new ArrayList<>();

    public CostOrder() {

    }

    public List<OrderDetails> getOrderDetails() {
        return options;
    }

    public void setOrderDetails(List<OrderDetails> orderDetails) {
        this.options = orderDetails;
    }
}
