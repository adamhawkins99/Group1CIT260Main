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
public class Crops implements Serializable {
    
    private int years;
    private int population;
    private int acres;
    private int cropYield;
    private int wheatInStore;
    private int numberWhoDied;
    private int newPeople;
    private int harvest;
    private int pharoohsShare;
    private int fed;
    private int planted;

    public Crops() {
    }
    
    //Returns the number of years passed
    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
    //Returns the number of people in the city
    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
    //Sets the number of acres of land that is owned
    public int getAcres() {
        return acres;
    }

    public void setAcres(int acres) {
        this.acres = acres;
    }
    //Sets the crop yield value to determine how much the crops yeilded
    public int getCropYield() {
        return cropYield;
    }

    public void setCropYield(int cropYield) {
        this.cropYield = cropYield;
    }
    //Set the value of wheat in store. 
    public int getWheatInStore() {
        return wheatInStore;
    }

    public void setWheatInStore(int wheatInStore) {
        this.wheatInStore = wheatInStore;
    }
    //to return the number of people who died from starvation
    public int getNumberWhoDied() {
        return numberWhoDied;
    }

    public void setNumberWhoDied(int numberWhoDied) {
        this.numberWhoDied = numberWhoDied;
    }
    //Sets the number of new people
    public int getNewPeople() {
        return newPeople;
    }

    public void setNewPeople(int newPeople) {
        this.newPeople = newPeople;
    }
    //Returns the value of the harvest
    public int getHarvest() {
        return harvest;
    }
   
    public void setHarvest(int harvest) {
        this.harvest = harvest;
    }
     //gives the value of Pharo's share
    public int getPharoohsShare() {
        return pharoohsShare;
    }

    public void setPharoohsShare(int pharoohsShare) {
        this.pharoohsShare = pharoohsShare;
    }
    //sets the value of number of people fed
    public int getFed() {
        return fed;
    }

    public void setFed(int fed) {
        this.fed = fed;
    }
    //Returns the value of the acres that are planted.  
    public int getPlanted() {
        return planted;
    }

    public void setPlanted(int planted) {
        this.planted = planted;
    }
    //Main formula to calculate the crops.
    @Override
    public String toString() {
        return "Crops{" + "years=" + years + ", population=" + population + ", acres=" + acres + ", cropYield=" + cropYield + ", wheatInStore=" + wheatInStore + ", numberWhoDied=" + numberWhoDied + ", newPeople=" + newPeople + ", harvest=" + harvest + ", pharoohsShare=" + pharoohsShare + ", fed=" + fed + ", planted=" + planted + '}';
    }
    
    
    
}
