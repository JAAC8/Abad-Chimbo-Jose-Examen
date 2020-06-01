/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import java.util.Scanner;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author José Andrés Abad
 */
public class VistaElectrodomestico {

    private Scanner entrada;

    public VistaElectrodomestico() {
        entrada = new Scanner(System.in);
    }

    public Television ingresarTelevision() {
        Television television = new Television();
        
        System.out.println("Código:");
        int codigo = entrada.nextInt();
        television.setCodigo(codigo);

        System.out.println("Resolución: ");
        int resolucion = entrada.nextInt();
        television.setResolucion(resolucion);
        
        boolean repetidor = true;
        while (repetidor) {
            System.out.println("Tiene puerto HDMI: " + "\n'1' -> TRUE" + "\n'2' -> FALSE");
            int elector = entrada.nextInt();
            if (elector == 1) {
                television.setPuertoHDMI(true);
                repetidor = true;
            } else {
                if (elector == 2) {
                    television.setPuertoHDMI(false);
                    repetidor = false;
                } else {
                    System.out.println("NO HA SELECCIONADO NINGUNO...");
                }
            }
        }
                       
        System.out.println("Descripción:");
        String descipcion = entrada.next();
        television.setDescripcion(descipcion);
        
        System.out.println("Precio Base:");
        double precioBase = entrada.nextDouble();
        television.setPrecioBase(precioBase);
        
        System.out.println("Color:");
        String color = entrada.next();
        television.setColor(color);
        
        System.out.println("Consumo Energético:");
        char consumoEnergetico = entrada.next().charAt(0);//
        television.setConsumoEnergetico(consumoEnergetico);
        
        System.out.println("Peso:");
        int peso = entrada.nextInt();
        television.setPeso(peso);
        
        return television;        
    }
    
    public Lavadora ingresarLavadora(){
        Lavadora lavadora = new Lavadora();
        
        System.out.println("Código:");
        int codigo = entrada.nextInt();
        lavadora.setCodigo(codigo);
        
        System.out.println("Carga:");
        int carga = entrada.nextInt();
        lavadora.setCarga(carga);
        
        System.out.println("Descripción:");
        String descipcion = entrada.next();
        lavadora.setDescripcion(descipcion);
        
        System.out.println("Precio Base:");
        double precioBase = entrada.nextDouble();
        lavadora.setPrecioBase(precioBase);
        
        System.out.println("Color:");
        String color = entrada.next();
        lavadora.setColor(color);
        
        System.out.println("Consumo Energético:");
        char consumoEnergetico = entrada.next().charAt(0);//
        lavadora.setConsumoEnergetico(consumoEnergetico);
        
        System.out.println("Peso:");
        int peso = entrada.nextInt();
        lavadora.setPeso(peso);
        
        return lavadora;
    }
    
    public void mostrarLavadoras(List<Lavadora> lista){//
        List<Lavadora> lavadoras = new ArrayList<>();
        lavadoras = lista;
        Iterator it = lavadoras.iterator();
        while(it.hasNext()){
            Integer posicion = (Integer) it.next();
            System.out.println(lavadoras.get(posicion));
        }
        
    }

    public void mostrarTelevisiones(List<Television> lista){
        List<Television> televisiones = new ArrayList<>();
        televisiones = lista;
        Iterator it = televisiones.iterator();
        while(it.hasNext()){
            Integer posicion = (Integer) it.next();
            System.out.println(televisiones.get(posicion));
        }
    }

}
