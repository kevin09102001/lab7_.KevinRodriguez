/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_.kevinrodriguez;

import java.io.Serializable;

/**
 *
 * @author Kevin
 */
public class clase3 implements Serializable{
     private String nombree;

     private static final long SerialVersionUID=555L;

    public clase3() {
    }
     
     
    public clase3(String nombree) {
        this.nombree = nombree;
    }

    public String getNombree() {
        return nombree;
    }

    public void setNombree(String nombree) {
        this.nombree = nombree;
    }

    @Override
    public String toString() {
        return "clase1{" + "nombree=" + nombree + '}';
    }
}
