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
public class Linea extends Formas {
       private int linea=16;

    public Linea() {
        
        System.out.println("Ingrese El color de la Linea");
       setDibujar("Linea");
        setColor(entrada.next());
        
       
    }


    public int Linea ()
    {
       return linea;
        
 
        
    }
}
