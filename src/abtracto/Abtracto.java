/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abtracto;
import paises.Honduras;
import paises.USA;
import paises.Rusia;


/**
 *
 * @author CINDY GONZALEZ
 */
public class Abtracto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Honduras hn = new Honduras();
        Rusia r = new Rusia();
        USA us = new USA();
        
        // TODO code application logic here
        System.out.println("El pais es: "+hn.getpais()+" y su presidente es: "+hn.getpresidente());
        System.out.println("El pais es: "+r.getpais()+" y su presidente es: "+r.getpresidente());
        System.out.println("El pais es: "+us.getpais()+" y su presidente es: "+us.getpresidente());
        
    }
    
}
