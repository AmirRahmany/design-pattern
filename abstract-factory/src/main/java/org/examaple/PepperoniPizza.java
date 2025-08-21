package org.examaple;

public class PepperoniPizza extends Pizza {
    private final PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = ingredientFactory.getStyle() + " " +this.getClass().getSimpleName();
    }

    @Override
    void prepare() {
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
