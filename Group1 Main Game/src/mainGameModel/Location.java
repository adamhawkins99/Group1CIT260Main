/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainGameModel;

/**
 *
 * @author adam
 */
import java.io.Serializable;

public class Location implements Serializable
{
    private String description;  //This should be what you see if you go there
    private String symbol ;   //What will display when the map is viewed

    public Location() {
    }
    //The get and set to store a description of the scene
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    //The get and set to store the symbol that will display on the map.
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    
   
      
    
    }
    
    