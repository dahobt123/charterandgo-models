package com.charterandgo.model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class CostOrder {

    private int orderId;
    private List<OrderItem> orderItems = new ArrayList<>();

    public CostOrder() {

    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("orderId", orderId);
        JSONArray array = new JSONArray();
        for (OrderItem item : orderItems) {
            array.put(item.toJson());
        }
        obj.put("orderItems", array);
        return obj;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<OrderItem> getOptions() {
        return orderItems;
    }

    public void setOptions(List<OrderItem> options) {
        this.orderItems = options;
    }
}
