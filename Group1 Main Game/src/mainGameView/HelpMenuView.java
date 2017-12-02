/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainGameView;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class HelpMenuView extends View {
     
    //private static final int MAX = 6;
    public HelpMenuView (){
    super("\n-------------------------------------"
             + "\n | Help Menu                        |"
             + "\n-------------------------------------"
             + "\n1 -- What is the goal of the game?"
             + "\n2 -- Who is Joseph of Eqypt?"
             + "\n3 -- How do I view the map?"
             + "\n4 -- How do I move to another location?"
             + "\n5 -- How do I display a list of available resources?"
             + "\n6 -- Return to the Main Menu", 6);
    }
    

              
    
  

    @Override
    public int doAction(int option) {
         switch(option){
            case 1: 
                View.console.println("Your responsibility is to gather the grain from the harvest, provide enough food to the people so they do not go hungry, and reserve the rest in Pharaoh’s granary in preparation for the prophesied famine that is to come in seven years.");
                break;
           
            case 2: 
                View.console.println("Joseph of Egypt is responsible for ensuring that enough crops are stored to survice the years of famine.");
                break;
            
            case 3: 
                View.console.println("View the map by pressing xxx");
                break;
            
            case 4: 
                View.console.println("Move to another location by pressing xxx");
                break;
            
            case 5: 
                View.console.println("To view your current list of recourse use xxx");
                break;
            
            case 6: MainMenuView MainMenuView = new MainMenuView();
                    MainMenuView.display();
                break;
        }
        return option;
        
    }   
    
}

