/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 */
public class hotel4estrellas extends hoteles{
    
    private String gimnasio;
    private String nombreRestaurante;
    private Integer capacidadRestaurante;
   

    public hotel4estrellas() {
    }

    public hotel4estrellas(String gimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer cantidadHabitaciones, Integer numeroCamas, Integer cantidadPisos, Integer precioHabitaciones, String nombre, String localidad, String gerente, String direccion) {
        super(cantidadHabitaciones, numeroCamas, cantidadPisos, precioHabitaciones, nombre, localidad, gerente, direccion);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }
  
    
    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public Integer getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(Integer capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    

    @Override
    public String toString() {
        return "hotel4estrellas{" + "gimnasio=" + gimnasio + ", nombreRestaurante=" + nombreRestaurante + ", capacidadRestaurante=" + capacidadRestaurante + '}';
    }
    
    
     public Integer precioHabitacionHotel4(){
         
         Integer resultado=0;
        
         if (capacidadRestaurante<30){
         
        resultado=super.calcularPrecioHabitacion() + 10;
         
     } else if (capacidadRestaurante>30 && capacidadRestaurante<50){
         
          resultado=super.calcularPrecioHabitacion() + 30;
         
     } else {
         
         resultado = super.calcularPrecioHabitacion() + 50;
     }
       
         if (gimnasio=="a"){
             
             resultado = resultado +  50;
             
         } else{
         
          resultado= resultado + 30;
     }
         
         
         
         return resultado;
         
       
         
     }
    
    
}
