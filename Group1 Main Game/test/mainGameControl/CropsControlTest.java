/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainGameControl;

import mainGameControl.CropsControl;
import mainGameModel.Crops;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class CropsControlTest {
    
    public CropsControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of buyLand method, of class InventoryControl.
     */
    @Test
    public void testBuyLand1() {
        System.out.println("**buyLand test case 1**");
        Crops theCrops = new Crops();
        theCrops.setWheatInStore(2800);
        theCrops.setAcres(0);
        
        int landPrice = 20;
        int acresToBuy = 10;
        CropsControl instance = new CropsControl();
        int expResult = 2600;
        int result = instance.buyLand(landPrice, acresToBuy, theCrops);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        System.out.println("**buyLand test case 2**");
               
        landPrice = 20;
        acresToBuy = -10;
        expResult = -1;
        result = instance.buyLand(landPrice, acresToBuy, theCrops);
        assertEquals(expResult, result);
        
        System.out.println("**buyLand test case 3**");
               
        landPrice = 20;
        acresToBuy = 201;
        expResult = -1;
        result = instance.buyLand(landPrice, acresToBuy, theCrops);
        assertEquals(expResult, result);
    }
    
    @Test
    public void feedPeople() {
        System.out.println("**feedPeople test case 1**");
        Crops theCrops = new Crops();
        theCrops.setWheatInStore(2800);
        
        
        int wheatForFeeding = -10;
        CropsControl instance = new CropsControl();
        int expResult = -1;
        int result = instance.feedPeople(wheatForFeeding, theCrops);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        System.out.println("**feedPeople test case 2**");
        
        wheatForFeeding = 2900;
        expResult = -1;
        result = instance.feedPeople(wheatForFeeding, theCrops);
        assertEquals(expResult, result);
        
        System.out.println("**feedPeople test case 3**");
        
        wheatForFeeding = 2000;
        expResult = 800;
        result = instance.feedPeople(wheatForFeeding, theCrops);
        assertEquals(expResult, result);
    }

}

