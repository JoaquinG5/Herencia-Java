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
public class BarcoAMotor extends Barco {
    
    protected Integer potenciaCv;

    public BarcoAMotor() {
    }


    public BarcoAMotor(Integer potenciaCv, Double eslora, Integer añoFabricacion, Integer matricula, String nombreCliente, Integer Documento, Integer diasAlquiler, Integer posicionAmarre, Barco Barcos) {
        super(eslora, añoFabricacion, matricula, nombreCliente, Documento, diasAlquiler, posicionAmarre, Barcos);
        this.potenciaCv = potenciaCv;
    }

    public Integer getPotenciaCv() {
        return potenciaCv;
    }

    public void setPotenciaCv(Integer potenciaCv) {
        this.potenciaCv = potenciaCv;
    }

    

    
       
    
    
    
}
