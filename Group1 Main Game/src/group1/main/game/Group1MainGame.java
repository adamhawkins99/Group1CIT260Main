/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group1.main.game;

import mainGameModel.Crops;
import mainGameModel.Game;
import mainGameModel.Player;
import mainGameView.StartProgramView;

/**
 *
 * @author adam
 */
public class Group1MainGame {
    
    private static Game currentGame = null;
    private static Player player = null;
    private static Crops theCrops = null;
    private static Game Game = null;
    
public static void main(String[] args) {

StartProgramView startProgramView = new StartProgramView();
startProgramView.displayStartProgramView();
}

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Group1MainGame.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Group1MainGame.player = player;
    }

    //public static void setCrops(Crops theCrops) {
      //  System.out.println("/n*** setCrops method called***");
    //}

    public static Game getGame() {
        return Game;
    }

    public static Crops getCrops() {
        return theCrops;
    }
    
    public static void setCrops(Crops _cropRef) {
        theCrops = _cropRef;
    }

    public static void setGame(Game theGame) {
        Game=theGame;
    }

}