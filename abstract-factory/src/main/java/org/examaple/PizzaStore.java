package org.examaple;

public abstract class PizzaStore {

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    private Pizza createPizza(PizzaType type) {
        final var ingredientFactory = getIngredientFactory();

        return switch (type) {
            case CHEESE -> new CheesePizza(ingredientFactory);
            case VEGGIE -> new VeggiePizza(ingredientFactory);
            case CLAM -> new ClamPizza(ingredientFactory);
            case PEPPERONI -> new PepperoniPizza(ingredientFactory);
        };
    }

    protected abstract PizzaIngredientFactory getIngredientFactory();
}
