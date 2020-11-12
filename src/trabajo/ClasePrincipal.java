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
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ingeniero trabajo = new Ingeniero();
        
        trabajo.setNombre("CINDY GONZALEZ");
        System.out.println("el nombre del Ingeniero es: "+trabajo.getNombre());
       
         
        trabajo.setExperiencia(20);
         System.out.println("Su experiencia laboral es de: "+trabajo.getExperiencia () + " años");
      
         trabajo.sedEdad(24);
         System.out.println("la edad es: "+ trabajo.getEdad());
    }
    
}
