/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group1.main.game;

import mainGameModel.Crops;
import mainGameModel.Player;

/**
 *
 * @author adam
 */
public class Group1MainGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player ();
        
        playerOne.setName("Irena Kyman");
        
        String  playerOneName = playerOne.getName();
        
        System.out.println(playerOne.toString());
        
        Crops currentYear = new Crops ();
        
        currentYear.setNewPeople(5);
        currentYear.setNumberWhoDied(10);
        
        System.out.println(currentYear.toString());
    }
    
}
