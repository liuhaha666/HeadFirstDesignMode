package ss.pt;


import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class templatetwo {
    public static void main(String args[]) {
        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\nMaking tea...");
        teaHook.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffeeHook.prepareRecipe();

    }
}
