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
public class admastronautas {
    private ArrayList<astronautas> listaastronautas = new ArrayList();
    private File archivo = null;
    
    public admastronautas(String path) {
        archivo = new File(path);
    }

    public ArrayList<astronautas> getListaastronautas() {
        return listaastronautas;
    }

    public void setListaastronautas(ArrayList<astronautas> listaastronautas) {
        this.listaastronautas = listaastronautas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setastronautas(astronautas a){
        listaastronautas.add(a);
    }
    
    
    public void cargarArchivo() {
        try {            
            listaastronautas = new ArrayList();
            astronautas temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (astronautas) objeto.readObject()) != null) {
                        listaastronautas.add(temp);
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
            for (astronautas t : listaastronautas) {
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
