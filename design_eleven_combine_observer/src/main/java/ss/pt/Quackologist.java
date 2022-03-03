package ss.pt;

public class Quackologist implements Observer {

    public void update(QuackObservable duck) {

        System.out.println("update second");

        System.out.println("Quackologist: " + duck + " just quacked.");
    }

    public String toString() {
        return "Quackologist";
    }
}
