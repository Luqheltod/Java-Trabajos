
package EligeVehiculo;

/**
 *
 * @author Gsancho
 */
public class Moto {
    
    
    private int peso;
    
    private String color;
    
    private boolean asientos = false;
    
    private boolean ruedasCompeticion = false;
    
    private double precio ;
    
    
    public Moto(){
        
        peso = 1200;
        precio = 9500;
        
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
           
           this.peso+=50;
           this.precio+= 400; 
        }}
    
     public String getAsientos(){
         
         if(asientos==true){
             
         return "tiene asientos de cuero";
     }   else{
             
         return "no tiene asientos de cuero";    
         }
}

   public void setRuedas(String ruedas){

if(ruedas.equalsIgnoreCase("s")){
    this.ruedasCompeticion = true;
    this.peso-=25;
    this.precio+= 500;
}
}
   
 public String getRuedas(){
     if(ruedasCompeticion ==true){
         return "lleva ruedas de competicion";
     } else{
         return "lleva ruedas de serie";
     }
     
 }

  public double getPrecio(){
         
         return precio;
     }
    
    
    
    
   public void datosMoto (){
        System.out.println("La moto es " + color + " " + getAsientos() + " " + getRuedas() + " tiene un peso de " + peso
                + " y tiene un precio final de " + getPrecio() + " €");
    }
}
