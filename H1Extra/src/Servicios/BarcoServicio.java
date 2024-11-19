/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Barco;
import Entidades.BarcoAMotor;
import Entidades.Velero;
import Entidades.Yate;


/**
 *
 * @author LILIANA
 */
public class BarcoServicio extends Barco{

   
    
    public void crearBarco(){
        System.out.println("ingrese la matricula");
        super.setMatricula(leer.nextInt());
        System.out.println("ingrese la eslora");
        super.setEslora(leer.nextInt());
        System.out.println("ingrese el modelo");
       super.setAñoFabricacion(leer.nextInt());
    }
    
    
    public void diferenciarBarco(){
         
          Barco b1= new Barco();
        
        
       int opcion=leer.nextInt();
       
        System.out.println("ingrese el tipo de barco a alquilar\n : 1-velero\n  2-barco a motor\n  3-yate");
       
        switch (opcion) {
            case 1:
                System.out.println("cuantos mastiles tiene el velero");
                
                Velero v1= new Velero();
                v1.getNumeroMastiles();
                
                break;
            case 2:
                System.out.println("cuantos caballos de potencia tiene el motor de su barco");
                
                BarcoAMotor a1= new BarcoAMotor();
                a1.getPotenciaCv();
               
                break;
            case 3:
                
                System.out.println("cuantos camarotes tiene su yate");
                
                Yate y1= new Yate();
                y1.getNroCamarotes();
                System.out.println("cuantos caballos de potencia tiene el  motor de yate ?");
                y1.getPotenciaCv();
                break;
            case 4:
                
                break;
                
                
                
                
                
            default:
                throw new AssertionError();
        }
        
    }
    
}
