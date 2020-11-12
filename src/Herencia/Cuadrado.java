/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import java.util.Scanner;

/**
 *
 * @author CINDY MODESTA GONZALEZ VELASQUEZ
 */
public class Cuadrado extends Formas {
   
     double lado=10;
  double res1;  
  
    public Cuadrado()
    {
      System.out.println("Ingrese El color del Cuadrado");
      setDibujar("cuadrado");
      setColor(entrada.next());
    }
    public double Area()
    {
       res1= lado*lado;
    return res1;
    }
}
