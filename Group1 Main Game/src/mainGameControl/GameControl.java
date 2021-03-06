/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainGameControl;

import group1.main.game.Group1MainGame;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import mainGameExceptions.GameControlExceptions;
import mainGameModel.Crops;
import mainGameModel.Game;
import mainGameModel.Map;
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
    public static int createNewGame(Player player)
{
    //game = create a new game object
     Game theGame = new Game();
     Group1MainGame.setGame(theGame);
     if(player==null){
     return -1;
     }
     theGame.setPlayer(player); //set player in the game
     Group1MainGame.setCurrentGame(theGame);//assign the game object to the current game attribute in the main class
     //map = createMap  (noOfRows, noOfColumns)
     Map theMap = new Map(5,5);
     //if map == null then
     //return -1
     //endif
     if (theMap==null){
         return -1;
         }
     //assign the map to the game
     theGame.setMap(theMap);
     //return 1 indicate success
     return 1;
     }

    public static void saveGame(Game currentGame, String filePath) 
            throws GameControlExceptions {
         
        try (FileOutputStream fops = new FileOutputStream(filePath)) {
        ObjectOutputStream output = new ObjectOutputStream(fops);
        output.writeObject(currentGame);
        }
        catch (Exception e){
        throw new GameControlExceptions (e.getMessage());
        }
    }

    public static void getExistingGame(String filePath) 
        throws GameControlExceptions {
        Game game = null;
        
        try(FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject();
        }
        catch(Exception e){
            throw new GameControlExceptions(e.getMessage());
        }
        Group1MainGame.setCurrentGame(game);
    }
}
