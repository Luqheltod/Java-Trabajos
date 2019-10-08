
package EligeVehiculo;

/**
 *
 * @author Gsancho
 */
public class Coche {
    
    private int peso;
    
    private String color;
    
    private boolean asientos = false;
    
    private boolean climatizador = false;
    
    private double precio ;
    
    public Coche(){
        
        peso = 3500;
        precio = 12850;
        
    }
    
    
    public void setColor(String color){
        
        this.color = color;
        
        
    }
    
    public String getColor(){
        
        return color;
    }
    
    
    public void setAsientos(String asientos){
        
        if(asientos.equalsIgnoreCase("s") ){
           this.asientos = true;
           
           this.peso+=150;
           this.precio+= 2000; 
        }}
    
     public String getAsientos(){
         
         if(asientos==true){
             
         return "tiene asientos de cuero";
     }   else{
             
         return "no tiene asientos de cuero";    
         }
        
    }
     
     public void setClimatizador(String climatizador){
         
         if(climatizador.equalsIgnoreCase("s")){
             this.climatizador = true;
             
             this.peso+=20;
             this.precio+=500;
         }}
         
      public String getClimatizador(){
          if(climatizador == true){
              return "tiene climatizador";
      }   else{
              return "no tiene climatizador";
          }
     }
  
     public double getPrecio(){
         
         return precio;
     }
    
    
    
    
   public void datosCoche (){
        System.out.println("El coche es " + color + " " + getAsientos() + " " + getClimatizador() + " tiene un peso de " + peso
                + " y tiene un precio final de " + getPrecio() + " €");
    }
}


