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
public final class Caballo extends Animal {

 
    @Override
    public void ALimentarse() {
        
        alimento="pasto";
        
        System.out.println("los caballos comen " + alimento);
        
    }
    
    
    
    
    
}
