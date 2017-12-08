/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainGameExceptions;

/**
 *
 * @author admin
 */
public class CropsExceptions extends Exception {

    public CropsExceptions() {
    }

    public CropsExceptions(String string) {
        super(string);
    }  
     public CropsExceptions(String message, Throwable cause)
    {
        super(message, cause);
    }
    
    public CropsExceptions(Throwable cause)
    {
        super(cause);
       
}
}
