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
public final class Lavadora extends Electrodomestico {

    private Integer carga;

    public Lavadora() {

    }

    public Lavadora(Integer carga, Integer precio, Integer peso, String color) {
        super(precio, peso, color);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    /*
    Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
     */
    public Electrodomestico crearLavadora() {
        Lavadora l1 = new Lavadora();

        System.out.println("Cual es la carga de la lavadora");
        setCarga(leer.nextInt());
        crearElectrodomestico();
        return l1;
    }

    /*
    Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
     */

    @Override
    public Integer precioFinal(Electrodomestico e1) {
        Integer precio1;
        switch (e1.getConsumoEnergetico()) {
            case 'A':
            case 'a':
                precio1 = (e1.getPrecio() + 1000);
                break;
            case 'B':
            case 'b':
                precio1 = (e1.getPrecio() + 800);
                break;
            case 'C':
            case 'c':
                precio1 = (e1.getPrecio() + 600);
                break;
            case 'D':
            case 'd':
                precio1 = (e1.getPrecio() + 500);
                break;
            case 'E':
            case 'e':
                precio1 = (e1.getPrecio() + 300);
                break;
            case 'F':
            case 'f':
                precio1 = (e1.getPrecio() + 100);
                break;
            default:
                precio1 = 1000;
                break;
        }
        if (e1.getPeso() > 1 && e1.getPeso() < 19) {
            precio1 = precio1 + 100;
        } else if (e1.getPeso()
                > 20 && e1.getPeso() < 49) {
            precio1 = precio1 + 500;
        } else if (e1.getPeso() > 50 && e1.getPeso() < 79) {
            precio1 = precio1 + 800;
        } else if (e1.getPeso() > 80) {
            precio1 = precio1 + 1000;
        }
        if (getCarga() > 30) {
            precio1 = precio1 + 500;
        }
        return precio1;
    }

//    @Override
//    public Integer precioFinal(Electrodomestico e1) {
//        int precio1=getPrecio();
//         if (getCarga()>30) {
//           precio1=precio1+500;
//        }
//        return super.precioFinal(e1); //To change body of generated methods, choose Tools | Templates.
//        
//    }

  
}
