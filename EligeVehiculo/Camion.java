
package VehiculosAbstract;

/**
 *
 * @author Gsancho
 */
public class Camion extends Vehiculo {
    
    private final int ruedas = 8;
    private final double peso = 15045;
    private final double precio = 88750;
    
    
    
    public Camion (String color, String categoria){
        
        super(color,categoria);
    }
    
public double getPrecio(){ //dependiendo de la categoria, el precio aumenta mas o menos.
        
        double precioFinal = 0; 
        
        if(categoria.equalsIgnoreCase("baja")){
            
            precioFinal = 2150 + precio;
        }
        
        if(categoria.equalsIgnoreCase("media")){
            
            precioFinal = 6250 + precio;
        }
        
        if(categoria.equalsIgnoreCase("alta")){
            precioFinal = 10350 + precio;
        }
    
        return precioFinal;
    } 
    
    
    
    
    @Override
    public String datosVehiculo(){
        
        return "Vehiculo: "+getId() +" - " +"El camion tiene "  +ruedas + " ruedas " + "es de color " + getColor() +  " un peso de " + peso + "Kg." + getCategoria() + " ,y cuesta " + getPrecio() +"€" ;
    }
}
    

