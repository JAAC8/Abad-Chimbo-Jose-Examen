/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author José Andrés Abad
 */
public class Lavadora extends Electrodomestico{
    private int carga;
    private double precioFinal;
    
    public Lavadora(){}
    public Lavadora(int codigo){
        setCodigo(codigo);//
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    @Override
    public double ObtenerPrecioFinal() {
        precioFinal = super.ObtenerPrecioFinal(); 
        if(carga>30){
            precioFinal=precioFinal+50;
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + ", precioFinal=" + precioFinal + '}';
    }
    
    
}
