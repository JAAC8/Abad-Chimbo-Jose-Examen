/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.vista.VistaElectrodomestico;
import ec.edu.ups.idao.IElectrodomesticoDAO;
import ec.edu.ups.dao.ElectrodomesticoDAO;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.List;

/**
 *
 * @author José Andrés Abad
 */
public class ControladorElectrodomestico{
    
    private VistaElectrodomestico vista = new VistaElectrodomestico();
    private Electrodomestico modelo = new Electrodomestico();
    private IElectrodomesticoDAO dao = new IElectrodomesticoDAO() {
        @Override
        public void crearTelevision() {
            
        }

        @Override
        public void crearLavadora() {
        }

        @Override
        public List<Lavadora> listarLavadora() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public List<Television> listarTelevision() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
           
    public ControladorElectrodomestico(VistaElectrodomestico vistaElectrodomestico,Electrodomestico modelo, IElectrodomesticoDAO dao){
        this.vista = vistaElectrodomestico;
    }
    
    public void registrarTelevision(){
        Television television = new Television();
        television = vista.ingresarTelevision();
        
        ////
    }
    
    public void registrarLavadora(){
        Lavadora lavadora = new Lavadora();
        lavadora = vista.ingresarLavadora();
        
        ////
    }
    
    public void verLavadoras(){
        dao.listarLavadora();    
    }
    public void verTelevisores(){
        dao.listarTelevision();
    }
    
}
