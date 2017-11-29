/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainGameView;

import group1.main.game.Group1MainGame;
import java.io.PrintWriter;

/**
 *
 * @author admin
 */
public class ErrorView {
    private static final PrintWriter errorFile = Group1MainGame.getOutFile();
    private static final PrintWriter logFile = Group1MainGame.getLogfile();
    
    public static void display (String className, String errorMessage) {
    errorFile.println("------------------------------------------------"
                    +"\n - ERROR - " + errorMessage
                    +"\n------------------------------------------------");
    //log error
    logFile.println(className + "-" + errorMessage);
    }
    
}
