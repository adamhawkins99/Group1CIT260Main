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
public class InventoryControl{
    public static double calcBuyLand (double landPrice , double acresToBuy, Crops theCropsObj){

       
              
        if (acresToBuy < 0){
            return -1;
        }
        if (acresToBuy > 200){
            return -1;
        }
        
        if ((acresToBuy * landPrice) > wheatInStore){
            return -1;
        }
        double acresOwned = acresOwned + acresToBuy;
        double wheatInStore = wheatInStore – (acresToBuy * landPrice);
        
        return wheatInStore;

        }
        
    
}
