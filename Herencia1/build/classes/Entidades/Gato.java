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
public  class Gato extends Animal{

    public Gato() {
    }

    public Gato(String nombre, String raza, Integer edad, String alimento) {
        super(nombre, raza, edad, alimento);
    }

    
    @Override
    public void alimentarse() {
        
          
        
     System.out.println("el gato " + nombre + "  de raza " + raza + " que tiene " + edad + " años almuerza siempre " + alimento);

    }
    
        
    }
    
    
    
    

