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
public class Polideportivo extends Edificio{

    private String nombre;
    private String tipoInstalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String tipoInstalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }
    
    @Override
    public void calcularSuperficie() {
        Double superficieDeportivo=super.largo*super.ancho;
        System.out.println("la superficie del polideportivo es " + superficieDeportivo);
    }

    @Override
    public void calcularVolumen() {
      Double volumenPolideportivo=super.ancho*super.largo*super.alto;
        System.out.println("el volumen del polideportivo es" + volumenPolideportivo);
    }
    
    
     public void tipoInstalacionTecho(){
         
         System.out.println(tipoInstalacion);
         
     }
    
    
    
}
