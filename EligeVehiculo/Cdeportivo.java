
package VehiculosAbstract;

/**
 *
 * @author Gsancho
 */
public class Cdeportivo extends Vehiculo {
    
    private final int ruedas = 4;
    private final double peso = 1345;
    private final double precio = 18750;
    
    
    
    public Cdeportivo (String color, String categoria){
        
        super(color,categoria);
    }
    
public double getPrecio(){
        
        double precioFinal = 0; 
        
        if(categoria.equalsIgnoreCase("baja")){
            
            precioFinal = 2150 + precio;
        }
        
        if(categoria.equalsIgnoreCase("media")){
            
            precioFinal = 4250 + precio;
        }
        
        if(categoria.equalsIgnoreCase("alta")){
            precioFinal = 8350 + precio;
        }
    
        return precioFinal;
    } 
    
    
    
    
    @Override
    public String datosVehiculo(){
        
        return "Vehiculo: "+getId() +" - " +"El coche deportivo tiene "  +ruedas + " ruedas " + "es de color " + getColor() +  " un peso de " + peso + "Kg." + getCategoria() + " ,y cuesta " + getPrecio() +"€" ;
    }
}

