/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author USUARIO
 */
public class Modulo {
    public static final String DISPONIBLE = "disponible";
    public static final String OCUPADO= "ocupado";
    
    private String estado;
    private  Cuarto [] cuarto;

    public Modulo() {
        this.estado = DISPONIBLE;
        this.cuarto= new Cuarto[5];
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cuarto getCuarto( int fila) {
        return cuarto[fila];
    }

    public void setCuarto(Cuarto cuarto, int fila) {
        this.cuarto[fila] = cuarto;
    }
    
    
    
    
    
    
    
    
    
}
