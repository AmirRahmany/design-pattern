package org.examaple;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected PizzaIngredientFactory getIngredientFactory() {
        return new NYPizzaIngredientFactory();
    }
}
