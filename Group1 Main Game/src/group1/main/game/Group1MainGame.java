/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group1.main.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import mainGameModel.Crops;
import mainGameModel.Game;
import mainGameModel.Player;
import mainGameView.StartProgramView;

/**
 *
 * @author adam
 */
public class Group1MainGame {
    
    private static Game currentGame = null;
    private static Player player = null;
    private static Crops theCrops = null;
    private static Game game = null;
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logfile = null;
    
public static void main(String[] args) {
    
    try {
    //open caracter stream files for end user input and output
    Group1MainGame.inFile = new BufferedReader (new InputStreamReader(System.in));
    Group1MainGame.outFile = new PrintWriter (System.out, true);
    //open log file
    
    String filePath = "log.txt";
    Group1MainGame.logfile = new PrintWriter(filePath);
    
//create StartProgramView and start the program
StartProgramView startProgramView = new StartProgramView();
startProgramView.displayStartProgramView();
return;
} catch (Throwable e) {
System.out.println ("Exception: "+e.toString() + 
                    "\nCause: " + e.getCause() +
                    "\nMessage: " +e.getMessage());
e.printStackTrace();;
}
    finally    {
        try {
            if (Group1MainGame.inFile !=null)
            Group1MainGame.inFile.close();
            if (Group1MainGame.outFile !=null)
            Group1MainGame.outFile.close();
            if (Group1MainGame.logfile !=null)
            Group1MainGame.logfile.close();
        } catch (IOException ex) {
            System.out.println("Error closing file");
            return;
        }
    
    }
}

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Group1MainGame.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Group1MainGame.player = player;
    }

    //public static void setCrops(Crops theCrops) {
      //  System.out.println("/n*** setCrops method called***");
    //}

    public static Game getGame() {
        return game;
    }

    public static Crops getCrops() {
        return theCrops;
    }
    
    public static void setCrops(Crops _cropRef) {
        theCrops = _cropRef;
    }

    public static void setGame(Game theGame) {
        game=theGame;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Group1MainGame.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Group1MainGame.inFile = inFile;
    }

    public static PrintWriter getLogfile() {
        return logfile;
    }

    public static void setLogfile(PrintWriter logfile) {
        Group1MainGame.logfile = logfile;
    }
    
    

}