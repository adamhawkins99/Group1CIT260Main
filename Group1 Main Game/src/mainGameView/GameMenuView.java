/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainGameView;

import group1.main.game.Group1MainGame;
import java.util.Scanner;
import mainGameModel.Crops;
import mainGameModel.Game;
import mainGameModel.Location;
import mainGameModel.Map;

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
    
    @Override
public int doAction(int option) {
switch(option){
case 1:     
this.displayMap();
//this.viewMap();
break;
case 2:ListView ListView = new ListView();
    ListView.display(); 
this.viewList();
break;
case 3:
this.moveLocation();
break;
case 4:
this.manageCrops();
break;
case 5:MainMenuView MainMenuView = new MainMenuView();
    MainMenuView.display();
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
public void displayMap(){
 Game game = Group1MainGame.getCurrentGame();
 Map theMap=game.getMap();

 System.out.println("               ********** Egypt***********           ");
 System.out.println("   0   1   2   3   4");
 for (int row = 0; row< 5; row++){
 System.out.print("\n----------------------");
 System.out.println("       ");
 System.out.print(row);
 for (int column = 0; column<5; column++){
  System.out.print("|");  
 Location location = theMap.getLocations(row,column);
 System.out.print(location.getSymbol());
 
  }

 
 }
 
        }

private void viewList() {
System.out.println("***The viewList() Method called***");
}

private void moveLocation() {
System.out.println("***The moveLocation() Method called***");
}

private void manageCrops() {
Crops theCrop = Group1MainGame.getCrops();
      System.out.println('\n');
      
      CropsView.buyLandView(theCrop);
      CropsView.sellLandView(theCrop);
      CropsView.feedPeopleView(theCrop);
      CropsView.plantLandView(theCrop);
}

private void mainMenuView() {
System.out.println("***The mainMenuView() Method called***");
}
}
 