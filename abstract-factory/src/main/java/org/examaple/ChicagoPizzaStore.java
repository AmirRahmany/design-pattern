package org.examaple;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected PizzaIngredientFactory getIngredientFactory() {
        return new ChicagoPizzaIngredientFactory();
    }
}
