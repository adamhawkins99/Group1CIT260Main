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
        
        View.console.println(
        "\n*****************************************************************************************"
         +"*\n*                                                             *"
        +"\nWelcome to Pharaoh’s court. You have been summoned here to assume your new role"
        +"\nas Agricultural Overseer. You report directly to Joseph, Pharaoh’s Vizier. "
        +"\nYour responsibility is to gather the grain from the harvest,provide enough food "
        +"\nto the people so they do not go hungry, and reserve the rest in Pharaoh’s granary"
        +"\nin preparation for the prophesied famine that is to come in seven years."
        +"\nYou need to know how to plant crops, develop land, feed the people and store the excess."
        +"\nIf you fail to provide enough food for the people,the people will starve. Some people"
        +"\nwill die. Your workforce will be diminished, and you will not have enough workers to plant"
        +"\nand harvest crops. Pharaoh is not be pleased with those who fail him. Those who fail are"
        +"\nthrown in prison. He's not very nice to prisoners -- just ask the Royal Baker. "
        +"\nOh, you can't because he's not around anymore. RIP."
        +"\n"
        +"\nBe wise and you will be successful..."
                
        +"\n***************************************************************************************");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public static void displayStartProgramView()
    {
        String playersName = getPlayersName();
        Player player =GameControl.createPlayer(playersName);
        GameControl.createCrops();
        GameControl.createNewGame(player);
        
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
   
