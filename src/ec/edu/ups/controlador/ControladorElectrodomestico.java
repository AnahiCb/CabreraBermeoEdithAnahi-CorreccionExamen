/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.ElectrodomesticoDAO;
import ec.edu.ups.idao.IElectrodomesticoDAO;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import ec.edu.ups.vista.VistaElectrodomestico;
import java.util.List;

/**
 *
 * @author Anahi
 */
public class ControladorElectrodomestico {
     private VistaElectrodomestico vista;
    private Electrodomestico modelo;
    private IElectrodomesticoDAO dao;

    public ControladorElectrodomestico(VistaElectrodomestico vista, IElectrodomesticoDAO dao) {
        this.vista = vista;
        this.dao = dao;
    }

    public void registrarTelevision(){
        modelo= vista.ingresarTelevision();
        dao.create((Television)modelo);
    }
    public void registrarLavadora(){
        modelo= vista.ingresarLavadora();
        dao.create((Lavadora)modelo);
    }
    public void verLavadoras(){
        List<Lavadora> lavadoras;
        lavadoras=dao.listarLavadora();
        vista.mostrarLavadoras(lavadoras);
    }
    public void verTelevisiones(){
        List<Television> televisiones;
        televisiones=dao.listarTelevision();
        vista.mostrarTelevisiones(televisiones);
    }
}
