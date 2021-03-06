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
    private int numRows;
    private int numColumns;
    private Location[][] locations;

      
    public Map() {
    }

    public Map(int numRows, int numColumns) {
       //The map class is set up like a grid, with each location being a different area that
       //the player can move around in. 

        //this.numRows = numRows;
        //this.numColumns = numColumns;
        
       
        locations = new Location[numRows][numColumns];
        //Assign the locations array to the map
        
        for (int row = 0; row< numRows; row++){
            for(int column = 0; column< numColumns; column++){
                //create and initialize new Location object instance
                Location location = new Location();
                locations [row][column]= location;
                //location.setColumn(column);
                //location.setRow(row);
                //Assign location to the row, and column in array
                //Use “setter” methods to assign the current row, column and
                //visited attributes to each Location object created.

                
                
                //assign the Location object to the current position in array
                locations[row][column] = location;
            }
        }
                
    //Each of these are the different locations
    String pChourt = "\nYou are on the Pharaoh’s Court ";
    String storeHouse = "\nYou are in the Pharaoh’s Granary and Storehouse";
    String wheatField = "\nYou are on the beautiful wheat field";
    String cornField = "\nYou are on the beautiful Corn Field. There is so much corn here";
    String barleyField = "\nYou are on the barley field. The Barley crops look good.";
    String undevelopedLand = "\nPerhaps we could add more acres of grain here";
    String desert = "\nThere is not enough water to grow crops here";
    String village = "\nThis is where the people live. I wonder if they are getting enough food";
    String cattleField = "\nIt’s good that the cattle has plenty of grass to eat";
    String stables = "\nThe Pharaoh has many horses and donkeys";
    for (int i=0; i<numRows; i++){    
    locations[i][0].setDescription(pChourt);
    locations[i][0].setSymbol("***");
    locations[i][1].setDescription(storeHouse);
    locations[i][1].setSymbol("***");
    locations[i][2].setDescription(wheatField);
    locations[i][2].setSymbol("***");
    locations[i][3].setDescription(cornField);
    locations[i][3].setSymbol("***");
    locations[i][4].setDescription(barleyField);
    locations[i][4].setSymbol("***");
    }
    }
    
    
    public Location getLocations(int numRows, int numColumns) {
        return locations[numRows][numColumns];
    }
    public int getNumRows() {
        return numRows;
    }

    public void setNoOfRows(int numRows) {
        this.numRows = numRows;
    }

    public int getNunColumns() {
        return numColumns;
    }

    public void setNumColumns(int numColumns) {
        this.numColumns = numColumns;
    }

}
