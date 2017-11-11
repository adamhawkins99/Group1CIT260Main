/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainGameControl;

import group1.main.game.Group1MainGame;
import mainGameModel.Crops;
import mainGameModel.Game;
import mainGameModel.Player;

/**
 *
 * @author admin
 */
public class GameControl {

    public static Player createPlayer(String name) {
        
        if (name == null){
        return null;}
        Player player = new Player();
        player.setName(name);
        Group1MainGame.setPlayer(player);
        return player;
    }
    public static void createCrops() {
    Crops theCrops = new Crops();
    
    theCrops.setYears(0);
    theCrops.setPopulation(95);
    theCrops.setNewPeople(5);
    theCrops.setCropYield(3);
    theCrops.setNumberWhoDied(0);
    theCrops.setPharoohsShare(200);
    theCrops.setWheatInStore(2800);
    theCrops.setAcres(1000);
    theCrops.setHarvest(0);
    theCrops.setPlanted(1000);
    theCrops.setFed(0);
    
    Group1MainGame.setCrops(theCrops);       
   } 
    public static void createNewGame()
{
     Game theGame = new Game();
     Group1MainGame.setGame(theGame);
}
}
