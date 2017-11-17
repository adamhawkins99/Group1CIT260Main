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
    private int row;        
    private int column;   
    //still need to write the string code in the map section
    private String description;
    private String symbol;  
    
   
    public Location()
    {
    }
    
    //We are trying to set up our map like a grid(chess board) where each area of the map describes the scene from the string
    public int getRow( )
    {
        return row;
    }
     public int getColumn( )
    {
        return column;
    }
    
    public void setRow(int _rowIndex )
    {
        row = _rowIndex;
    }
    
  
    public void setColumn(int _colIndex )
    {
        column = _colIndex;
    }  
     public String getDescription()
    {
        return description;
    }
    
     //The symbol method should allow the user to see the description of the scene based on where they are on the map.  
     public String getSymbol()
    {
        return symbol;
    }  
    public void setDescription(String _description)
    {
        description = _description;
    }

    public void setSymbol(String _symbol)
    {
        symbol = _symbol;
    }            
   
}