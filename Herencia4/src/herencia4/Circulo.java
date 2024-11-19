/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

    
   public class Circulo implements calculosFormas{

       
       double diametro;
       double radio;

    public Circulo() {
    }

    public Circulo(double diametro, double radio) {
        this.diametro = 5;
        this.radio = 10;
    }
       
       
       
    @Override
    public double calcularArea() {
      
     double area=Pi1*Math.pow(radio,2);      
    
     System.out.println("el area de el circulo es " + area);
          
     return area;
     
    }
    
    
    @Override
    public double calcularPerimetro() {
           
        double perimetro=Pi1*diametro;
        
        System.out.println("el perimetro del circulo es  " + perimetro);
        
        return perimetro;
        
    }
       
       
       
       
    
    
    
    
}
