/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author Usuario iTC
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String username;
    
    public Persona(String n, String a, String u){
        nombre = n;
        apellido = a;
        username = u;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerApellido(String a){
        apellido = a;
    }
    
    public void establecerUsername(String u){
        username = u;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerApellido(){
        return apellido;
    }
    
    public String obtenerUsername(){
        return username;
    }
    
    @Override
    
    public String toString(){
        String cadena = String.format("Nombre: %s\nApellido: %s\n"
                + "Username: %s", nombre, apellido, username);
        return cadena;
    }
}
