/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_.kevinrodriguez;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;

/**
 *
 * @author Kevin
 */
public class bitacora extends Thread {

    private boolean avanzar;
    private boolean vive;
    private JSpinner sp_v;
    private JProgressBar progBar_t;
    private JProgressBar progBar_d;
    private boolean flag;

    public bitacora(JSpinner sp_v, JProgressBar progBar_t, JProgressBar progBar_d) {
        this.sp_v = sp_v;
        this.progBar_t = progBar_t;
        this.progBar_d = progBar_d;
        avanzar = true;
        vive = true;
        flag = false;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVida(boolean vive) {
        this.vive = vive;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void run() {
        FileWriter salida = null;
        BufferedWriter br = null;
        flag = true;
        while (vive) {
            if (avanzar) {
                try {
                    salida = new FileWriter("./bitacora.txt", true);
                    br = new BufferedWriter(salida);
                    br.write("velocidad:" + sp_v.getValue().toString()
                            + " Tiempo transcurrido:" + Integer.toString(progBar_t.getValue())
                            + " Distancia:" + Integer.toString(progBar_d.getValue()));
                    br.newLine();
                    br.flush();
                    salida.close();

                } catch (Exception ex) {
                }
            }
            try {
                Thread.sleep(350);
            } catch (InterruptedException ex) {
                Logger.getLogger(bitacora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}