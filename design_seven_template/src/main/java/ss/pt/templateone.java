package ss.pt;


import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class templateone {
    public static void main(String args[]) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
    }
}
