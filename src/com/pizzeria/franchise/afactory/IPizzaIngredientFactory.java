package com.pizzeria.franchise.afactory;

import com.pizzeria.franchise.Ingredient;

public interface IPizzaIngredientFactory {
    Ingredient createDough();
    Ingredient createSouse();
    Ingredient createCheese();
    Ingredient[] createVeggies();
    Ingredient createClams();
}
