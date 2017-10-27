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

    public void displayStartProgramView() {
        boolean done = false;
        do{
       String playersName = this.getPlayersName();
        if (playersName.toUpperCase().equals("Q"))
            return;
        done=this.doAction(playersName);
    } while (!done);
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

    private boolean doAction(String playersName) {
        Player player = GameControl.createPlayer(playersName);
        if (player == null) {
        System.out.println("\nError creating the player.");
            return false;
        }
        this.displayNextView(player);
    return true;
    }

    private void displayNextView(Player player) {
         MainMenuView.displayMainMenu();
         System.out.println("Goodbye "+player.getName()+ ", thanks for playing");
         }
}
   
