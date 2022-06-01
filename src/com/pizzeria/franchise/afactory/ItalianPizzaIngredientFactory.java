package com.pizzeria.franchise.afactory;

import com.pizzeria.franchise.Ingredient;

public class ItalianPizzaIngredientFactory implements IPizzaIngredientFactory {
    @Override
    public Ingredient createDough() {
        return new Ingredient("Italian dough");
    }

    @Override
    public Ingredient createSouse() {
        return new Ingredient("Tomato souse");
    }

    @Override
    public Ingredient createCheese() {
        return new Ingredient("Parmesan");
    }

    @Override
    public Ingredient[] createVeggies() {
        return new Ingredient[]{new Ingredient("Parsley"),new Ingredient("Olives"),new Ingredient("Pepper") };
    }

    @Override
    public Ingredient createClams() {
        return new Ingredient("Adriatic clams");
    }
}
