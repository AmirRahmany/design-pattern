package org.examaple;

import org.examaple.cheese.Mozzarella;
import org.examaple.clam.FrozenClam;
import org.examaple.dough.ThickCrustDough;
import org.examaple.sauce.PlumTomatoSauce;
import org.examaple.toppings.BlackOlives;
import org.examaple.toppings.EggPlant;
import org.examaple.toppings.Spinach;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new BlackOlives(),new EggPlant(),new Spinach()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FrozenClam();
    }

    @Override
    public String getStyle() {
        return "Chicago Style";
    }
}
