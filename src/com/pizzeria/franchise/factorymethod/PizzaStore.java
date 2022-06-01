package com.pizzeria.franchise.factorymethod;

import com.pizzeria.franchise.Pizza;

public abstract class PizzaStore {

        public Pizza orderPizza(int type) {

            Pizza pizza = createPizza(type);

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
            return pizza;
        }

        abstract Pizza createPizza(int type);

}
