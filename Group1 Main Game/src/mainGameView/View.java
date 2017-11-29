/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainGameView;

import group1.main.game.Group1MainGame;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
//import static mainGameView.MainMenuView.getUserInput;

/**
 *
 * @author adam
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    protected int MAX;
    protected final BufferedReader keyboard = Group1MainGame.getInFile();
    protected final PrintWriter console = Group1MainGame.getOutFile();
    
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
}while (option!=MAX);
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
