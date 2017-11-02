/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainGameView;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class MainMenuView {

private  String menu;
private static final int MAX = 5;
      
    public  MainMenuView() {
        this.menu = "\n"
                + "\n-------------------------------------"
                + "\n | Main Menu                        |"
                + "\n-------------------------------------"
                + "\n1 - Start new game"
                + "\n2 - Get and start saved game"
                + "\n3 - Get help on how to play the game"
                + "\n4 - Save Game"
                + "\n5 - Quit"
                + "\n-------------------------------------";
    }
    
        public void displayMainMenu() {
        int option;
        //int inputValue;
    do
{
System.out.println(menu);
option = getUserInput();
doAction(option);
}while (option != MAX);
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

}


public int doAction(int option) {
switch(option){
case 1:     
this.startNewGame();
break;
case 2:
this.startExistingGame();
break;
case 3:
this.displayHelpMenu();
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
System.out.println("***The saveGame() Method called***");
}

private void quitGame() {
System.out.println("***The quitGame() Method called***");
}
}
 