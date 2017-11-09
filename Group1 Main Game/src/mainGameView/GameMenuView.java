/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainGameView;

import java.util.Scanner;

/**
 *
 * @author Erin <erinisireland@gmail.com>
 */

public class GameMenuView extends View {

//private  String menu;
//private static final int MAX = 6;
      
    public  GameMenuView() {
        super("\n"
                + "\n-------------------------------------"
                + "\n | Game Menu                        |"
                + "\n-------------------------------------"
                + "\n1 - View the map"
                + "\n2 - View a list"
                + "\n3 - Move to a new location"
                + "\n4 - Manage the crops"
                + "\n5 - Back to the Main Menu"
                + "\n-------------------------------------", 6);
    }
    /*public void displayGameMenu() {
        int option;
        //int inputValue;
        do
{
    System.out.println(menu);
        option = getUserInput();
        doAction(option);
        }while (option <=1 && option <MAX);
        }

    public static int getUserInput(){
        int inputValue = 0;
        Scanner keyboard = new Scanner(System.in);
        do
    {
    System.out.print("Please enter an option:");
        inputValue = keyboard.nextInt();
        if(inputValue < 1 || inputValue > MAX)
        {
    System.out.println("Error: invalid option.");
        }
    } while(inputValue < 1 || inputValue > MAX);


    return inputValue;

}*/
    @Override
public int doAction(int option) {
switch(option){
case 1:     
this.viewMap();
break;
case 2:
this.viewList();
break;
case 3:
this.moveLocation();
break;
case 4:
CropsView.buyLandView();
CropsView.sellLandView();
CropsView.feedPeopleView();
break;
case 5:
this.mainMenuView();
break;
default:
System.out.println("\n** Invalid Selection. Try Again **");
break;

}
return option;
}

private void viewMap() {
System.out.println("***The viewMap() Method called***");
}

private void viewList() {
System.out.println("***The viewList() Method called***");
}

private void moveLocation() {
System.out.println("***The moveLocation() Method called***");
}

private void manageCrops() {
System.out.println("***The manageCrops() Method called***");
}

private void mainMenuView() {
System.out.println("***The mainMenuView() Method called***");
}
}
 