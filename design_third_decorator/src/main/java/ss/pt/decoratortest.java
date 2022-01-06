package ss.pt;



public class decoratortest {
    public static void main(String[] args) throws Exception {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "$" + beverage.cost());
        //一种饮料类型DarkRoast
        Beverage beverage1 = new DarkRoast();
        //Mocha.whip可以理解为装饰器
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + "$" + beverage1.cost());
        //一种饮料类型HouseBlend
        Beverage beverage2 = new HouseBlend();
        //Soy.Mocha.whip可以理解为装饰器
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + "$" + beverage2.cost());


    }
}
