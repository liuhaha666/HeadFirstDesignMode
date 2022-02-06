package ss.pt;
/*
* 卖糖状态--->可以分发糖果
* 1.还有剩余糖果---->没钱
* 2.没有剩余糖果---->soldOut状态
* */
public class SoldState implements State {

    private static final long serialVersionUID = 2L;
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    public void dispense() {
        gumballMachine.releaseBall();
        try {
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        return "dispensing a gumball";
    }
}