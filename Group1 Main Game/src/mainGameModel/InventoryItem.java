/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainGameModel;

import java.io.Serializable;

/**
 * 
 * @author Erin
 */
public class InventoryItem implements Serializable{
       private int quantityInStock;
       private int requiredAmount;

    public InventoryItem() {
    }

       
    //Sets the quantity on hand for this item.   
    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
    //Get and set for the required amount.  
    public int getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    

       
}