/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.io.Serializable;



/**
 *
 * @author USUARIO
 */
public class Nodo <T>  implements Serializable{
    
    private T dato;
    private Nodo nodoSig;

    public Nodo( T dato) {
        this.dato = dato;
        this.nodoSig = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo getNodoSig() {
        return nodoSig;
    }

    public void setNodoSig(Nodo nodoSig) {
        this.nodoSig = nodoSig;
    }
    
    public Nodo obtenerSiguiente(){
        return nodoSig;
    }
    
    
    
    
    
    
    
    
}
