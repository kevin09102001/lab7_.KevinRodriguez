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
public class planetas implements Serializable{
     public String nombre,tipo;
     public int distancia,saturacion;
     
     private static final long SerialVersionUID=888L;

    public planetas(String nombre, String tipo, int distancia, int saturacion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.distancia = distancia;
        this.saturacion = saturacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getSaturacion() {
        return saturacion;
    }

    public void setSaturacion(int saturacion) {
        this.saturacion = saturacion;
    }
     
     
     
}
