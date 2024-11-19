/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alquiler;
import Entidades.Barco;

/**
 *
 * @author LILIANA
 */
public class Servicios extends Alquiler{

    private Object leer;

    
   public void crearCliente(){
       
     
       System.out.println("nombre");
       super.setNombreCliente(leer.next());
       System.out.println("documento");
       super.setDocumento(leer.nextInt());
       System.out.println("dias de alquiler");
       super.setDiasAlquiler(leer.nextInt());
       System.out.println("posicion de amarre");
       super.setPosicionAmarre(leer.nextInt());
    
}
   
   
   public void calcularAlquiler(Barco B1){
       
       BarcoServicio bs= new BarcoServicio();
       bs.crearBarco();
       crearCliente();
   }
    
}
