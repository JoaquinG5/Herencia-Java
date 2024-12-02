/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color, consumo energético (letras entre A y F) y peso.
 * Los constructoresque se deben implementar son los siguientes:
 * •Un constructor vacío.
 * •Un constructor con todos los atributos pasados por parámetro.
 * 
 * Los métodosa implementar son:
 * 
 * •Métodos getters y setters de todos los atributos.
 * 
 * • Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, sino es correcta usara la letra F por defecto. 
 * Este método se debe invocar al crear el objeto y no será visible.
 * 
 * •Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es, usa el color blanco por defecto. 
 * Los colores disponibles para los electrodomésticos son blanco, negro, rojo, azul y gris. 
 * No importa si el nombre está en mayúsculas o en minúsculas. Este método se invocará al crear el objeto y no será visible
 * 
 * Metodo crearElectrodomestico(): le pide la información al usuario y llena el electrodoméstico, también llama los métodos para comprobar el color y el consumo. 
 * Al precio se le da un valor base de $1000.
 * 
 * •Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del precio. Esta es la lista de precios
 * 
 * @author LILIANA
 */
public abstract class Electrodomestico {
    
    
     
 protected String color;
 protected String consumoEnergetico;
 protected double peso,precio;

    public Electrodomestico() {
    }

    public Electrodomestico(String color, int precio, String consumoEnergetico, double peso) {
        this.color = color;
        this.precio = precio;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
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
 
 
    
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
  
    
    public void comprobarConsumoEnergetico(String ConsumoEnergetico){
   
     System.out.println("comprobar la letra para definir el consumo electrico del equipo");
    String letra=leer.next();
     
    if(letra.equalsIgnoreCase("a")||(letra.equalsIgnoreCase("b"))||(letra.equalsIgnoreCase("c"))||(letra.equalsIgnoreCase("d"))||(letra.equalsIgnoreCase("e"))){
        consumoEnergetico=letra;
        System.out.println("la letra es correcta");
        
     
    }else{
        
       letra="f";
        System.out.println("la letra es f");
       }
        
    };
    
    public void comprobarColor(){
    
     System.out.println("inserte nombre del color");
        
     color=leer.next();
    
    if((color.equalsIgnoreCase("azul"))||(color.equalsIgnoreCase("rojo"))||(color.equalsIgnoreCase("negro"))||(color.equalsIgnoreCase("gris"))){
//        colorCorrecto=color;
        System.out.println("el color del electrodomestico es " + color);
     
    }else{
      color="blanco";
      System.out.println("el color del electrodomestico es " + color);
      

    }
    }
   
    
          
    
    
    public void crearElectrodomestioo(){

        System.out.println("crear electrodomestico");    
        comprobarColor();
        setPrecio(1000);
        System.out.println("inserte peso ");
        setPeso(leer.nextDouble());
        System.out.println("consumo Energetico");
        comprobarConsumoEnergetico(getConsumoEnergetico());

    
    };
    
    
    
    public void precioFinal(){
       
  
        
        System.out.println("el precio base del electrodomestico es de " + getPrecio());
        
        int pesoPrecio=0;
        
          System.out.println("mostrar nuevo precio por consumo energetico ");

       

          switch ((this.consumoEnergetico)) {
            case "a":
             case "A":
                 pesoPrecio=1000;
                setPrecio((int) (this.precio + pesoPrecio));
                 System.out.println("nuevo precio " + getPrecio());
                 break;
             case "b":
             case "B":
                pesoPrecio=800;
                setPrecio((int) (this.precio + pesoPrecio));
                 System.out.println("nuevo precio " + getPrecio());
                 break;
                  case "c":
                  case "C":
                 pesoPrecio=600;
                setPrecio((int) (this.precio + pesoPrecio));
                 System.out.println("nuevo precio " + getPrecio());
                 break;
               
               
                 case "d":
                 case "D":
                     pesoPrecio=500;
                setPrecio((int) (this.precio + pesoPrecio));
                 System.out.println("nuevo precio " + getPrecio());
                 break;
                
                case "E":
                case "e":
                    pesoPrecio=300;
                setPrecio((int) (this.precio + pesoPrecio));
                 System.out.println("nuevo precio " + getPrecio());
                 break;
               
       
                case "F":
                case "f":
                    pesoPrecio=100;
                setPrecio((int) (this.precio + pesoPrecio));
                 System.out.println("nuevo precio " + getPrecio());
                 break;
               
  
            default:
                System.out.println("inserte otra letra");
        }

        
        
        
        
        System.out.println("mostrar nuevo precio segun peso");
        
     
                if(getPeso()<=19){
                 pesoPrecio=100;
                System.out.println("mostrar precio " + getPrecio());
                setPrecio((int) (getPrecio() + pesoPrecio));
                 System.out.println("nuevo precio " + getPrecio());
               
                }else if((getPeso()>=20) && (getPeso()<=48)){
                    pesoPrecio=500;
                setPrecio((int) (getPrecio() + pesoPrecio));
                 System.out.println("nuevo precio " + getPrecio());
                 
                }
                
                else if((getPeso()>=50 )&& (getPeso()<=80)){
                    pesoPrecio=800;
                setPrecio((int) (getPrecio() + pesoPrecio));
                 System.out.println("nuevo precio " + getPrecio());
              
                } else if(getPeso()>80){
                   pesoPrecio=1000;
                setPrecio((int) (getPrecio() + pesoPrecio));
                 System.out.println("nuevo precio " + getPrecio());
               
                }else{
                System.out.println("fuera de rango,intente de nuevo"); 
                
               }

        
        System.out.println("precio final " + getPrecio());
        

    
    

    
    };

}







    

