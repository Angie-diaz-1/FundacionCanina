/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author USUARIO
 */
public class documentoNoExisteExeption extends RuntimeException {

    public documentoNoExisteExeption() {
        super (" el identificador del canino  que esta ingresando NO existe en la lista");
    
    }
    
    
    
    
}
