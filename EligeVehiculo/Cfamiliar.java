
package VehiculosAbstract;

/**
 *
 * @author Gsancho
 */
public class Cfamiliar extends Vehiculo {
    
    
    private final int ruedas = 4;
    private final double peso = 2900;
    private final double precio = 10750.35;
    
    
    
    public Cfamiliar (String color, String categoria){
        
        super(color,categoria);
    }
    
public double getPrecio(){
        
        double precioFinal = 0; 
        
        if(categoria.equalsIgnoreCase("baja")){
            
            precioFinal = 1150 + precio;
        }
        
        if(categoria.equalsIgnoreCase("media")){
            
            precioFinal = 3250 + precio;
        }
        
        if(categoria.equalsIgnoreCase("alta")){
            precioFinal = 5350 + precio;
        }
    
        return precioFinal;
    } 
    
    
    
    
    @Override
    public String datosVehiculo(){
        
        return "Vehiculo: "+getId() +" - " +"el coche familiar tiene "  +ruedas + " ruedas " + "es de color " + getColor() +  " un peso de " + peso + "Kg." + getCategoria() + " ,y cuesta " + getPrecio() +"€" ;
    }
}

