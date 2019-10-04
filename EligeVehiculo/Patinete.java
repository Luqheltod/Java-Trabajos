/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehiculosAbstract;

/**
 *
 * @author Gsancho
 */
public class Patinete extends Vehiculo {
    
    private final int ruedas = 2;
    private final double peso = 45;
    private final double precio = 750.35;
    
    
    
    public Patinete (String color, String categoria){
        
        super(color,categoria);
    }
    
public double getPrecio(){
        
        double precioFinal = 0; 
        
        if(categoria.equalsIgnoreCase("baja")){
            
            precioFinal = 150 + precio;
        }
        
        if(categoria.equalsIgnoreCase("media")){
            
            precioFinal = 250 + precio;
        }
        
        if(categoria.equalsIgnoreCase("alta")){
            precioFinal = 350 + precio;
        }
    
        return precioFinal;
    } 
    
    
    
    
    @Override
    public String datosVehiculo(){
        
        return "Vehiculo: "+getId() +" - " +"El patinete tiene "  +ruedas + " ruedas " + "es de color " + getColor() +  " un peso de " + peso + "Kg." + getCategoria() + " ,y cuesta " + getPrecio() +"€" ;
    }
}

