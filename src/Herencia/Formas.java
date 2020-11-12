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
public class Formas {
    private String dibujar;
    private String color;
     Scanner entrada = new Scanner(System.in);
   
    
   public Formas(){
    
}
   public void setDibujar(String dibujar){
       this.dibujar=dibujar;
   }
   public String getDibujar(){
       return this.dibujar;
   }
    public void setColor(String color){
       this.color=color;
   }
   public String getColor(){
       return this.color;
   }
   
   
   
   public void imprimirinformacion(){
       System.out.println("Dibujar: "+dibujar);
       System.out.println("Color: "+color);
       
   }
    
}
