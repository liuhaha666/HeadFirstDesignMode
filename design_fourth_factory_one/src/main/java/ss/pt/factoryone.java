package ss.pt;


public class factoryone {
    public static void main(String args[]) {
        //System.out.println("hi");
        PizzaStore nyStore  = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.createPizza("cheese");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

    }
}
