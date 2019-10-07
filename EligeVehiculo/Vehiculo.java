
package VehiculosAbstract;

/**
 *
 * @author Gsancho
 */
 public abstract class Vehiculo { //se declaran las variables que tendran los demas objetos, el Idsiguiente al ser static
                                  //sirve como comodin para sumar uno cada vez que se crea un vehiculo, se suma uno y se añade +
                                  // la copia ya sumada al crear el objeto.
    
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

    public String getColor() { //el metodo getcolor comun para todas las demas clases.
        return color;
    }

    public int getId() { //el metodo getId comun para todas las demas clases 
        return id;
    }

   
    
    public abstract String datosVehiculo();  // el metodo que han de sobreescribir todas nuestras demas clases que hereden de esta.
    
    public void setCategoria(int x){ //este metodo nunca se usa, pero era una idea previa para jugar con las categorias con base int.
        
        if(x==1){
            
            this.categoria="baja";
            
        }else if (x==2){
            this.categoria="media";
            
        }else if (x==3) {
            
            this.categoria="alta";
        }
        
    }
    
    public String getCategoria(){  // un simple metodo para usar en la descripcion, se podrian haber escrito asi todas las partes de la descripcion.
        
        
        return "La categoria del vehiculo es: " +categoria ;
        
    }
    
        
    
    
    
    
    
    
}
