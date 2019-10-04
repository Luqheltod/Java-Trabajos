
package VehiculosAbstract;

/**
 *
 * @author Gsancho
 */
 public abstract class Vehiculo {
    
   protected String color;
   protected String categoria;
   protected static int idSiguiente=1;
   protected int id;
   
           
    public Vehiculo(String color, String categoria){
       
        this.color=color;
        this.categoria=categoria;
        id = idSiguiente;
        idSiguiente++;
        
    };

    public String getColor() {
        return color;
    }

    public int getId() {
        return id;
    }

   
    
    public abstract String datosVehiculo();
    
    public void setCategoria(int x){
        
        if(x==1){
            
            this.categoria="baja";
            
        }else if (x==2){
            this.categoria="media";
            
        }else if (x==3) {
            
            this.categoria="alta";
        }
        
    }
    
    public String getCategoria(){
        
        
        return "La categoria del vehiculo es: " +categoria ;
        
    }
    
        
    
    
    
    
    
    
}
