/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author LILIANA
 */
public class Lavadora extends Electrodomestico{

    
    public int carga;
 

    public Lavadora() {
    }

    

    public Lavadora(int carga, String color, int precio, String consumoEnergetico, int peso) {
        super(color, precio, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

     Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
 
    
    
     public void CrearLavadora(){
 
        
//      crearElectrodomestioo();
      
   System.out.println("inserte carga que llevara la lavadora");
    setCarga(leer.nextInt());
    
    }
    
    
   public int precioFinal(){
       
   super.precioFinal();

    
     System.out.println("la carga en la lavadora es de " + getCarga());

         
      if(this.carga>=30){
         
          int a=(int) (getPrecio()+500);
         
          setPrecio(a);
          
          System.out.println("precio Final " + getPrecio());
          
      }else{
           
          System.out.println("precio Final " + getPrecio());
          
        
         }
        return (int) getPrecio();
  
      
}            
  
}
