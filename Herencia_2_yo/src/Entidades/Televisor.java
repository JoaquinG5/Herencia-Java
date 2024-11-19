/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Pergo
 */
public final class Televisor extends Electrodomestico {

    private int resolucion;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizador, Integer precio, Integer peso, String color) {
        super(precio, peso, color);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    /*
    Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
     */
    public void crearTelevisor() {
        crearElectrodomestico();
        System.out.println("Cuales son las pulgadas del televisor");
        setResolucion(leer.nextInt());
        System.out.println("Tiene sintonizador?(si/no)");
        String opc=leer.next();
        if (opc.equalsIgnoreCase("si")) {
            setSintonizador(true);
        }else {
            setSintonizador(false);
        }
        
    }
}
