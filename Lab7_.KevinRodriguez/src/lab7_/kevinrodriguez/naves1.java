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
public class naves1 extends naves{
    private ArrayList<clase2> clases = new ArrayList();
    public naves1(String nombre, String identificador, int cant_personas, int tiempo, int astronautas, int aterrizaje, int velocidad, int distancia) {
        super(nombre, identificador, cant_personas, tiempo, astronautas, aterrizaje, velocidad, distancia);
    }

    public ArrayList<clase2> getClases() {
        return clases;
    }

    public void setClases(ArrayList<clase2> clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
