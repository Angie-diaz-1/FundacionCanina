/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Excepciones.DocumentoDuplicadoException;
import Excepciones.documentoNoExisteExeption;
import Modelos.Cuarto;
import Modelos.Perro;
import Util.Lista;
import singleton.Singleton;

/**
 *
 * @author USUARIO
 */
public class ControladorCuarto {

    private Cuarto[] cuartos;
    public  Lista<Perro> lista;

    public ControladorCuarto() {
        cuartos = new Cuarto[5];
        // lista = new Lista <>();
         lista = Singleton.getINSTANCIA().getListaPerro();
        iniciarCuartos();

    }

    public Lista<Perro> getLista() {
        return lista;
    }

    public ControladorCuarto(Lista<Perro> lista) {
        this.lista = lista;
    }
    
     public Perro perro (int posicion){
        return lista.obtener(posicion);
    }
     
      public boolean agregarPosicionEspecifica(Perro perro, int index) {
        return lista.añadirPosicion(perro, index);

    }
     

    public void anadirPerro(Perro perro, int fila) {
        cuartos[fila].setPerro(perro);
        cuartos[fila].setEstado(Cuarto.OCUPADO);

    }

    private void iniciarCuartos() {
        for (int i = 0; i < cuartos.length; i++) {
            cuartos[i] = new Cuarto();

        }

    }

    public  Cuarto obtenerCuarto(int fila) {
        return cuartos[fila];
    }
    
    
    // CRUD
    
   public boolean registrarPerro(Perro perro) throws DocumentoDuplicadoException {
        Perro auxiliar = buscarPerro(perro.getIdentificador());
        if (auxiliar == null) {
           
                lista.add(perro);
                Singleton.getINSTANCIA().escribirObjetoPerro();
                return true;
            
        }
        throw new DocumentoDuplicadoException();
    }

    public Perro buscarPerro(String identificacion) {
      Perro PerroTemporal = null;
        for (int i = 0; i < lista.size(); i++) {
            PerroTemporal = lista.obtener(i);

            if (PerroTemporal != null) {

                if (PerroTemporal.getIdentificador().equals(identificacion)) {
                    return PerroTemporal;

                }
            }
        }
        return null;
    }

    public void editarPerro(Perro perro ) throws documentoNoExisteExeption{

        Perro auxiliar = buscarPerro(perro.getIdentificador());
        if (auxiliar == null) {
            throw new documentoNoExisteExeption();
            
        }else {
     
            auxiliar.setNombre(perro.getNombre());
            auxiliar.setEdad(perro.getEdad());
            auxiliar.setRaza(perro.getRaza());
            auxiliar.setComida(perro.getComida());
            auxiliar.setEstado(perro.getEstado());
            auxiliar.setTratamiento(perro.getTratamiento());
            Singleton.getINSTANCIA().escribirObjetoPerro();
            
         
           
        }
       
    }

    public boolean eliminarPerro(String identificador) {

        for (int i = 0; i < lista.size(); i++) {

            if (lista.obtener(i) != null && lista.obtener(i).getIdentificador().equals(identificador)) {
               
                lista.eliminar(i);
                Singleton.getINSTANCIA().escribirObjetoPerro();
                return true;
                
            }

        }
        return false;
    }
    
    public Perro obtenerPerro(int espacio ){
        return lista.obtener(espacio);
        
    } 
    
    
    
    

}
