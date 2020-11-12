/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.practicos;

import java.util.Scanner;

/**
 *
 * @author CINDY GONZALEZ
 */
public class Ejercicio2 {
    public static void main(String[] args) {
       Scanner Dato = new Scanner(System.in);
        int  num1, num2;
        System.out.println("Ingrese primer valor");
        num1 = Dato.nextInt();
        System.out.println("Ingrese Segundo valor");
        num2= Dato.nextInt();
        
        System.out.println("La suma: " + (num1+num2));
        System.out.println("La Resta: " + (num1-num2));
        System.out.println("La Multiplicacion: " + (num1*num2));
        System.out.println("La Division: " + (num1/num2));
    }
    
}
