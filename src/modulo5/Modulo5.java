package modulo5;


import Herencia.Circulo;
import Herencia.Formas;
import Herencia.Linea;
import Herencia.Triangulo;
import Herencia.Cuadrado;

       

/**
 *
 * @author CINDY MODESTA GONZALEZ VELASQUEZ
 */
public class Modulo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circulo= new Circulo();
        Formas formas = new Formas();
        Linea linea= new Linea();
        Triangulo triangulo = new Triangulo(); 
        Cuadrado cuadrado = new Cuadrado();
        
        
       
        circulo.imprimirinformacion();
        System.out.println("El radio del Circulo es de :"+circulo.radio());
        
        System.out.println("Figura 2");
        linea.imprimirinformacion();
        System.out.println("La linea tiene una longitud de: "+linea.Linea() + " Unidades");
        
        System.out.println("Figura 3");
        triangulo.imprimirinformacion();
        System.out.println("El area del Triangulo es: "+triangulo.Area());
        
        System.out.println("Figura 4");
        cuadrado.imprimirinformacion();
        System.out.println("Su area es: "+cuadrado.Area());
    }
    
}
