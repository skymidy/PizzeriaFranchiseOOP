package com.pizzeria.franchise;

import com.pizzeria.franchise.afactory.IPizzaIngredientFactory;

public class CheesePizza extends Pizza {
    private IPizzaIngredientFactory ingredientFactory;

    public CheesePizza(IPizzaIngredientFactory ingredientFactory) {
        super("CheesePizza");
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        super.prepare();
        this.ingredients.add(ingredientFactory.createDough());
        this.ingredients.add(ingredientFactory.createSouse());
        this.ingredients.add(ingredientFactory.createCheese());
    }
}
