/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete11;

/**
 *
 * @author reroes
 */
public class Profesor {
    private String nombre;
    private String tipo;
    
    public Profesor(String nom, String tipo){
        tipo = tipo;
        nombre=nom;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerTipo(String n){
        tipo = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerTipo(){
        return tipo;
    }
}
