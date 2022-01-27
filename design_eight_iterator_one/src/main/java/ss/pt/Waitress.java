package ss.pt;

import java.util.List;
/*
*20220122。本程序存在问题，PancakeHouseMenu和DinerMenu都属于menu,
* 但没有设计共同的接口
* */
public class Waitress {
    PancakeHouseMenu pancakeHouseMenu ;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu , DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();

        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
    public  void printVegetarianMenu(){}

    public void isItemVegetarian(){}
}
