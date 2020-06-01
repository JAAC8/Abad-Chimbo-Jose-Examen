/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.idao;

import java.util.List;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
/**
 *
 * @author José Andrés Abad
 */
public interface IElectrodomesticoDAO {
    public void crearTelevision();
    public void crearLavadora();
    public List<Lavadora> listarLavadora();
    public List<Television> listarTelevision();
}
