package com.pizzeria.franchise;

import java.util.ArrayList;

public abstract class Pizza {

    protected ArrayList<Ingredient> ingredients;
    private String name;

    public Pizza(String name) {
        this.name = name;
        this.ingredients = new ArrayList<>();
    }

    public void prepare() {
        System.out.println("preparing...");
    }

    public void bake() {
        System.out.println("baking...");
    }

    public void cut() {
        System.out.println("cutting...");
    }

    public void box() {
        System.out.println("wrapping up...");
    }


    public String getName() {
        return name;
    }
}