/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainGameModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author adam
 */
public class People implements Serializable {
    
    private String QuantityOfPeople;
    private String people;
    
    public People() {
    }
    
    public String getQuantityOfPeople(){
        return QuantityOfPeople;
        
    }
    public void setQuantityOfPeople (String people) {
        this.QuantityOfPeople = people;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.QuantityOfPeople);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final People other = (People) obj;
        if (!Objects.equals(this.QuantityOfPeople, other.QuantityOfPeople)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "People{" + "QuantityOfPeople=" + people + '}';
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainGameModel;

/**
 *
 * @author adam
 */
public class People {
    
}
