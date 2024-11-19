/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.Scanner;

/**
 *
 * @author LILIANA
 */

    
    public class Rectangulo implements calculosFormas{
        
      double base,altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = 20;
        this.altura = 30;
    }
  
        
    @Override
    public double calcularArea() {
        
        double area=base*altura;
        
        System.out.println("el area de el rectangulo es " + area);
            
        
        return area;
        
        
    }

    @Override
    public double calcularPerimetro() {
        
        double perimetro=((base+altura)/2);
            
                
        System.out.println("el perimetro de el rectangulo es " + perimetro);
            
        
                
                return perimetro;

    }
        
        
    
    
        
        
        
        
        
        
    }
    
    
    

