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
public class hilo extends Thread implements Serializable {

    private boolean avanzar;
    private boolean vive;
    private int distancia;
    private JSpinner consumo;
    private JProgressBar conbustiblemax;
    private JProgressBar tanquereserva;

    public hilo(int distancia, JSpinner consumo, JProgressBar conbustiblemax, JProgressBar tanquereserva) {
        this.distancia = distancia;
        this.consumo = consumo;
        this.conbustiblemax = conbustiblemax;
        this.tanquereserva = tanquereserva;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
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

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                int d = 1;
                if (d > 0) {
                    d = distancia;
                }
                conbustiblemax.setValue(conbustiblemax.getMaximum()
                        - d / (Integer.parseInt(
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
