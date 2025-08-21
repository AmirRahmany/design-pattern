package org.example;

import org.example.pizza.style.ChicagoStylePizzaStore;
import org.example.pizza.style.NYStylePizzaStore;
import org.example.pizza.style.PizzaStore;
import org.example.pizza.type.PizzaType;

public class OrderPizzaApp {
    public static void main(String[] args) {
        System.out.println("Chicago style");
        final PizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();
        chicagoStylePizzaStore.orderPizza(PizzaType.CHEESE);

        System.out.println("NyStyle");
        final PizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        nyStylePizzaStore.orderPizza(PizzaType.PEPPERONI);
    }
}