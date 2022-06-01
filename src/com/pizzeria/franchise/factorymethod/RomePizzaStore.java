package com.pizzeria.franchise.factorymethod;

import com.pizzeria.franchise.CheesePizza;
import com.pizzeria.franchise.Pizza;
import com.pizzeria.franchise.SeaFoodPizza;
import com.pizzeria.franchise.afactory.IPizzaIngredientFactory;
import com.pizzeria.franchise.afactory.ItalianPizzaIngredientFactory;

public class RomePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(int type) {
        Pizza pizza;
        IPizzaIngredientFactory ingredientFactory = new ItalianPizzaIngredientFactory();

        pizza = switch (type) {
            case 0 -> new CheesePizza(ingredientFactory);
            case 1 -> new SeaFoodPizza(ingredientFactory);
            default -> new CheesePizza(ingredientFactory);
        };

        return pizza;
    }

}