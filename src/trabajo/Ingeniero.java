/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo;

/**
 *
 * @author CINDY GONZALEZ
 */
public class Ingeniero {
    private String nombre; 
    private int edad;
    private int experiencia;
    
    public Ingeniero(){
    
 }
    
     public void sedEdad(int edad){
   this.edad = edad; 
    }
    
    public int getEdad(){
        return edad; 
    }
    
    public void setNombre(String nombre){
       this.nombre = nombre; 
    }
    
    public String getNombre(){
     return nombre;    
    }
    
    public int getExperiencia (){
        return experiencia;
    }
    
    public void setExperiencia(int experiencia){
        this.experiencia = experiencia;
    }
    
 
}
