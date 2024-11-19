/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * • Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
 */
public class hotel5estrellas extends hotel4estrellas {
    
    private Integer CantidadSalonesDeConferencia;
    private Integer CantidadDeSuites;
    private Integer CantidadDeLimosinas;
    

    public hotel5estrellas() {
    }

    public hotel5estrellas(Integer CantidadSalonesDeConferencia, Integer CantidadDeSuites, Integer CantidadDeLimosinas, String gimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer cantidadHabitaciones, Integer numeroCamas, Integer cantidadPisos, Integer precioHabitaciones, String nombre, String localidad, String gerente, String direccion) {
        super(gimnasio, nombreRestaurante, capacidadRestaurante, cantidadHabitaciones, numeroCamas, cantidadPisos, precioHabitaciones, nombre, localidad, gerente, direccion);
        this.CantidadSalonesDeConferencia = CantidadSalonesDeConferencia;
        this.CantidadDeSuites = CantidadDeSuites;
        this.CantidadDeLimosinas = CantidadDeLimosinas;
    }

    

    public Integer getCantidadSalonesDeConferencia() {
        return CantidadSalonesDeConferencia;
    }

    public void setCantidadSalonesDeConferencia(Integer CantidadSalonesDeConferencia) {
        this.CantidadSalonesDeConferencia = CantidadSalonesDeConferencia;
    }

    public Integer getCantidadDeSuites() {
        return CantidadDeSuites;
    }

    public void setCantidadDeSuites(Integer CantidadDeSuites) {
        this.CantidadDeSuites = CantidadDeSuites;
    }

    public Integer getCantidadDeLimosinas() {
        return CantidadDeLimosinas;
    }

    public void setCantidadDeLimosinas(Integer CantidadDeLimosinas) {
        this.CantidadDeLimosinas = CantidadDeLimosinas;
    }

    @Override
    public String toString() {
        return "hotel5estrellas{" + "CantidadSalonesDeConferencia=" + CantidadSalonesDeConferencia + ", CantidadDeSuites=" + CantidadDeSuites + ", CantidadDeLimosinas=" + CantidadDeLimosinas + '}';
    }

    @Override
   
    public Integer calcularPrecioHabitacion() {
      
        
      Integer precio=super.calcularPrecioHabitacion();
        
        
      precio= precio+ CantidadDeLimosinas*15;
        
      return precio;
        
        
    }

    
  
            
            
            
            
    
    
 
}
