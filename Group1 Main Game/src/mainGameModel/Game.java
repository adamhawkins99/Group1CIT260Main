/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainGameModel;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public class Game implements Serializable{
    //data that are the objects
    private double totalTime;
    private int noPeople;
    private Player player;
    private Crops crops;
    private Map map;
    
    //default costructor
    public Game() {
    }
    
    
    //Get and sets for each of the value objects.
    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public int getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(int noPeople) {
        this.noPeople = noPeople;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", noPeople=" + noPeople + ", player=" + player + '}';
    }

    //public Crops getCrops() {
      //  return theCrops;
    //}

    //public void setCrops(Crops _cropRef) {
     //   theCrops = _cropRef;
    //}

    public Crops getCrop() {
        return crops;
    }
    
    
    
    
}
