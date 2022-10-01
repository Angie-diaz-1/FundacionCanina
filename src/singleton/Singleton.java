/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

import Modelos.Perro;
import Util.Lista;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author USUARIO
 */
public class Singleton {
 
    private static Singleton INSTANCIA = new Singleton();
     private Lista<Perro> listaPerros;

    private Singleton() {
      leerObjetoPerro();   
        
    }
 
    public static Singleton getINSTANCIA() {
        if(INSTANCIA == null){
            INSTANCIA = new Singleton();
        }
        return INSTANCIA;
    }
    
     public Lista<Perro> getListaPerro() {
        return listaPerros;
    }

     public void escribirObjetoPerro() {
        try {
            FileOutputStream archivo = new FileOutputStream("perros.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(listaPerros);
         } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public void leerObjetoPerro() {
        try {
            FileInputStream archivo = new FileInputStream("perros.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            listaPerros = (Lista<Perro>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            listaPerros = new Lista<>();
        }
    }
    
    
}
