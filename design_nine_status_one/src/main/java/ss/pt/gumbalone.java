package ss.pt;

import java.util.Arrays;
import java.util.List;

/*
* 正常排序需要实现mergesort
* 使用模板方法排序，只需要实现compareTo就行
* */
public class gumbalone {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(2);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        //投入25美分之后，是有25美分状态
        //有25美分  turnCrank setState SoldState  dispensing a gumball
        //dispense releaseBall
        //还有1颗糖果。变为 getNoQuarterState
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        System.out.println("---");
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//
//        gumballMachine.refill(5);
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//
//        System.out.println(gumballMachine);
    }
}