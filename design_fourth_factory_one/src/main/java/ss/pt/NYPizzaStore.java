package ss.pt;

public class NYPizzaStore extends PizzaStore{
    Pizza createPizza(String item){
        if(item.equals("cheese")){
            return new NYStyleCheesePizza();
        }else if (item.equals("veggie")){
            return new NYStyleCheesePizza();
        }else if (item.equals("clam")){
            return new NYStyleCheesePizza();
        }else if (item.equals("pepperoni")){
            return new NYStyleCheesePizza();
        }else return null;
    }
}
