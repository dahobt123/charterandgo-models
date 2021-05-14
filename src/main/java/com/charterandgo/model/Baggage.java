package com.charterandgo.model;

import java.util.ArrayList;
import java.util.List;

public class Baggage {

    private String type;
    private String tagId;
    private int width;
    private int height;
    private int itemId;
    private int length;
    private int weight;
    private List<Integer> linkedToPax = new ArrayList<>();
    private List<Integer> linkedToOrderItems = new ArrayList<>();
    private String specialInstructions;
    private String finalDestination;




    public Baggage() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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

    public String getSpecialInstructions() {
        return specialInstructions;
    }

    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    public String getFinalDestination() {
        return finalDestination;
    }

    public void setFinalDestination(String finalDestination) {
        this.finalDestination = finalDestination;
    }
}
