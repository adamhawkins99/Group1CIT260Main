/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainGameModel;

import java.io.Serializable;


/**
 *
 * @author Erin <erinisireland@gmail.com>
 */
public class List implements Serializable  {
    private int wheat;
    private int poplulation;
    private int acres;
    private int numberWhoDied;
    private int newPeople;
    private int pharoohsShare;
    private int fed;
    private int years;
    
public List() {
    
}

    public int getWheat() {
        return wheat;
    }

    public int getPoplulation() {
        return poplulation;
    }

    public void setWheat(int wheat) {
        this.wheat = wheat;
    }

    public void setPoplulation(int poplulation) {
        this.poplulation = poplulation;
    }

    public void setAcres(int acres) {
        this.acres = acres;
    }

    public void setNumberWhoDied(int numberWhoDied) {
        this.numberWhoDied = numberWhoDied;
    }

    public void setNewPeople(int newPeople) {
        this.newPeople = newPeople;
    }

    public void setPharoohsShare(int pharoohsShare) {
        this.pharoohsShare = pharoohsShare;
    }

    public void setFed(int fed) {
        this.fed = fed;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getAcres() {
        return acres;
    }

    public int getNumberWhoDied() {
        return numberWhoDied;
    }

    public int getNewPeople() {
        return newPeople;
    }

    public int getPharoohsShare() {
        return pharoohsShare;
    }

    public int getFed() {
        return fed;
    }

    public int getYears() {
        return years;
    }

     @Override
    public String toString() {
        String population = null;
        return "List{" + "years=" + years + ", population=" + population + ", acres=" + acres + ", numberWhoDied=" + numberWhoDied + ", newPeople=" + newPeople + ", pharoohsShare=" + pharoohsShare + ", fed=" + fed + '}';
    }
}
