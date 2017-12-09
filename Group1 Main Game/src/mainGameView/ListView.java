/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainGameView;


/**
 *
 * @author Erin Smith <erinisireland@gmail.com>
 */
public class ListView extends View{
    public ListView() {
     super("\n-------------------------------------"
             + "\n | Lists                       |"
             + "\n-------------------------------------"
             + "\n1 -- How many acres do I have?"
             + "\n2 -- How much have I sent to Joseph in Egypt?"
             + "\n3 -- What is my current population?"
             + "\n4 -- How many new people do I have?"
             + "\n5 -- How many people have died?"
             + "\n6 -- What year am I on?"
             + "\n7 -- How much wheat do I have in store?"
             + "\n8 -- Return to the Main Menu" 
             + "\n -------------------------------", 9);
    }

   @Override
    public int doAction(int option) {
         switch(option){
            case 1: 
                View.console.println("Great question! Ask another.");
                break;
           
            case 2: 
                View.console.println("What Joseph doesn't know won't hurt him...");
                break;
            
            case 3: 
                View.console.println("You...plus...the people you're over.");
                break;
            
            case 4: 
                View.console.println("We'll check on that for you. Be sure to make them feel welcome.");
                break;
            
            case 5: 
                View.console.println("Gosh! I hope none! Have you been taking care of your people??");
                break;
            case 6:
                View.console.println("You're a Senior! You're so close!");
            case 7:
                View.console.println("There's wheat in the store! Sign me up!");
            case 8: MainMenuView MainMenuView = new MainMenuView();
                    MainMenuView.display();
                break;
        }
        return option;
        
    }   
      
    
}
