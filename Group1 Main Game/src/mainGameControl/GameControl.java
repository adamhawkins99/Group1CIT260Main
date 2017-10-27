/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainGameControl;

import group1.main.game.Group1MainGame;
import mainGameModel.Player;

/**
 *
 * @author admin
 */
public class GameControl {

    public static Player createPlayer(String playerName) {
        
        if (playerName == null){
        return null;}
        Player player = new Player();
        player.setName(playerName);
        Group1MainGame.setPlayer(player);
        return player;
    }
    
}
