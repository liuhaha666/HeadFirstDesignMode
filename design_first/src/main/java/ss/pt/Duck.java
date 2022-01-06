package ss.pt;

public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){
    }

    public void display(){};

    public void performFly(){
        flyBehavior.Fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float,even decoys");
    }
}
