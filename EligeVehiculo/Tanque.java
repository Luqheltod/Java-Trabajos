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
public class Tanque extends Vehiculo {
    private final int ruedas = 2;
    private final double peso = 25345;
    private final double precio = 239750;
    
    
    
    public Tanque (String color, String categoria){
        
        super(color,categoria);
    }
    
public double getPrecio(){
        
        double precioFinal = 0; 
        
        if(categoria.equalsIgnoreCase("baja")){
            
            precioFinal = 10150 + precio;
        }
        
        if(categoria.equalsIgnoreCase("media")){
            
            precioFinal = 52250 + precio;
        }
        
        if(categoria.equalsIgnoreCase("alta")){
            precioFinal = 144350 + precio;
        }
    
        return precioFinal;
    } 
    
    
    
    
    @Override
    public String datosVehiculo(){
        
        return "Vehiculo: "+getId() +" - " +"El tanque tiene "  +ruedas + " ruedas " + "es de color " + getColor() +  " un peso de " + peso + "Kg." + getCategoria() + " ,y cuesta " + getPrecio() +"€" ;
    }
}

