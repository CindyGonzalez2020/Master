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
public class Circulo extends Formas {
    private double diametro=42;
    private double radio;

    public Circulo() {
       System.out.println("Ingrese El color del Circulo");

        
        setDibujar("circulo");
        setColor(entrada.next());
       

    }   
    public double radio(){
        radio = diametro/2;
        
        return radio;
    }
    
}
