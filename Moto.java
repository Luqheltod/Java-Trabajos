
package VehiculosAbstract;

/**
 *
 * @author Gsancho
 */
public class Moto extends Vehiculo {
    
   
    private final int ruedas = 2;
    private final double peso = 800;
    private final double precio = 7590;
    
    
    
    
    public Moto(String color , String categoria ){
        
        super(color,categoria);
    }
    
    
    public double getPrecio(){
        
        double precioFinal = 0; 
        
        if(categoria.equalsIgnoreCase("baja")){
            
            precioFinal = 1000 + precio;
        }
        
        if(categoria.equalsIgnoreCase("media")){
            
            precioFinal = 2000 + precio;
        }
        
        if(categoria.equalsIgnoreCase("alta")){
            precioFinal = 3000 + precio;
        }
    
        return precioFinal;
    } 
    
    
    
    
    @Override
    public String datosVehiculo(){
        
        return "Vehiculo: "+getId() +" - " +"La moto tiene "  +ruedas + " ruedas " + "es de color " + getColor() +  " un peso de " + peso + "Kg." + getCategoria() + " ,y cuesta " + getPrecio() +"€" ;
    }
}
