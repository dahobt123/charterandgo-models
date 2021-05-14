package com.charterandgo.model;

import java.util.ArrayList;
import java.util.List;

public class ShopLists {
    private List<Pet> pets = new ArrayList<>();
    private List<Food> foods = new ArrayList<>();
    private List<Cargo> cargos = new ArrayList<>();
    private List<Baggage> baggages = new ArrayList<>();

    public ShopLists() {

    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    public List<Cargo> getCargos() {
        return cargos;
    }

    public void setCargos(List<Cargo> cargos) {
        this.cargos = cargos;
    }

    public List<Baggage> getBaggages() {
        return baggages;
    }

    public void setBaggages(List<Baggage> baggages) {
        this.baggages = baggages;
    }
}
