package com.pizzeria.franchise;

import com.pizzeria.franchise.afactory.IPizzaIngredientFactory;

import java.util.Arrays;

public class SeaFoodPizza extends Pizza {
    private IPizzaIngredientFactory ingredientFactory;

    public SeaFoodPizza(IPizzaIngredientFactory ingredientFactory) {
        super("SeaFoodPizza");
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        super.prepare();
        this.ingredients.add(ingredientFactory.createDough());
        this.ingredients.add(ingredientFactory.createSouse());
        this.ingredients.add(ingredientFactory.createCheese());
        this.ingredients.add(ingredientFactory.createClams());
        this.ingredients.addAll(Arrays.asList(ingredientFactory.createVeggies()));
    }
}
