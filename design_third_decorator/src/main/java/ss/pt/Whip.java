package ss.pt;

public class Whip extends CondimentDecorator{
    Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription() + " whip";
    }
    public double cost(){
        return .30 + beverage.cost();
    }
}
