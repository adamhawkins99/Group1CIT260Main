/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainGameControl;

import java.util.Random;
import mainGameExceptions.CropsExceptions;
import mainGameModel.Crops;

/**
 *
 * @author adam
 */
public class CropsControl{
    public static final int WHEAT_FOR_ACRE = 1;
    private static final int GATHERED_WHEAT = 3;
    private static final int LAND_BASE = 17;
    private static final int LAND_RANGE = 10;
    //random number generator
    private static Random random = new Random();
    

    public static int calcLandCost() {
        int landPrice = random.nextInt(LAND_RANGE)+LAND_BASE;
        return landPrice;
    }

        public static void buyLand (int landPrice , int acresToBuy, Crops theCrops) throws CropsExceptions{
         //check parameters          
        if (acresToBuy < 0){
            throw new CropsExceptions ("A negative value was input");
        }
        int wheat = theCrops.getWheatInStore();
        
        if ((acresToBuy * landPrice) > wheat){
            throw new CropsExceptions ("There is insufficient wheat to buy this much land");
        }
        int acres = theCrops.getAcres();
        acres += acresToBuy;
        wheat -= (acresToBuy * landPrice);
        theCrops.setWheatInStore(wheat);
        
        wheat = theCrops.getWheatInStore();
        wheat -= (acresToBuy*landPrice);
        theCrops.setWheatInStore(wheat);
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
        acres -= acresToSell;
        wheat += (acresToSell * landPrice);
        theCrops.setWheatInStore(wheat);
        
        return acres;
    }
    
    public static void feedPeople (int wheatForFeeding, Crops theCrops) throws CropsExceptions {
    //entered amount should be positive
        if(wheatForFeeding<0){
        throw new CropsExceptions ("A negative value was input");
    }
    int wheat = theCrops.getWheatInStore();
    //entered amount shouldn't be more that the amount a user have at the moment
    if (wheatForFeeding>wheat) {
        throw new CropsExceptions ("There is insufficient wheat to feed these people");
    }
    wheat-=wheatForFeeding;
    theCrops.setWheatInStore(wheat);
    
    }
    public static int plantLand (int landToPlant, Crops theCrops) {
    if (landToPlant<0){
    return -1;}//entered amount must be positive
    int acres = theCrops.getAcres();
    if (landToPlant>acres) {
    return -1;}//entered amount should be more than land a user have
    int wheat = theCrops.getWheatInStore();
    if (landToPlant*WHEAT_FOR_ACRE>wheat) {
    return -1;}//entered amount must be less than wheat a user has
    wheat = landToPlant*GATHERED_WHEAT;
    theCrops.setWheatInStore(wheat);
    return wheat; 
     }
}
