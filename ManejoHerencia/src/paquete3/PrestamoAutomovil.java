/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Prestamo;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo{
    private String tipo;
    private String marca;
    private Persona garante1;
    private double valorAutomovil;
    private double valorMensual;
    
    public PrestamoAutomovil(Persona ben, int m, String c){
        super(ben, m, c);
    }
    
    @Override
    
    public void establecerCiudad(String c){
        ciudad = c.toLowerCase();
    }
    
    public void establecerTipo(String t){
        tipo = t;
    }
    
    public void establecerMarca(String m){
        marca = m;
    }
    
    public void establecerGarante(Persona g){
        garante1 = g;
    }
    
    public void establecerValorAutomovil(double v){
        valorAutomovil = v;
    }
    
    public void calcularValorMensual(){
        valorMensual = valorAutomovil/obtenerMeses();
    }
    
    public String obtenerTipo(){
        return tipo;
    }
    
    public String obtenerMarca(){
        return marca;
    }
    
    public Persona obtenerGarante(){
        return garante1;
    }
    
    public double obtenerValorAutomovil(){
        return valorAutomovil;
    }
    
    public double obtenerValorMensual(){
        return valorMensual;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%sTipo de Automóvil: %s\nMarca del"
                + " Automóvil: %s\nDatos del Garante: \n%s\n"
                + "Valor del Automóvil: %.2f\nValor a pagar mensualmente: %.2f",
                                                super.toString(),
                                                tipo,
                                                marca,
                                                garante1,
                                                valorAutomovil,
                                                valorMensual);
        return cadena;
    }
    
}
