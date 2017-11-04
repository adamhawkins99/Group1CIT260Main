/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainGameView;

import group1.main.game.Group1MainGame;
import java.util.Scanner;
import mainGameControl.CropsControl;
import mainGameModel.Crops;
import mainGameModel.Game;



/**
 *
 * @author admin
 */
public class CropsView {
    private static Scanner keyboard = new Scanner(System.in);
    private static Game theGame =  Group1MainGame.getGame();
    private static Crops theCrop = Group1MainGame.getCrops();
    
    public static void buyLandView()
    {
    int toBuy = 0;
    int price = CropsControl.calcLandCost();
    System.out.format("Land is selling for %d bushels per acre%n", price);
    int wheat = theCrop.getWheatInStore();
     int population = theCrop.getPopulation();
    do

    {
       System.out.print("\nHow many acres of land do you wish to buy? ");     
       toBuy = keyboard.nextInt();
       if(toBuy < 0)

       {

             System.out.println("I am sorry master, I cannot do this.");

             System.out.println("You cannot buy a negative amount of land.");

        }

        else if(toBuy * price > wheat)

        {

              System.out.println("I am sorry master, I cannot do this.");

              System.out.println("You do not have enough wheat to buy this much land.");

         }

    } while(toBuy < 0 || toBuy * price > wheat);

CropsControl.buyLand(price, toBuy, theCrop);

}
    
    public static void sellLandView() {
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
    public static void feedPeopleView() {
    
    int toFeed = 0;
    int wheat = theCrop.getWheatInStore();
    int population = theCrop.getPopulation();
    do

    {
       System.out.print("\nPlease enter the amount of wheat you would like to give people to feed them ");     
       toFeed = keyboard.nextInt();
       if(toFeed < 0)

       {

             System.out.println("I am sorry master, I cannot do this.");

             System.out.println("You cannot buy a negative amount of land.");

        }

        
    } while(toFeed < 0 );

CropsControl.feedPeople(toFeed, theCrop);
    }        
    }
    

