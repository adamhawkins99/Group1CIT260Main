/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainGameModel;

import mainGameControl.InventoryControl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
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
        InventoryControl instance = new InventoryControl();
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
    
}
