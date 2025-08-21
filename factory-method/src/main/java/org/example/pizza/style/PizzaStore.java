package org.example.pizza.style;

import org.example.pizza.type.Pizza;
import org.example.pizza.type.PizzaType;

public abstract class PizzaStore {

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }


    //factory-method
    protected abstract Pizza createPizza(PizzaType type);
}
