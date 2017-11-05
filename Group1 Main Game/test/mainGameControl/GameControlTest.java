/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainGameControl;

import mainGameModel.Player;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Erin Smith <erinisireland@gmail.com>
 */
public class GameControlTest {
    
    public GameControlTest() {
    }

    /**
     * Test of createPlayer method, of class GameControl.
     */
    @Test
    public void testCreatePlayer() {
        System.out.println("createPlayer");
        String name = "";
        Player expResult = null;
        Player result = GameControl.createPlayer(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createCrops method, of class GameControl.
     */
    @Test
    public void testCreateCrops() {
        System.out.println("createCrops");
        GameControl.createCrops();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
