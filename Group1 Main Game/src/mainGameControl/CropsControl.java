/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainGameControl;

import mainGameModel.Crops;

/**
 *
 * @author adam
 */
public class CropsControl{
    public int buyLand (int landPrice , int acresToBuy, Crops theCrops){

       
              
        if (acresToBuy < 0){
            return -1;
        }
        if (acresToBuy > 200){
            return -1;
        }
        int wheat = theCrops.getWheatInStore();
        if ((acresToBuy * landPrice) > wheat){
            return -1;
        }
        int acres = theCrops.getAcres();
        acres += acresToBuy;
        wheat -= (acresToBuy * landPrice);
        theCrops.setWheatInStore(wheat);
        
        return wheat;

        }
        
    
}
