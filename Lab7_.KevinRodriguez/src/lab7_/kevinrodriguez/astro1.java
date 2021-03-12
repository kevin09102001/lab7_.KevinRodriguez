/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_.kevinrodriguez;

import java.util.ArrayList;

/**
 *
 * @author Kevin
 */
public class astro1 extends astronautas {
      private ArrayList<clase1> clases=new ArrayList();

    public astro1(int ID, String nombre, String apellido, String nacionalidad, String titulo, String contextura, int peso, int cantidad_misiones) {
        super(ID, nombre, apellido, nacionalidad, titulo, contextura, peso, cantidad_misiones);
    }

    public ArrayList<clase1> getClases() {
        return clases;
    }

    public void setClases(ArrayList<clase1> clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return nombre ;
    }
      
      
}
