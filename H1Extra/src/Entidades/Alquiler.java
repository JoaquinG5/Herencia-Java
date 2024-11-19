/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author LILIANA
 */

public class Alquiler {
    
    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    protected String nombreCliente;
    protected Integer Documento;

    protected Integer diasAlquiler;
    protected Integer posicionAmarre;
    protected Barco Barcos;

    public Alquiler(String nombreCliente, Integer Documento, Integer diasAlquiler, Integer posicionAmarre, Barco Barcos) {
        this.nombreCliente = nombreCliente;
        this.Documento = Documento;
        this.diasAlquiler = diasAlquiler;
        this.posicionAmarre = posicionAmarre;
        this.Barcos = Barcos;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Integer getDocumento() {
        return Documento;
    }

    public void setDocumento(Integer Documento) {
        this.Documento = Documento;
    }

    public Integer getDiasAlquiler() {
        return diasAlquiler;
    }

    public void setDiasAlquiler(Integer diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }

    public Integer getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(Integer posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarcos() {
        return Barcos;
    }

    public void setBarcos(Barco Barcos) {
        this.Barcos = Barcos;
    }


  

    
}