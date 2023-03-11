//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia2ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Raven
 */
public class Dia2ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
                String nombre;
                System.out.println("Ingrese un nombre");
                nombre = leer.next();
                System.out.println("El nombre es: " + nombre);
                
    }
    
}
