package org.examaple;

import org.examaple.cheese.ReggianoCheese;
import org.examaple.clam.FreshClam;
import org.examaple.dough.ThinCrustDough;
import org.examaple.sauce.MarinaraSauce;
import org.examaple.toppings.Garlic;
import org.examaple.toppings.Mushroom;
import org.examaple.toppings.Onion;
import org.examaple.toppings.RedPeper;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(),new Onion(),new Mushroom(),new RedPeper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }

    @Override
    public String getStyle() {
        return "New York Style";
    }
}
