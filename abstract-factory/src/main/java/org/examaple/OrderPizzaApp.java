package org.examaple;

public class OrderPizzaApp {

    public static void main(String[] args) {
        final PizzaStore chicagoPizza = new ChicagoPizzaStore();

        final Pizza chicagoCheesePizza = chicagoPizza.orderPizza(PizzaType.CHEESE);
        System.out.println("Ethan ordered a " + chicagoCheesePizza.getName() + "\n");


        final PizzaStore nyPizza = new NYPizzaStore();
        final Pizza nyCheesePizza = nyPizza.orderPizza(PizzaType.CHEESE);
        System.out.println("mary ordered a " + nyCheesePizza.getName());
    }
}
