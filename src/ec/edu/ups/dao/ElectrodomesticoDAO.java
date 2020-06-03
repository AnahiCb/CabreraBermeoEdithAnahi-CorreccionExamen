/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import ec.edu.ups.idao.IElectrodomesticoDAO;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Anahi
 */
public class ElectrodomesticoDAO implements IElectrodomesticoDAO {
    private Set<Electrodomestico> listaElectrodomestico;
    private List<Lavadora> listLavadora;
    private List<Television> listTele;

    public ElectrodomesticoDAO() {
        listaElectrodomestico = new HashSet<Electrodomestico>();
        listTele = new ArrayList<>();
        listLavadora = new ArrayList<>();
    }
    
    @Override
    public void create(Television television){
        listaElectrodomestico.add(television);
    }
    
    @Override
    public void create(Lavadora lavadora){
        listaElectrodomestico.add(lavadora);
    }
    @Override
    public List<Lavadora> listarLavadora(){
       Iterator<Electrodomestico> it = listaElectrodomestico.iterator();
        
        while (it.hasNext()) {
            Electrodomestico electro = it.next();
            if (electro instanceof Lavadora) {
                Lavadora lavadora = (Lavadora) electro;
                listLavadora.add(lavadora);
            }
        }
        
        for(int i=0;i<(listLavadora.size()-1);i++){
            
            for(int j = 0;j<listLavadora.size();j++){
                if(listLavadora.get(i).compareTo(listLavadora.get(j))>0){
                    Lavadora lav = listLavadora.get(i);
                    listLavadora.add(i, listLavadora.get(j));
                    listLavadora.add(j, lav);
                }
            }
        }
        
        return listLavadora;
    }
    @Override
    public List<Television> listarTelevision(){
        Iterator<Electrodomestico> i = listaElectrodomestico.iterator();
        
        while (i.hasNext()) {
            Electrodomestico e = i.next();
            if (e instanceof Television) {
                Television television = (Television) e;
                listTele.add(television);
            }
        }
        
        for(int c=0;c<(listTele.size()-1);c++){
            
            for(int j = 0;j<listTele.size();j++){
                if(listTele.get(c).compareTo(listTele.get(j))>0){
                    Television tele = listTele.get(c);
                    listTele.add(c, listTele.get(j));
                    listTele.add(j, tele);
                }
            }
        }
        
        return listTele;
    }
}
