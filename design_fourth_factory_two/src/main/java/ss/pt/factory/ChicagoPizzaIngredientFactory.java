package ss.pt.factory;

import ss.pt.taste.*;
import ss.pt.cheese.MozzarellaCheese;
import ss.pt.clam.FrozenClams;
import ss.pt.dough.ThickCrustDough;
import ss.pt.pepperoni.SlicedPepperoni;
import ss.pt.sauce.PlumTomatoSauce;

import ss.pt.veggie.BlackOlives;
import ss.pt.veggie.Eggplant;
import ss.pt.veggie.Spinach;

public class ChicagoPizzaIngredientFactory
        implements PizzaIngredientFactory
{

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new BlackOlives(),
                new Spinach(),
                new Eggplant() };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}
