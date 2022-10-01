/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.io.Serializable;

/**
 *
 * @author USUARIO
 */
public class Perro implements Serializable {
    
    private String nombre;
    private String identificador; // el numero que tenga en su respectivo carnet 
    private int edad;
    private String raza;
    private String comida;
    private String estado;
    private String tratamiento;
    private int cuarto;



    public Perro(String nombre, String identificador, int edad, String raza, String comida, String estado, String tratamiento, int cuarto) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.edad = edad;
        this.raza = raza;
        this.comida = comida;
        this.estado = estado;
        this.tratamiento = tratamiento;
        this.cuarto = cuarto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
    
        public int getCuarto() {
        return cuarto;
    }

    public void setCuarto(int cuarto) {
        this.cuarto = cuarto;
    }
    
}
