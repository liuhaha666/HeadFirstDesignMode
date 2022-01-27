package ss.pt;

import java.util.Arrays;
import java.util.List;

/*
* 正常排序需要实现mergesort
* 使用模板方法排序，只需要实现compareTo就行
* */
public class testtwo {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu,dinerMenu);
        waitress.printMenu();
    }
}