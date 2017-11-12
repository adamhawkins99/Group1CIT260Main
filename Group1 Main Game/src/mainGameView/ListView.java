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

    public String getDisplayMessage() {
        return displayMessage;
    }

    @Override
    public int getInput() {
        return super.getInput(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
    }

    public void setDisplayMessage(String displayMessage) {
        this.displayMessage = displayMessage;
    }

    public int getMAX() {
        return MAX;
    }

    public void setMAX(int MAX) {
        this.MAX = MAX;
    }

    @Override
    public int doAction(int option) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
