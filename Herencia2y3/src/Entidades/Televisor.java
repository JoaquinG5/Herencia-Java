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

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public int resolucion;
    public boolean sintonizadorTDT;

    public Televisor() {
    }


    public Televisor(int resolucion, boolean sintonizadorTDT, String color, int precio, String consumoEnergetico, double peso) {
        super(color, precio, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
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

    
//    Electrodomestico e= new Televisor();
    
    
    
//    @Override
//    public void comprobarConsumoEnergetico() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void comprobarColor() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//    @Override
//    public void crearElectrodomestioo() {
//       
//    }

    
    public Electrodomestico crearTelevisor(){
    
        
        Electrodomestico fd=new Electrodomestico() {};
        fd.crearElectrodomestioo();
        
        Televisor tv=new Televisor();
        
        
        System.out.println("crear televicosr");
       
        System.out.println("inserte resolucion de tv");
        tv.setResolucion(leer.nextInt());
        tv.setSintonizadorTDT(sintonizadorTDT);
        
        
        return fd;
    
    
    
    }
    
    
    
  
    public int precioFinal(Electrodomestico fd) {
     
        
        fd.precioFinal(fd);
        
        Televisor tv=new Televisor();
        
        System.out.println("averiguar las pulgadas del televisor");
        
        if((tv.getResolucion()>=40)&&(tv.isSintonizadorTDT()==true)){
        
        int aumento=(int) (fd.getPrecio()*0.30);
            
            
        fd.setPrecio(fd.getPrecio()+aumento +500);
            
            System.out.println("precio final " + fd.getPrecio());
            
        return fd.getPrecio();
        
        }else{
        
        
         System.out.println("precio final " + fd.getPrecio());
        
           return fd.getPrecio();
        }
        
     
        
        
        
    }
    
    
    
    
}
