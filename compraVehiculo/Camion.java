/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EligeVehiculo;

/**
 *
 * @author Gsancho
 */
public class Camion {
    
    private int peso;
    
    private String color;
    
    private boolean asientos = false;
    
    private boolean climatizador = false;
    
    private double precio ;
    
    public Camion(){
        
        peso = 13500;
        precio = 33050;
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
             
             this.peso+=50;
             this.precio+=1500;
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
    
    
    
    
   public void datosCamion (){
        System.out.println("El camion es " + color + " " + getAsientos() + " " + getClimatizador() + " tiene un peso de " + peso
                + " y tiene un precio final de " + getPrecio() + " €");
    }
}
