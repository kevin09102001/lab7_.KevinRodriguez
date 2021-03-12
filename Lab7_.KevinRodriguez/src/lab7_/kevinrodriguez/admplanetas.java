/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_.kevinrodriguez;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Kevin
 */
public class admplanetas {
       private ArrayList<planetas> listaplanetas = new ArrayList();
    private File archivo = null;
    
    public admplanetas(String path) {
        archivo = new File(path);
    }

    public ArrayList<planetas> getListaplanetas() {
        return listaplanetas;
    }

    public void setListaplanetas(ArrayList<planetas> listaplanetas) {
        this.listaplanetas = listaplanetas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setplanetas(planetas a){
        listaplanetas.add(a);
    }
    
    
    public void cargarArchivo() {
        try {            
            listaplanetas = new ArrayList();
            planetas temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (planetas) objeto.readObject()) != null) {
                        listaplanetas.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (planetas t : listaplanetas) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
