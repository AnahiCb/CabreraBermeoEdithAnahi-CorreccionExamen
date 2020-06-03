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
public class Electrodomestico implements Comparable <Electrodomestico>{
    private int codigo;
    private String descripcion;
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int codigo) {
        this.codigo = codigo;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public double obtenerPrecioFinal(){
        //Precio según el consumo Energético
        if (consumoEnergetico=='A'){
            precioBase=precioBase+100;
        }else if(consumoEnergetico=='B'){
            precioBase=precioBase+80;
        }else if (consumoEnergetico=='C'){
            precioBase=precioBase+60;
        }else if(consumoEnergetico=='D'){
            precioBase=precioBase+50;
        }else if(consumoEnergetico=='E'){
            precioBase=precioBase+30;
        }else if(consumoEnergetico=='F'){
            precioBase=precioBase+10;
        }
        double precioBase1=0;
        //Precio según el peso
        if(peso>=0&&peso<=19){
            precioBase1=precioBase+10;
        } else if(peso>=20&&peso<=49){
            precioBase1=precioBase+50;
        } else if(peso>=50&&peso<=79){
            precioBase1=precioBase+80;
        } else if(peso>=80){
            precioBase1=precioBase+100;
        }
        double precioFinal= precioBase+precioBase1;
        return precioFinal;
    }
    @Override
    public int compareTo(Electrodomestico p) {       
       
        return (int) (this.precioBase-p.precioBase);
    }
    @Override
    public String toString() {
        return "Electrodomestico{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
    
    
}
