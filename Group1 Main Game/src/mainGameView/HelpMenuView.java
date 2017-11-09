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
public class HelpMenuView {
     private static final int MAX = 6;
    

    private static final String HELP_MENU = 
               "\n-------------------------------------"
             + "\n | Help Menu                        |"
             + "\n-------------------------------------"
             + "\n1 -- What is the goal of the game?"
             + "\n2 -- Who is Joseph of Eqypt?"
             + "\n3 -- How do I view the map?"
             + "\n4 -- How do I move to another location?"
             + "\n5 -- How do I display a list of available resources?"
             + "\n6 -- Return to the Main Menu";
    
  

    public static void displayHelpMenuView() {
        
        int option;
        do{
            System.out.println(HELP_MENU);
            option = getMenuOption();
            doAction(option);
        }while(option != MAX);
        
        
    }
    
   
    
    private static int getMenuOption(){
        int inputValue;
        Scanner keyboard = new Scanner(System.in);
        do
        {
          System.out.print("Please make a selection:");
          inputValue = keyboard.nextInt();
          //inputValue = doAction(inputValue);
          if(inputValue < 1 || inputValue > MAX)
          {
              System.out.println("Error: Please Enter a Valid Response.");
          }
        } while(inputValue < 1 || inputValue > MAX);
        
        return inputValue;
        
    }

    public static int doAction(int option) {
         switch(option){
            case 1: 
                System.out.println("Your responsibility is to gather the grain from the harvest, provide enough food to the people so they do not go hungry, and reserve the rest in Pharaoh’s granary in preparation for the prophesied famine that is to come in seven years.");
                break;
           
            case 2: 
                System.out.println("Joseph of Egypt is responsible for ensuring that enough crops are stored to survice the years of famine.");
                break;
            
            case 3: 
                System.out.println("View the map by pressing xxx");
                break;
            
            case 4: 
                System.out.println("Move to another location by pressing xxx");
                break;
            
            case 5: 
                System.out.println("To view your current list of recourse use xxx");
                break;
            
            case 6: MainMenuView MainMenuView = new MainMenuView();
                    MainMenuView.display();
                break;
        }
        return option;
        
    }
}

