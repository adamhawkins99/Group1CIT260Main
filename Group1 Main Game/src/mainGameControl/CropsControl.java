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

    public static int calcLandCost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        public static int buyLand (int landPrice , int acresToBuy, Crops theCrops){

       
              
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
        
    public static int sellLand (int landPrice , int acresToSell, Crops theCrops){
    
    if (acresToSell < 0) {
            return -1;
        }
        if (acresToSell > 200){
            return -1;
        }
        int wheat = theCrops.getWheatInStore();
        if ((acresToSell * landPrice) > wheat){
            return -1;
        }
        int acres = theCrops.getAcres();
        acres += acresToSell;
        wheat -= (acresToSell * landPrice);
        theCrops.setWheatInStore(wheat);
        
        return wheat;
    }
    
    public static int feedPeople (int wheatForFeeding, Crops theCrops){
    if(wheatForFeeding<0){
        return -1;
    }
    int wheat = theCrops.getWheatInStore();
    if (wheatForFeeding>wheat) {
        return -1;
    }
    wheat-=wheatForFeeding;
    theCrops.setWheatInStore(wheat);
    return wheat;
    }
}
