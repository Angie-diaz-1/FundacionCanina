/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author USUARIO
 */
public class DocumentoDuplicadoException extends RuntimeException {
    
     public DocumentoDuplicadoException() {
        super (" El numero de identificacion ya se encuentra registrado con otro canino ");
    }
    
    
    
}
