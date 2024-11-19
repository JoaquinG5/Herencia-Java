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


    public Lavadora(int carga, String color, int precio, String consumoEnergetico, double peso) {
        super(color, precio, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    

       
    public void CrearLavadora(Electrodomestico e){
 
        
      crearElectrodomestioo();
    
   System.out.println("inserte carga que llevara la lavadora");
   this.carga=leer.nextInt();
    
  
   
   
    
    }
    
    
//    public void comprobarConsumoEnergetico() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public void comprobarColor() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void crearElectrodomestioo() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }


    
        
//         System.out.println("mostrar precio actual " + ed.precioFinal(ed));
    

public void precioFinal(){
       
  
//    System.out.println("averiguar muevo precio del electrodomestico por su carga");
//    System.out.println("precio viejo " + (precioFinal(e)));
    
    super.precioFinal();
   
     
      if(this.carga>=30){
              
      
         e.setPrecio(e.getPrecio()+500);
         System.out.println("precio final " + e.getPrecio());
          
          
         }else{
           System.out.println("precio final " + e.getPrecio());
                  
         }
    

      
}
                
  
}
