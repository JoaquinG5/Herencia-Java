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
public abstract class Animal {
    
    protected String nombre;
    protected String raza;
    protected Integer edad;
    protected String alimento;
    
    public Animal() {
    }

    public Animal(String nombre, String raza, Integer edad, String alimento) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.alimento = alimento;
    }
    
    
    public abstract void alimentarse();

 
    
    
    
    
    
}
