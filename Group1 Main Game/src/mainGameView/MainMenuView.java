/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainGameView;

import group1.main.game.Group1MainGame;
import java.util.Scanner;
import mainGameControl.GameControl;

/**
 *
 * @author admin
 */
public class MainMenuView extends View {

//private  String displayMessage;
//public int MAX = 5;
      
    public  MainMenuView() {
        //this.menu = 
          
            super("\n"
                + "\n-------------------------------------"
                + "\n | Main Menu                        |"
                + "\n-------------------------------------"
                + "\n1 - Start new game"
                + "\n2 - Get and start saved game"
                + "\n3 - Get help on how to play the game"
                + "\n4 - Save Game"
                + "\n5 - Quit"
                + "\n-------------------------------------", 5);
    }
    
        //public void displayMainMenu() {
       // int option;
        //int inputValue;
    //do
//{
//System.out.println(menu);
//option = getUserInput();
//doAction(option);
//}while (option != MAX);
       // }
//public static int getUserInput(){
//int inputValue = 0;
//Scanner keyboard = new Scanner(System.in);
//do
//{
//System.out.print("Please enter an option:");
//inputValue = keyboard.nextInt();
//if(inputValue < 1 || inputValue > MAX)
//{
//System.out.println("Error: invalid option.");
//}
//} while(inputValue < 1 || inputValue > MAX);


//return inputValue;

//}


@Override
public int doAction(int option) {
switch(option){
case 1: GameMenuView GameMenuView = new GameMenuView();
//calling createNewGame method (Irena)
int returnValue = GameControl.createNewGame(Group1MainGame.getPlayer());
if (returnValue<0){
System.out.println ("ERROR - Failed to create a new game");}
GameMenuView.display();
break;
case 2:
this.startExistingGame();
break;
case 3:HelpMenuView HelpMenuView = new HelpMenuView();
HelpMenuView.display();
break;
case 4:
this.saveGame();
break;
case 5:
this.quitGame();
break;
default:
System.out.println("\n** Invalid Selection. Try Again **");
break;

}
return option;
}

private void startNewGame() {
System.out.println("***The startNewGame() Method called***");
}

private void startExistingGame() {
System.out.println("***The startExistingGame() Method called***");
}

private void displayHelpMenu() {
System.out.println("***The displayHelpMenu() Method called***");
}

private void saveGame() {
this.console.println("\n\nEnter the file path for the file where the game"
                +"is to be saved.");
String filePath = this.getInputString();

try {
GameControl.saveGame(Group1MainGame.getCurrentGame(), filePath);
}catch (Exception ex){
ErrorView.display("MainMenuView", ex.getMessage());
        }
}

private void quitGame() {
System.out.println("***The quitGame() Method called***");
}
      
        public String getInputString(){
            boolean valid = false;
            String inputValue = null;
    //Scanner keyboard = new Scanner(System.in);
    try {
    while (!valid)
{
    this.console.println("Please enter an option:");
    inputValue = this.keyboard.readLine();
    if(inputValue.length() <1 )
{
    ErrorView.display(this.getClass().getName(), "Error: invalid option.");
    continue;
}
    break;
}   

    }
 catch (Exception e) {
     ErrorView.display(this.getClass().getName(), "Error reading input:" + e.getMessage());
 }
    return inputValue;
}
}
 