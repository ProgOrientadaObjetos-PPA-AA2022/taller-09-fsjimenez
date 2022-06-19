/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author Usuario iTC
 */
public class InstitucionEducativa {
    private String nombre;
    private String siglas;
    
    public InstitucionEducativa(String n, String s){
        nombre = n;
        siglas = s;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerSiglas(){
        return siglas;
    }
}
