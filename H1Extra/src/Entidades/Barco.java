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
public class Barco extends Alquiler{
    
    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    protected Double eslora;
    protected Integer añoFabricacion;
    protected Integer matricula;

    public Barco(String nombreCliente, Integer Documento, Integer diasAlquiler, Integer posicionAmarre, Barco Barcos) {
        super(nombreCliente, Documento, diasAlquiler, posicionAmarre, Barcos);
    }

  
    
    
    
    
    public Barco(Double eslora, Integer añoFabricacion, Integer matricula, String nombreCliente, Integer Documento, Integer diasAlquiler, Integer posicionAmarre, Barco Barcos) {
        super(nombreCliente, Documento, diasAlquiler, posicionAmarre, Barcos);
        this.eslora = eslora;
        this.añoFabricacion = añoFabricacion;
        this.matricula = matricula;
    }

    
    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    public Integer getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(Integer añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

   

    
    
}
