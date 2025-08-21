package org.example.pizza.style;

import org.example.pizza.type.*;

import java.security.InvalidParameterException;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType type) {
        return switch (type) {
            case CHEESE -> new ChicagoStyleCheesePizza();
            case VEGGIE -> new ChicagoStyleVeggiePizza();
            case CLAM -> new ChicagoStyleClamPizza();
            case PEPPERONI -> new ChicagoStylePepperoniPizza();
        };
    }
}
