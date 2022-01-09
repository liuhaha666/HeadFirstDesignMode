package ss.pt;

public abstract class Beverage {
    String description = "Unkown Beverage";
    int size = 0;
    public String getDescription(){
        return  description;
    }

    public  abstract  double cost();


}
