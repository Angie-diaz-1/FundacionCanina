/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author USUARIO
 */
public class IndexNoExisteException extends RuntimeException {
    
     public IndexNoExisteException() {
        super ("El index que esta ingresando no esta dentro de la dimension de la lista ");
    }
    
     
     
    
}
