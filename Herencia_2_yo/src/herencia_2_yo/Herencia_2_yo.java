/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_2_yo;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class Herencia_2_yo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       Electrodomestico Ele=new Electrodomestico();
       Lavadora l1=new Lavadora();
       List <Electrodomestico>el1=new ArrayList();
       String opc="";
        do {
            System.out.println("Vamos a cargar electrodomesticos");
            
            el1.add(l1.crearLavadora());
            System.out.println("Desea cargar otro Electrodomestico(Si/No)");
            opc=leer.next();
        } while (opc.equalsIgnoreCase("si"));
        for (Electrodomestico aux : el1) {
            a
        }
    }
    
}
