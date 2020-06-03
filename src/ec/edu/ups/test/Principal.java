/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;
import ec.edu.ups.vista.VistaElectrodomestico;
import ec.edu.ups.dao.ElectrodomesticoDAO;
import ec.edu.ups.modelo.*;
import ec.edu.ups.controlador.ControladorElectrodomestico;
import java.util.*;


/**
 *
 * @author Anahi
 */
public class Principal {
    public static void main(String[] args) {
        // TODO code application logic here
        Electrodomestico modelo = new Electrodomestico();
        VistaElectrodomestico vista = new VistaElectrodomestico();
        ElectrodomesticoDAO dao = new ElectrodomesticoDAO();

        ControladorElectrodomestico control = new ControladorElectrodomestico(vista, dao);
        
        System.out.println("*********ElectroUPS**********");
        // Ingreso de tres objetos tipo lavadora
        control.registrarLavadora();
        control.registrarLavadora();
        control.registrarLavadora();
        control.verLavadoras();
        //Ingreso de tres objetos tipo Television
        control.registrarTelevision();
        control.registrarTelevision();
        control.registrarTelevision();
        control.verTelevisiones();
        
        
    }
}
