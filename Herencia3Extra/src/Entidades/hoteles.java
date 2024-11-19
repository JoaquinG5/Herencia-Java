/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *

 * Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
características de las distintas categorías son las siguientes:
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad
 * 
 * 
 * 
 */
public class hoteles extends alojamiento{
    
    private Integer cantidadHabitaciones;
    private Integer numeroCamas;
    private Integer cantidadPisos;
    private Integer precioHabitaciones;

    public hoteles() {
    }

    public hoteles(Integer cantidadHabitaciones, Integer numeroCamas, Integer cantidadPisos, Integer precioHabitaciones, String nombre, String localidad, String gerente, String direccion) {
        super(nombre, localidad, gerente, direccion);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantidadPisos = cantidadPisos;
        this.precioHabitaciones = precioHabitaciones;
    }

    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public Integer getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(Integer numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public Integer getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(Integer cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public Integer getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(Integer precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }

    @Override
    public String toString() {
        return "hoteles{" + "cantidadHabitaciones=" + cantidadHabitaciones + ", numeroCamas=" + numeroCamas + ", cantidadPisos=" + cantidadPisos + ", precioHabitaciones=" + precioHabitaciones + '}';
    }
    
    
    public Integer calcularPrecioHabitacion(){
        
        precioHabitaciones=50;
        
        Integer cantidadPersonas= numeroCamas*cantidadPisos;
        
        Integer p1=precioHabitaciones*cantidadPersonas;
        
        return p1;
        
        
        
        
    }
    
    
}
