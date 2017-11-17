/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainGameModel;

/**
 *
 * @author admin
 */

import java.io.Serializable;
        
public class Map implements Serializable{
    private int noOfRows;
    private int NoOfColumns;
    private Location[][] locations;

      
    public Map() {
    }

    public Map(int noOfRows, int noOfColumns) {
       //Iren, I think this is where I went wrong in setting it up like a grid  
        if (noOfRows < 1 || noOfColumns < 1){
        System.out.println("Please enter a value greater than zero.");
        return;
        }

        this.noOfRows = noOfRows;
        this.NoOfColumns = noOfColumns;
        
       
        locations = new Location[noOfRows][NoOfColumns];
        
        for (int row = 0; row< noOfRows; row++){
            for(int column = 0; column< noOfColumns; column++){
                //create and initialize new Location object instance
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                
                
                //assign the Location object to the current position in array
                locations[row][column] = location;
            }
        }
        
    //I thik we are supposed to add the string so that the user can see a description
    //of where they are on the map since we are not doing a scene view. 
    
    }

    public Location[][] getLocations(int noOfRows, int noOfColumns) {
        return locations;
    }
    

}
