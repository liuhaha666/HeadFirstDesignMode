package ss.pt;


public class decwithsize {
    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + String.format("%.2f", beverage.cost()));
        //Mocha.Whip相当于装饰器
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + String.format("%.2f", beverage2.cost()));
        //.89+.20+.20+.10
        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Beverage.Size.VENTI);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + String.format("%.2f", beverage3.cost()));
    }
}
