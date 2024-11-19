/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioherencia1;

/**
 *
 * @author LILIANA
 */
public class Animal {
    
    protected String saludo;
    
    
    public void hacerRuido(){
        
        saludo="hola";
       
        System.out.println(saludo);
        
        
    }

    public Animal() {
    }

    public Animal(String saludo) {
        this.saludo = saludo;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    @Override
    public String toString() {
        return "Animal{" + "saludo=" + saludo + '}';
    }
    
    
    
    
}
