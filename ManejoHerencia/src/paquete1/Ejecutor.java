/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete5.Persona;
import paquete6.InstitucionEducativa;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opc, meses;
        String ciudad, tipo, marca, nivelEstudio, nombre, apellido, username,
                nombreInstitucion, siglas, cadenaAuto = "", cadenaEdu = "", 
                apellidoGarante, usernameGarante, nombreGarante, cadenaFinal;
        double valorAutomovil, valorCarrera;

        do {
            System.out.println("Ingresar datos para un préstamo automóvil  [1]");
            System.out.println("Ingresar datos para un préstamo educativo  [2]");
            System.out.println("Salir                                      [0]"); //La opcion salir es la condicion para que el usuario deje de ingresar datos
            opc = entrada.nextInt();

            if (opc != 1 && opc != 2 && opc != 0) {
                System.out.println("Numero no valido");
            
            } else if (opc == 0) {
                break;
            }
{
                entrada.nextLine();
                System.out.println("Ingrese el nombre del beneficiario: ");
                nombre = entrada.nextLine();
                System.out.println("Ingrese el apellido del beneficiario: ");
                apellido = entrada.nextLine();
                System.out.println("Ingrese el username del beneficiario: ");
                username = entrada.nextLine();
                System.out.println("Ingrese el numero de meses a diferir: ");
                meses = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Ingrese la ciudad del préstamo: ");
                ciudad = entrada.nextLine();
                
                if (opc == 1) {
                    int i = 1;
                    System.out.println("Ingrese el tipo de automovil: ");
                    tipo = entrada.nextLine();
                    System.out.println("Ingrese la marca del automóvil: ");
                    marca = entrada.nextLine();
                    System.out.println("Ingrese los nombres del garante: ");
                    nombreGarante = entrada.nextLine();
                    System.out.println("Ingrese los apellidos del garante: ");
                    apellidoGarante = entrada.nextLine();
                    System.out.println("Ingrese el username del garante");
                    usernameGarante = entrada.nextLine();
                    System.out.println("Ingrese el valor del automóvil: ");
                    valorAutomovil = entrada.nextDouble();
                                 
                    Persona beneficiario = new Persona(nombre, apellido, username);
                    Persona garante = new Persona(nombreGarante, apellidoGarante,
                                                                usernameGarante);
                    PrestamoAutomovil presAuto = new PrestamoAutomovil(
                                        beneficiario, meses, ciudad);
                    presAuto.establecerGarante(garante);
                    presAuto.establecerTipo(tipo);
                    presAuto.establecerMarca(marca);
                    presAuto.establecerValorAutomovil(valorAutomovil);
                    presAuto.calcularValorMensual();
                    presAuto.establecerCiudad(ciudad);
                    
                    cadenaAuto = String.format("Prestamo de Automóvil %s\n\n%s%s\n"
                            + "----------------------------------------------",
                                                i, cadenaAuto, presAuto);
                    
                }else if (opc == 2) {
                    int j = 1;
                    System.out.println("Ingrese el nivel de estudio: ");
                    nivelEstudio = entrada.nextLine();
                    System.out.println("Ingrese el nombre del Centro Eductivo:");
                    nombreInstitucion = entrada.nextLine();
                    System.out.println("Ingrese las siglas del Centro Educativo");
                    siglas = entrada.nextLine();
                    System.out.println("Ingrese el valor de la carrera: ");
                    valorCarrera = entrada.nextDouble();
                    
                    Persona beneficiario = new Persona(nombre, apellido, username);
                    InstitucionEducativa centro = new InstitucionEducativa(nombre,
                                                                          siglas);
                    PrestamoEducativo presEdu = new PrestamoEducativo(
                                        beneficiario, meses, ciudad);
                    presEdu.establecerCiudad(ciudad);
                    presEdu.establecerNivel(nivelEstudio);
                    presEdu.establecerCentroEducativo(centro);
                    presEdu.establecerValorCarrera(valorCarrera);
                    presEdu.calcularValorMensual();
                    
                    cadenaEdu = String.format("Prestamo Educativo %s\n\n%s%s\n"
                            + "----------------------------------------------",
                                                j, cadenaEdu, presEdu);
                }
            }
        } while (opc != 0);
        
        
        cadenaFinal = String.format("Lista de Préstamo Automóvil\n%s\n"
                + "Lista de Préstamo Educativo\n%s", cadenaAuto, cadenaEdu);
        System.out.println(cadenaFinal);
    }
}
