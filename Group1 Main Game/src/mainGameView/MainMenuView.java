/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainGameView;

/**
 *
 * @author admin
 */
public class MainMenuView {
    private String menu;

    public MainMenuView() {
        this.menu = "/n"
                + "/n-------------------------------------"
                + "/n | Main Menu                        |"
                + "/n-------------------------------------"
                + "/nN - Start new game"
                + "/nG - Get and start saved game"
                + "/nH - Get help on how to play the game"
                + "/nS - Save Game"
                + "/nQ - Quit"
                + "/n-------------------------------------";
    }
    
    

    public void displayMainMenuView() {
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            done = this.doAction(menuOption);
        }while (!done);
    }

    private String getMenuOption() {
        System.out.println("/n*** getMenuOption() function called ***");
        return "N";
        
    }

    private boolean doAction(String menuOption) {
        System.out.println("/n*** doAction() function called ***");
        return true;
    }
}
    
       
    /*int inputValue = 0;
    do {
        System.out.print("Please enter an option:");
        inputValue = keyboard.nextInt();
        if(inputValue < 1 || inputValue > MAX)
        {
            System.out.printIn("Error: invalid option.");
        }
        } while(inputValue < 1 || inputValue > MAX);
    return inputValue;
    }*/
    
