/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author LILIANA
 */
public class Gato extends Animal{

    
    String nombre="joaquin";
    
    @Override
    public void ALimentarse() {
    
         alimento="galletas";
    
         System.out.println("los gatos comen " + alimento);
         
        
    }
    
    
    
    
    
    
}
