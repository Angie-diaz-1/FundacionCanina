/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;


import Excepciones.IndexNoExisteException;
import java.io.Serializable;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Lista <T> implements Serializable{

    private Nodo <T> primero;
    private int size;

    public Lista() {
        this.primero = null;
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    // para agregar 
    
    public void add(T estudiante) {
        Nodo  <T> nuevo = new Nodo(estudiante);
        if (primero == null) {
            this.primero = nuevo;
            size++;
        } else {
            Nodo <T> aux = primero;

            while (aux.getNodoSig() != null) {
                aux = aux.getNodoSig();

            }
            aux.setNodoSig(nuevo);
            size++;

        }

    }
    
    
    public  T obtener(int index) {
        int contador = 0;
        Nodo <T> temporal = primero;
        while (contador < index) {
            temporal = temporal.getNodoSig();
            contador++;
        }
        return temporal.getDato();
    }
    
  
    

    public boolean añadirPosicion(  T estudiante, int index) throws IndexNoExisteException {

        if (index < 0 || index > size) {
            throw new IndexNoExisteException();

        } else {

            if (index == 0) {
                Nodo <T>nuevo = new Nodo(estudiante);
                nuevo.setNodoSig(primero);
                this.primero = nuevo;
                size++;

            } else {
                if (index == size) {
                    Nodo <T> nuevo = new Nodo(estudiante);
                    Nodo <T> aux = primero;
                    while (aux.getNodoSig() != null) {
                        aux = aux.getNodoSig();

                    }
                    aux.setNodoSig(nuevo);
                    size++;

                } else {
                    Nodo <T> nuevo = new Nodo(estudiante);
                    Nodo <T> aux = primero;
                    Nodo <T> auxDos = null;
                    
                    int contador = 0;

                    while (contador < (index -1)) { 
                        aux = aux.getNodoSig();
                        contador++;
                    }
                    auxDos = aux.getNodoSig();
                    aux.setNodoSig(nuevo);
                    nuevo.setNodoSig(auxDos);
                    size++;

                }

            }
            return true;
        }

    }
 public void eliminar(int index) throws IndexNoExisteException {
        if (index < 0 || index > size) {
            throw new IndexNoExisteException();
        } 
            if (index == 0) {

                Nodo <T> aux = primero;
                Nodo <T> auxDos = aux.getNodoSig();
                primero = auxDos;
                size--;

            } else {
                int contador = 0;
                Nodo <T> aux = primero;
                Nodo <T> auxDos = null;

                while (contador < (index -1)) {
                    aux = aux.getNodoSig();
                    contador++;
                }

                auxDos = aux.getNodoSig();
                auxDos = auxDos.getNodoSig();
                aux.setNodoSig(auxDos);
                size--;
            }

        

    }
// 
//    public ArrayList<Estudiante> estadoLista(){
//        ArrayList<Estudiante> estudiantes = new ArrayList<>();
//
//        Nodo nodoAux =this.primero;
//        
//        while(nodoAux!= null){
//            estudiantes.add(nodoAux.getEstudiante());
//            nodoAux=nodoAux.getNodoSig();
//        }
//        
//        return estudiantes;
//    } 
//    
    
    
    
    
    

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public int getSize() {
        return size;
    }

 

}
