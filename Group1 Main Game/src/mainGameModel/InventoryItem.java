/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.group1.model;

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

       
       
    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    

       
}