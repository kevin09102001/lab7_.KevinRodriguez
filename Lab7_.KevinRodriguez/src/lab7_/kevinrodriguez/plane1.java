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
public class plane1 extends planetas {

    private ArrayList<clase3> clases = new ArrayList();

    public plane1(String nombre, String tipo, int distancia, int saturacion) {
        super(nombre, tipo, distancia, saturacion);
    }

    public ArrayList<clase3> getClases() {
        return clases;
    }

    public void setClases(ArrayList<clase3> clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
