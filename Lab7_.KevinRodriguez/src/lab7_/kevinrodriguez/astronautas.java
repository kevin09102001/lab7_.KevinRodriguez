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
public class astronautas implements Serializable{
    public int ID,peso,cantidad_misiones;
    public String nombre,apellido,nacionalidad,titulo,contextura;
    
    private static final long SerialVersionUID=777L;

    public astronautas() {
    }

    public astronautas(int ID, String nombre, String apellido, String nacionalidad, String titulo, String contextura,int peso, int cantidad_misiones) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.titulo = titulo;
        this.contextura = contextura;
        this.peso = peso;
        this.cantidad_misiones = cantidad_misiones;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getCantidad_misiones() {
        return cantidad_misiones;
    }

    public void setCantidad_misiones(int cantidad_misiones) {
        this.cantidad_misiones = cantidad_misiones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContextura() {
        return contextura;
    }

    public void setContextura(String contextura) {
        this.contextura = contextura;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    
    
}
