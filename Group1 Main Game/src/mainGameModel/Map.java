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
public class Map implements Serializable {

    private int noOfRows;
    private int noOfColumns;
    private Location[][] locations;
    
    public Map() {
    }
    public Map(int noOfRows, int noOfColumns){
        
    locations = new Location[noOfRows][noOfColumns];
    
    }

    public Location[][] getLocations(int noOfRows, int noOfColumns) {
        return locations;
    }
    
}
    
