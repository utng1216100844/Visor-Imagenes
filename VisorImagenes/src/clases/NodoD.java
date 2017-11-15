/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Alejandro RG
 */
public class NodoD {
    private Imagen datos;
    private NodoD ant;
    private NodoD sig;

    public NodoD(Imagen datos) {
        this.datos = datos;
        ant= null;
        sig = null;
    }

    public Imagen getDatos() {
        return datos;
    }

    public void setDatos(Imagen datos) {
        this.datos = datos;
    }

    public NodoD getAnt() {
        return ant;
    }

    public void setAnt(NodoD ant) {
        this.ant = ant;
    }

    public NodoD getSig() {
        return sig;
    }

    public void setSig(NodoD sig) {
        this.sig = sig;
    }

    @Override
    public String toString() {
        return "NodoD{" + "datos=" + datos + ", ant=" + ant + ", sig=" + sig + '}';
    }
    
    
}
