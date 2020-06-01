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
public class Television extends Electrodomestico{
     private int resolucion;
     private boolean puertoHDMI;
     private double precioFinal;
     
     public Television(){
     }
     public Television(int codigo){
         setCodigo(codigo);
     }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean PuertoHDMI() {
        return puertoHDMI;
    }

    public void setPuertoHDMI(boolean puertoHDMI) {
        this.puertoHDMI = puertoHDMI;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }
     
     
     
    @Override
    public double ObtenerPrecioFinal() {
        precioFinal = super.ObtenerPrecioFinal();
        if(resolucion > 40){
            precioFinal = precioFinal + (precioFinal*0.3);
        }
        if(puertoHDMI){
            precioFinal = precioFinal +50;
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Television{" + "resolucion=" + resolucion + ", puertoHDMI=" + puertoHDMI + ", precioFinal=" + precioFinal + '}';
    }
     
}
