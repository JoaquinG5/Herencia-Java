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
public class Perro extends Animal{

    public Perro() {
    }

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void ALimentarse() {
        System.out.println("el perro " + nombre + " come " + alimento + "tiene " + edad + " años y es de raza  " + raza );
    }

 

    
    
    

}
