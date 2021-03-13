/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_.kevinrodriguez;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;

/**
 *
 * @author Kevin
 */
public class naves extends Thread implements Serializable {

    public String nombre, identificador;
    public int cant_personas, tiempo, astronautas, aterrizaje, velocidad, distancia;
    private boolean avanzar;
    private boolean vive;
    private JSpinner consumo;
    private JProgressBar conbustiblemax;
    private JProgressBar tanquereserva;
    

    private static final long SerialVersionUID = 777L;

    public naves(String nombre, String identificador, int cant_personas, int tiempo, int astronautas, int aterrizaje, int velocidad, int distancia) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.cant_personas = cant_personas;
        this.tiempo = tiempo;
        this.astronautas = astronautas;
        this.aterrizaje = aterrizaje;
        this.velocidad = velocidad;
        this.distancia = distancia;
    }

    public naves(JSpinner consumo, JProgressBar conbustiblemax, JProgressBar tanquereserva) {
        this.consumo = consumo;
        this.conbustiblemax = conbustiblemax;
        this.tanquereserva = tanquereserva;
        avanzar = true;
        vive = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getCant_personas() {
        return cant_personas;
    }

    public void setCant_personas(int cant_personas) {
        this.cant_personas = cant_personas;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getAstronautas() {
        return astronautas;
    }

    public void setAstronautas(int astronautas) {
        this.astronautas = astronautas;
    }

    public int getAterrizaje() {
        return aterrizaje;
    }

    public void setAterrizaje(int aterrizaje) {
        this.aterrizaje = aterrizaje;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public JSpinner getConsumo() {
        return consumo;
    }

    public void setConsumo(JSpinner consumo) {
        this.consumo = consumo;
    }

    public JProgressBar getConbustiblemax() {
        return conbustiblemax;
    }

    public void setConbustiblemax(JProgressBar conbustiblemax) {
        this.conbustiblemax = conbustiblemax;
    }

    public JProgressBar getTanquereserva() {
        return tanquereserva;
    }

    public void setTanquereserva(JProgressBar tanquereserva) {
        this.tanquereserva = tanquereserva;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                int d=1;
                if (d>0) {
                    d=this.distancia;
                }
                conbustiblemax.setValue(conbustiblemax.getMaximum()-
                       d / (Integer.parseInt(
                                consumo.getValue().toString()))
                );
                try {
                    Thread.sleep(300);
                } catch (InterruptedException ex) {
                    Logger.getLogger(naves.class.getName()).log(Level.SEVERE, null, ex);
                };
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
        }
    }

}
