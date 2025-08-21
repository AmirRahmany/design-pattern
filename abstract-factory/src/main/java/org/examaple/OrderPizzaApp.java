package org.examaple;

public class OrderPizzaApp {

    public static void main(String[] args) {
        final PizzaStore nyPizzaStore = new NYPizzaStore();
        final PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        final Pizza nyCheesePizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + nyCheesePizza.getName()+"\n");

        final Pizza chicagoCheesePizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("mary ordered a " + chicagoCheesePizza.getName());
    }
}
