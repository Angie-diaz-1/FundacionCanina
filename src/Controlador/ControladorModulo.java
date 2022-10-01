/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelos.Cuarto;
import Modelos.Modulo;
import Modelos.Perro;

/**
 *
 * @author USUARIO
 */
/**
 * Este controlador nos ayudara a mostrar los botones de la primera interfaz
 * donde estara todos los modulos (12) ya su vez los cuartos de cada modulo que
 * serian (5)
 *
 */
public class ControladorModulo {
   
    Modulo[][] modulos;

     public ControladorModulo () {
       modulos = new    Modulo[3][4];  //
        iniciarModulo();

    }

    private void iniciarModulo() {
        for (int i = 0; i < modulos.length; i++) {
            for (int j = 0; j < modulos[i].length; j++) {
               modulos[i][j] = new Modulo();
            }
        }
       

    }

    public Modulo obtenerModulo(int fila, int columna){
        return modulos [fila][columna];
    }

    
   
    
}
