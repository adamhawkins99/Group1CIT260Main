/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainGameView;

import java.util.Scanner;
import mainGameControl.GameControl;
import mainGameModel.Player;

/**
 *
 * @author admin
 */
public class StartProgramView {
    private String promptMessage;
    
    public StartProgramView(){
    
        this.promptMessage="\nPlease enter your name: ";
        
        this.displayBanner();
    }

    private void displayBanner() {
        
        System.out.println(
        "\n******************************************************************"
         +"*\n*                                                             *"
        +"\nWelcome to Pharaoh’s court. You have been summoned here to assume your new role as Agricultural Overseer."
        +"\n*****************************************************************");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public static void displayStartProgramView()
    {
        String playersName = getPlayersName();
        GameControl.createPlayer(playersName);
        GameControl.createCrops();
        
        System.out.println("\n\n\n\n");
        System.out.println(playersName + ", you have been appointed Overseer for your");
        System.out.println("village. Tread carefully, if your people are not fed well");
        System.out.println("you may lose your head.");
        
        displayNextView();
    }
    public static void displayNextView() {
        MainMenuView mainMenuView = new MainMenuView();
         mainMenuView.display();
         System.out.println("Goodbye... thanks for playing.");
         }
    public static String getPlayersName() {
        String playerName = "";
        Scanner keyboard  = new Scanner(System.in);
        do
        {
            System.out.print("Please enter your name: ");
        playerName = keyboard.nextLine();
        playerName = playerName.trim();
        if(playerName.length() < 2) // must have at least 2 characters
                System.out.println("Invalid input: name must be at least 2 characters");
            
        } while(playerName.length() < 2);  // must have at least 2 characters
        
        return playerName;

    }

    
}
   
