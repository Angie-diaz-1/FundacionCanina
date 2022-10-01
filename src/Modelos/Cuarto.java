/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author USUARIO
 */
public class Cuarto {
    
    public static final  String DISPONIBLE ="disponible";
    public static final String OCUPADO ="ocupado";
    
    private String estado;
    private Perro perro;
    private String numeroCuarto;
    

    public Cuarto() {
        this.estado = DISPONIBLE;
        this.perro = null;
        this.numeroCuarto= null;
        
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public String getNumeroCuarto() {
        return numeroCuarto;
    }

    public void setNumeroCuarto(String numeroCuarto) {
        this.numeroCuarto = numeroCuarto;
    }
    
    
    
    
    
}
