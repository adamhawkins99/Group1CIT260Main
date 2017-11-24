/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainGameView;

import group1.main.game.Group1MainGame;
import java.util.Scanner;
import mainGameControl.CropsControl;
import mainGameExceptions.CropsExceptions;
import mainGameModel.Crops;
import mainGameModel.Game;



/**
 *
 * @author admin
 */
public class CropsView {
    private static Scanner keyboard = new Scanner(System.in);
    private static Game theGame =  Group1MainGame.getGame();
    //private static Crops theCrop = Group1MainGame.getCrops();
    private static Crops theCrop = theGame.getCrop(); 
    
    public static void buyLandView(Crops theCrop)
    {
    int toBuy = 0;
    int price = CropsControl.calcLandCost();
    System.out.format("Land is selling for %d bushels per acre%n", price);
    int wheat = theCrop.getWheatInStore();
     int population = theCrop.getPopulation();
     boolean paramsNotOkay;
    do

    {  paramsNotOkay = false;
       System.out.print("\nHow many acres of land do you wish to buy? ");     
       toBuy = keyboard.nextInt();
       try
       {
       CropsControl.buyLand(price, toBuy, theCrop);
       }
       catch (CropsExceptions e)
       {
             System.out.println("I am sorry master, I cannot do this.");

             System.out.println(e.getMessage());
             paramsNotOkay = true;}

    } while(paramsNotOkay);

}
    
    public static void sellLandView(Crops theCrop) {
    int toSell = 0;
    int price = CropsControl.calcLandCost();
    System.out.format("Land is selling for %d bushels per acre%n", price);
    int acres = theCrop.getAcres();
        do

    {
       System.out.print("\nHow many acres of land do you wish to sell? ");     
       toSell = keyboard.nextInt();
       if(toSell < 0)

       {

             System.out.println("I am sorry master, I cannot do this.");

             System.out.println("You cannot sell a negative amount of land.");

        }

        else if(toSell > acres)

        {

              System.out.println("I am sorry master, I cannot do this.");

              System.out.println("You do not have this much land.");

         }

    } while(toSell < 0 || toSell > acres);

CropsControl.sellLand(price, toSell, theCrop);
    
    }
    public static void feedPeopleView(Crops theCrop) {
    
    int toFeed = 0;
    int wheat = theCrop.getWheatInStore();
    int population = theCrop.getPopulation();
    boolean paramNotOkay;
    do

    {
        paramNotOkay = false;
       System.out.print("\nPlease enter the amount of wheat you would like to give people to feed them ");     
       toFeed = keyboard.nextInt();
       
       try {
           
       CropsControl.feedPeople(toFeed, theCrop);
       }
       catch (CropsExceptions e) {

             System.out.println("I am sorry master, I cannot do this.");

             System.out.println(e.getMessage());
             paramNotOkay=true;

        }

        
    } while(paramNotOkay);


    }        
public static void plantLandView(Crops theCrop)
    {
    int toPlant = 0;
    System.out.format("Each acre takes one bushel of wheat");
    int wheat = theCrop.getWheatInStore();
     do

    {
       System.out.print("\nHow many acres of land do you wish to plant? ");     
       toPlant = keyboard.nextInt();
       if(toPlant < 0)

       {

             System.out.println("I am sorry master, I cannot do this.");

             System.out.println("You cannot plant a negative amount of land.");

        }

        else if(toPlant * CropsControl.WHEAT_FOR_ACRE > wheat)

        {

              System.out.println("I am sorry master, I cannot do this.");

              System.out.println("You do not have enough wheat to plant this much land.");

         }

    } while(toPlant < 0 || toPlant * CropsControl.WHEAT_FOR_ACRE > wheat);

CropsControl.plantLand(toPlant, theCrop);

}    

}
    

