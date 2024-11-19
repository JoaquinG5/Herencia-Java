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
public final class EdificioDeOficinas extends Edificio{
    
    private Integer numeroOficinas;
    private Integer numeroPersonasPorOficina;
    private Integer cantidadPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer numeroOficinas, Integer numeroPersonasPorOficina, Integer cantidadPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numeroOficinas = numeroOficinas;
        this.numeroPersonasPorOficina = numeroPersonasPorOficina;
        this.cantidadPisos = cantidadPisos;
    }

    public Integer getNumeroOficinas() {
        return numeroOficinas;
    }

    public void setNumeroOficinas(Integer numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    public Integer getNumeroPersonasPorOficina() {
        return numeroPersonasPorOficina;
    }

    public void setNumeroPersonasPorOficina(Integer numeroPersonasPorOficina) {
        this.numeroPersonasPorOficina = numeroPersonasPorOficina;
    }

    public Integer getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(Integer cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "numeroOficinas=" + numeroOficinas + ", numeroPersonasPorOficina=" + numeroPersonasPorOficina + ", cantidadPisos=" + cantidadPisos + '}';
    }
    

    @Override
    public void calcularSuperficie() {
      double superficieEdificioOficinas=super.ancho*super.largo;
        System.out.println("la superficie de el edificio con oficinas es " + superficieEdificioOficinas);
    }

    @Override
    public void calcularVolumen() {
        double volumenEdificioOficinas=(super.ancho*super.largo*super.alto)*cantidadPisos;
        System.out.println("el volumen de el edificio con oficinas es " + volumenEdificioOficinas);
    }
    
    
    public void cantPersonas(){
        
        System.out.println("la cantidad de Personas que entran dentro del edificio con oficinas es " + numeroPersonasPorOficina*numeroOficinas*cantidadPisos);
     
    }
            
    
   
    
    
    
}
