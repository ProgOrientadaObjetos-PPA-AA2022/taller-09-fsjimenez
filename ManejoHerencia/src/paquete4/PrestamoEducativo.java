/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.Prestamo;
import paquete5.Persona;
import paquete6.InstitucionEducativa;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo{
    private String nivelEstudio;
    private InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double valorMensual;
    
    public PrestamoEducativo(Persona ben, int m, String c){
        super(ben, m, c);
    }
    
    @Override
    
    public void establecerCiudad(String c){
        ciudad = c.toUpperCase();
    }
    
    public void establecerNivel(String n){
        nivelEstudio = n;
    }
    
    public void establecerCentroEducativo(InstitucionEducativa i){
        centroEducativo = i;
    }
    
    public void establecerValorCarrera(double c){
        valorCarrera = c;
    }
    
    public void calcularValorMensual(){
        valorMensual = (valorCarrera/obtenerMeses())-
                (valorCarrera/obtenerMeses())*0.1;
    }
    
    public String obtenerNivel(){
        return nivelEstudio;
    }
    
    public InstitucionEducativa obtenerCentroEducativo(){
        return centroEducativo;
    }
    
    public double obtenerValorCarrera(){
        return valorCarrera;
    }
    
    public double obtenerValorMensual(){
        return valorMensual;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%s\nNivel de Estudio: %s\nCentro"
                + "Educativo: \n%s\nValor de la Carrera: %.2f\n"
                + "Valor a pagar mensualmente: %.2f",
                                                super.toString(),
                                                nivelEstudio,
                                                centroEducativo,
                                                valorCarrera,
                                                valorMensual);
        return cadena;
    }
    
}
