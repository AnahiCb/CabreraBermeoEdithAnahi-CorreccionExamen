/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Anahi
 */
public class Lavadora extends Electrodomestico {
    private int carga;

    public Lavadora(int codigo) {
        super(codigo);
    }

    public Lavadora() {
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public double obtenerPrecioFinal() {
        double precioF = super.obtenerPrecioFinal();
        double precioB = super.getPrecioBase();
        double precio = precioF + precioB;
        if (super.getPeso() > 30) {
            precio=precio+ 50;
        }
        
        return precio;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + "\nDatos Lavadora: \n" + "carga: " + carga + "\nPrecio Final: "
                + this.obtenerPrecioFinal();
    }
    
}
