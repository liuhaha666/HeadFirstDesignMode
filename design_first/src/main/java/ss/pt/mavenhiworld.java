package ss.pt;


class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new Flywithwings();
    }

    @Override
    public void display() {
        System.out.println("real MallardDuck");
    }
}

public class mavenhiworld {
    public static void main(String[] args) throws Exception {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}
