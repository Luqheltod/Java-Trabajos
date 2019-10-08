
package EligeVehiculo;

/**
 *
 * @author Gsancho
 */
public class Camion {  //se declaran los parametros de la clase. De serie, asientos y climatizador es false.
    
    private int peso;
    
    private String color;
    
    private boolean asientos = false;
    
    private boolean climatizador = false;
    
    private double precio ;
    
    public Camion(){
        
        peso = 13500;
        precio = 33050;
    }
    
      public void setColor(String color){ //setter
        
        this.color = color;
        
        
    }
    
    public String getColor(){ //getter
        
        return color;
    }
    
    public void setAsientos(String asientos){ //metodo que incrementa el precio si los asientos son de cuero.
        
        if(asientos.equalsIgnoreCase("s") ){
           this.asientos = true;
           
           this.peso+=150;
           this.precio+= 2000; 
        }}
    
     public String getAsientos(){ //metodo descriptivo
         
         if(asientos==true){
             
         return "tiene asientos de cuero";
     }   else{
             
         return "no tiene asientos de cuero";    
         }
        
    }
     
     public void setClimatizador(String climatizador){ //metodo que incrementa el precio si lleva climatizador.
         
         if(climatizador.equalsIgnoreCase("s")){
             this.climatizador = true;
             
             this.peso+=50;
             this.precio+=1500;
         }}
         
      public String getClimatizador(){ //metodo descriptivo
          if(climatizador == true){
              return "tiene climatizador";
      }   else{
              return "no tiene climatizador";
          }
     }
  
     public double getPrecio(){ //getter
         
         return precio;
     }
    
    
    
    
   public void datosCamion (){ //metodo descriptivo general
        System.out.println("El camion es " + color + " " + getAsientos() + " " + getClimatizador() + " tiene un peso de " + peso
                + " y tiene un precio final de " + getPrecio() + " €");
    }
}
