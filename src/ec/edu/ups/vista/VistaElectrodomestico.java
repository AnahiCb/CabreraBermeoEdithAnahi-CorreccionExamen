/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Anahi
 */
public class VistaElectrodomestico {
        private Scanner entrada;

    public VistaElectrodomestico() {
        entrada= new Scanner(System.in);
    }
    public Television ingresarTelevision(){
        Television tele= new Television();
        entrada= new Scanner(System.in);
        System.out.println("Registro de una television");
        System.out.println("Ingrese el codigo");
        int codigo= entrada.nextInt();
        tele.setCodigo(codigo);
        System.out.println("Ingrese la descripcion");
        String descripcion= entrada.next();
        tele.setDescripcion(descripcion);
        System.out.println("Ingrese el precio base");
        double precioBase= entrada.nextDouble();
        tele.setPrecioBase(precioBase);
        System.out.println("Ingrese el color");
        String color= entrada.next();
        tele.setColor(color);
        System.out.println("Ingrese el consumo energetico A-B-C-D-E-F");
        String consumoEnergetico= entrada.next();
        char consumo=consumoEnergetico.charAt(0);
        tele.setConsumoEnergetico(consumo);
        System.out.println("Ingrese el peso");
        int peso=entrada.nextInt();
        tele.setPeso(peso);
        System.out.println("Ingrese la resolucion");
        int resolucion=entrada.nextInt();
        tele.setResolucion(resolucion);
        System.out.println("¿Tiene puerto HDMI?");
        boolean puertoHDMI=entrada.hasNext();
        tele.setPuertoHDMI(puertoHDMI);
        return tele;
    }
    public Lavadora ingresarLavadora(){
        Lavadora lava=new Lavadora();
        System.out.println("Registro de una lavadora");
        entrada= new Scanner(System.in);
        System.out.println("Ingrese el codigo");
        int codigo= entrada.nextInt();
        lava.setCodigo(codigo);
        System.out.println("Ingrese la descripcion");
        String descripcion= entrada.next();
        lava.setDescripcion(descripcion);
        System.out.println("Ingrese el precio base");
        double precioBase= entrada.nextDouble();
        lava.setPrecioBase(precioBase);
        System.out.println("Ingrese el color");
        String color= entrada.next();
        lava.setColor(color);
        System.out.println("Ingrese el consumo energetico A-B-C-D-E-F");
        String consumoEnergetico= entrada.next();
        char consumo=consumoEnergetico.charAt(0);
        lava.setConsumoEnergetico(consumo);
        System.out.println("Ingrese el peso");
        int peso=entrada.nextInt();
        lava.setPeso(peso);
        System.out.println("Ingrese la carga");
        int carga=entrada.nextInt();
        lava.setCarga(carga);
        
        return lava;
    }
    
    public void mostrarLavadoras(List <Lavadora> lavadoras){
        System.out.println("Listado de las Lavadoras");
        for(Lavadora lavadora: lavadoras){
            System.out.println("Lavadora: "+lavadora);
        }
    }
    public void mostrarTelevisiones(List <Television> televisiones){
        System.out.println("Listado de las Televisiones");
        for(Television television: televisiones){
            System.out.println("Television: "+television);
        }
    }
}
