package com.charterandgo.model;

import java.util.ArrayList;
import java.util.List;

public class Food {

    private String code;
    private String type;
    private int itemId;
    private int quantity;
    private List<Integer> linkedToPax = new ArrayList<>();
    private List<Integer> linkedToOrderItems = new ArrayList<>();

    public Food() {

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<Integer> getLinkedToPax() {
        return linkedToPax;
    }

    public void setLinkedToPax(List<Integer> linkedToPax) {
        this.linkedToPax = linkedToPax;
    }

    public List<Integer> getLinkedToOrderItems() {
        return linkedToOrderItems;
    }

    public void setLinkedToOrderItems(List<Integer> linkedToOrderItems) {
        this.linkedToOrderItems = linkedToOrderItems;
    }
}
