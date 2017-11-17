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
    private int noOfColumns;
    private Location[][] locations;

      
    public Map() {
    }

    public Map(int noOfRows, int noOfColumns) {
       //Iren, I think this is where I went wrong in setting it up like a grid  
       // if (noOfRows < 1 || noOfColumns < 1){
        //System.out.println("Please enter a value greater than zero.");
       // return;
        //}

        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
       
        locations = new Location[noOfRows][noOfColumns];
        //Assign the locations array to the map
        
        for (int row = 0; row< noOfRows; row++){
            for(int column = 0; column< noOfColumns; column++){
                //create and initialize new Location object instance
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                //set visited attribute to false
                //Assign location to the row, and column in array
                //Use “setter” methods to assign the current row, column and
                //visited attributes to each Location object created.

                
                
                //assign the Location object to the current position in array
                locations[row][column] = location;
            }
        }
        String nile = "\nYou are on the River Nile";
        locations[0][0].setDescription(nile);
        
    //I thik we are supposed to add the string so that the user can see a description
    //of where they are on the map since we are not doing a scene view. 
    
    }

    public Location[][] getLocations(int noOfRows, int noOfColumns) {
        return locations;
    }
    public Location[][] getLocations() {
        return locations;
         }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public int getNoOfRows() {
        return noOfRows;
    }

    public void setNoOfRows(int noOfRows) {
        this.noOfRows = noOfRows;
    }

    public int getNoOfColumns() {
        return noOfColumns;
    }

    public void setNoOfColumns(int NoOfColumns) {
        this.noOfColumns = NoOfColumns;
    }

}
