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
public class Televisor extends Electrodomestico{

    
    
    public int resolucion;
    public boolean sintonizadorTDT;

    public Televisor() {
    }


    public Televisor(int resolucion, boolean sintonizadorTDT, String color, int precio, String consumoEnergetico, double peso) {
       super(color, precio, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(int i, boolean b, String rojo, String a, int i0, int i1, int i2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


   

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    
    
    
     public void crearTelevisor(){
    
        
       
       crearElectrodomestioo();
        
        
        
        System.out.println("crear televiso");
       
        System.out.println("inserte resolucion de tv");
        setResolucion(leer.nextInt());
        setSintonizadorTDT(false);
        
     }

      
    
    
    
    
    
    
    
  
    public void precioFinal() {
     
     super.precioFinal();
        
        System.out.println("pulgadas del televisor " + getResolucion());
        
        int porcentaje=(int)(getPrecio()*0.30);
        int aumento=(int) (porcentaje+ getPrecio());
        int recargoCable=500;
        
        if((this.resolucion)>=40){
  
        System.out.println("aumento de " + porcentaje + " pesos");
            
        setPrecio(aumento);
            
       }else{

         System.out.println("precio final " + getPrecio());

        }
        
        System.out.println("inserte si sintoniza antena de cable");
        String r=leer.next();
        
        if(r.equalsIgnoreCase("si")){
           this.sintonizadorTDT=true;
       
             setPrecio((int) getPrecio() +recargoCable);
               
              System.out.println("aumento de uso de cable de " + recargoCable + " pesos");
               
            System.out.println("precio final " + getPrecio());
            
           }else{
             
           this.sintonizadorTDT=false;
           setPrecio((int) getPrecio());
            
            System.out.println("precio final " + getPrecio());
            
          }
     
   }
        
        
    }
    

    
   
    
    
    
    

