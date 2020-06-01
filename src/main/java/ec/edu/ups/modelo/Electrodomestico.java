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
public class Electrodomestico {

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

    
    
    public double ObtenerPrecioFinal() {

        //según consumo energético
        switch (consumoEnergetico) {
            case 'A':
                this.precioBase = precioBase + 100;
                break;
            case 'B':
                this.precioBase = precioBase + 80;
                break;
            case 'C':
                this.precioBase = precioBase + 60;
                break;
            case 'D':
                this.precioBase = precioBase + 50;
                break;
            case 'E':
                this.precioBase = precioBase + 30;
                break;
            case 'F':
                this.precioBase = precioBase + 10;
                break;
        }

        //según tamaño
        if (this.peso > 0 && this.peso <= 19) {
            this.precioBase = precioBase + 10;
        }
        if (this.peso > 20 && this.peso <= 49) {
            this.precioBase = precioBase + 50;
        }
        if (this.peso > 50 && this.peso <= 79) {
            this.precioBase = precioBase + 80;
        }
        if (this.peso > 80) {
            this.precioBase = precioBase + 100;
        }

        return this.precioBase;//
    }

    
    
    @Override
    public String toString() {
        return "Electrodomestico{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

}
