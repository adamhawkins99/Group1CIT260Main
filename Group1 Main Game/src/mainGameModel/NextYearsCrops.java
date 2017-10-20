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
public class NextYearsCrops{
    public int growPopulation (int numberWhoDied , int newPeople, int calcStarved, Crops growPopulation){

       //Next Years Crops = harvested crops - number who died + new people
              
        if (numberWhoDied < 0){
            return -1;
        }
        if (200 <= newPeople){
            return -1;
        }
       
       
        growPopulation = newPeople - numberWhoDied - calcStarved;
       
        
        return growPopulation;

        }
        
    
}