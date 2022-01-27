package ss.pt;

import java.util.Iterator;
import java.util.List;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu ;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu , DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        for(int i=0;i<pancakeHouseMenu.menuItems.size();i++){
            MenuItem menuItem = (MenuItem) pancakeHouseMenu.menuItems.get(i);
            System.out.println(menuItem.getName()+" ");
            System.out.println(menuItem.getPrice()+ " ");
            System.out.println(menuItem.getDescription());
        }

        for(int i=0;i<dinerMenu.menuItems.length;i++){
            MenuItem menuItem = dinerMenu.menuItems[i];
            System.out.println(menuItem.getName()+" ");
            System.out.println(menuItem.getPrice()+ " ");
            System.out.println(menuItem.getDescription());
        }
    }
    public  void printVegetarianMenu(){

    }


    public void isItemVegetarian(){

    }
}
