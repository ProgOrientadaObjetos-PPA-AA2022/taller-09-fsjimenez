/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class Prestamo {
    protected Persona beneficiario;
    protected int meses;
    protected String ciudad;
    
    public Prestamo(Persona ben, int m, String c){
        beneficiario = ben;
        meses = m;
        ciudad = c;
    }
    
    public void establecerBeneficiario(Persona b){
        beneficiario = b;
    }
    
    public void establecerMeses(int m){
        meses = m;
    }
    
    public void establecerCiudad(String c){
        ciudad = c;
    }
    
    public Persona obtenerBeneficiario(){
        return beneficiario;
    }
    
    public int obtenerMeses(){
        return meses;
    }
    
    public String obtenerCiudad(){
        return ciudad;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Beneficiario: \n%s\nNúmero de meses a"
                + " diferir: %d\nCiudad del préstamo: %s\n", beneficiario,
                                                          meses,
                                                          ciudad);
        return cadena;
    }
    
}
