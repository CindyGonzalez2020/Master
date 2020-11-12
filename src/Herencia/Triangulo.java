/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author CINDY MODESTA GONZALEZ VELASQUEZ
 */
public class Triangulo extends Formas {
     private int base=20;
     private int altura=2;
     private int area;

    public Triangulo() {
        System.out.println("Ingrese El color del Triangulo");
       setDibujar("Triangulo");
      setColor(entrada.next());
       
    }

   
    public int Area()
    {
        area=(base*altura)/(2);
        
    return area;
       
    
}
}
