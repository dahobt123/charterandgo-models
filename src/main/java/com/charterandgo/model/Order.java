package com.charterandgo.model;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<CostOrder> options = new ArrayList<>();

    private Order() {

    }

    public List<CostOrder> getOptions() {
        return options;
    }

    public void setOptions(List<CostOrder> options) {
        this.options = options;
    }
}
