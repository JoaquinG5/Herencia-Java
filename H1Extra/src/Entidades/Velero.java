/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author LILIANA
 */
public class Velero extends Barco{
    
    protected Integer numeroMastiles;

    
    
    
    public Velero(Integer numeroMastiles, Double eslora, Integer añoFabricacion, Integer matricula, String nombreCliente, Integer Documento, Integer diasAlquiler, Integer posicionAmarre, Barco Barcos) {
        super(eslora, añoFabricacion, matricula, nombreCliente, Documento, diasAlquiler, posicionAmarre, Barcos);
        this.numeroMastiles = numeroMastiles;
    }

    public Velero() {
        
    }



    public Integer getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(Integer numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

   
    
}
