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
public class Yate extends BarcoAMotor{
    
    protected Integer nroCamarotes;

 

    public Yate(Integer potenciaCv, Double eslora, Integer añoFabricacion, Integer matricula, String nombreCliente, Integer Documento, Integer diasAlquiler, Integer posicionAmarre, Barco Barcos) {
        super(potenciaCv, eslora, añoFabricacion, matricula, nombreCliente, Documento, diasAlquiler, posicionAmarre, Barcos);
    }

    public Yate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getNroCamarotes() {
        return nroCamarotes;
    }

    public void setNroCamarotes(Integer nroCamarotes) {
        this.nroCamarotes = nroCamarotes;
    }

    

   
    
    
}
