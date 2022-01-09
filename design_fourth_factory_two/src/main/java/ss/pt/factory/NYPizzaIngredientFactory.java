package ss.pt.factory;

import ss.pt.taste.*;
import ss.pt.Pizza;
import ss.pt.cheese.ReggianoCheese;
import ss.pt.clam.FreshClams;
import ss.pt.dough.ThinCrustDough;
import ss.pt.pepperoni.SlicedPepperoni;
import ss.pt.sauce.MarinaraSauce;
import ss.pt.taste.RedPepper;
import ss.pt.veggie.Garlic;
import ss.pt.veggie.Mushroom;
import ss.pt.veggie.Onion;


public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }
}

