/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainGameView;

import java.util.Scanner;
//import static mainGameView.MainMenuView.getUserInput;

/**
 *
 * @author adam
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    protected int MAX;
    
    //public View() {
    //}
    public View(String message, int MAX) {
        this.displayMessage = message;
        this.MAX = MAX;
    }
    @Override
    public void display() {
        
       int option;
        
    do{

        System.out.println(displayMessage);
        option = getInput();
        doAction(option);
}while (option <=1 && option <MAX);
        }
    
@Override
public int getInput(){
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
}   while(inputValue < 1 || inputValue > MAX);

return inputValue;
    }
}
