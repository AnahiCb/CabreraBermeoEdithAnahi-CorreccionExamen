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
public class Television extends Electrodomestico{
    private int resolucion;
    private boolean puertoHDMI;

    public Television(int codigo) {
        super(codigo);
    }

    public Television() {
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isPuertoHDMI() {
        return puertoHDMI;
        
    }
    public void setPuertoHDMI(boolean puertoHDMI) {
        this.puertoHDMI = puertoHDMI;
    }
    @Override
    public double obtenerPrecioFinal() {
        double precioF = super.obtenerPrecioFinal();
        double precioB = super.getPrecioBase();
        double precio= precioF+precioB;
        
        if(this.resolucion>40){
            precio += (precio*0.3);
        }
        
        if (this.puertoHDMI == true){
            precio= precio+ 50;
        }
        
        return precio;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + "\nDatos Television:\n" + "resolucion: "
                + resolucion + ", puertoHDMI: " + puertoHDMI + "\nPrecio Final: "
                + this.obtenerPrecioFinal();
    }
}
