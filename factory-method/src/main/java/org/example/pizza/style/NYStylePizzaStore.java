package org.example.pizza.style;

import org.example.pizza.type.*;

import java.security.InvalidParameterException;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType type) {
        return switch (type) {
            case CHEESE -> new NYStyleCheesePizza();
            case VEGGIE -> new NYStyleVeggiePizza();
            case CLAM -> new NYStyleClamPizza();
            case PEPPERONI -> new NYStylePepperoniPizza();
        };
    }
}
