/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehiculosAbstract;


//selecciona el numero de vehiculos que quieres. 
// misma categoria o categorias distintas. 
//los meto en un array y luego los muestro. 

import resources.MyIcon;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Gsancho
 */
public class PruebaVehiculos {
   
    
    public static void main(String[] args) {
         String categoriaElegida;
        
  
        MyIcon icon = new MyIcon(); //instanciamos el icono de la clase que hemos creado.
        
        
String[] options = {"1", "2", "3", "4"};  //un array con las opciones que mostrara el siguiente joptionpane en el que eligiremos cuantos vehiculos queremos

int seleccion = JOptionPane.showOptionDialog(null, "Elija el numero de vehiculos que desea disponer", "Vehiculos", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

Vehiculo[] losVehiculos = new Vehiculo[seleccion+1]; //creamos el array de vehiculos con lo señalado anteriormente, el +1 es porque las opciones comienzan con 0




String[] categoria = {  // un array de strings que contendra nuestras opciones del siguiente joptionpane, donde seleccionaremos la categoria
            "Todos alta",
            "Todos media",
            "Todos baja",
            "Selecciona individualmente"
            
        };
String resp = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion para la categoria del vehiculo", "Categoria", JOptionPane.DEFAULT_OPTION, icon, categoria, categoria[3]);

        //en resp hemos almacenado la respuesta como string del tipo de categoria.
        


String[] elecciones = {  // un array de strings que contendra nuestras opciones del siguiente joptionpane, donde seleccionaremos el formato
            "Eleccion Individual",
            "Eleccion Aleatoria"
            
};
int eleccion = JOptionPane.showOptionDialog(null, "Elija como quiere hacer su seleccion", "Tipos", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, elecciones, elecciones[0]);

        




String[] tipos = {  // un array de strings que contendra nuestras opciones del siguiente joptionpane, donde seleccionaremos el tipo
            "Moto",
            "Patinete",
            "Coche Familiar",
            "Coche deportivo",
            "Camion",
            "Tanque",
           
};

if (eleccion!=1){  //si has elegido algo que no sea todo aleatorio, entonces elige individualmente:
for ( int x = 0; x<losVehiculos.length; x++){  //el for hasta el numero determinado de vehiculos que elegiste, preguntara primero como quiere hacer su seleccion.
    
    int eleccion1 = JOptionPane.showOptionDialog(null, "Elija el tipo de vehiculo", "Tipos", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tipos, tipos[0]);

    //si no has de seleccionar individualmente las categorias 
   
    if(!resp.equals("Selecciona individualmente")){
String categoria1 = resp.substring(6); //aqui seleccionamos la palabra exacta extrayendo una subcadena de las opciones anteriores

categoriaElegida = categoria1;  //**las dos posibles opciones, una unica para todos, o una distinta para cada uno, con un simple if else

    //si las quieres seleccionar individualmente
    
    } else{
    String[] categoriaUnica = {  // un array de strings que contendra nuestras opciones del siguiente joptionpane, donde seleccionaremos la categoria
            "alta",
            "media",
            "baja"
            
        }; 
String categoria1 = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion para la categoria del vehiculo", "Categoria", JOptionPane.DEFAULT_OPTION, icon, categoriaUnica, categoriaUnica[0]);

   categoriaElegida = categoria1;  //**
    
}

    switch(eleccion1){
        
        case 0:
            
        losVehiculos[x] = new Moto(JOptionPane.showInputDialog(null, "Color", "color"), categoriaElegida);
        break;
        
        case 1:
        losVehiculos[x] = new Patinete(JOptionPane.showInputDialog(null, "Color", "color"), categoriaElegida); 
        break;
        
        case 2:
        losVehiculos[x] = new Cfamiliar(JOptionPane.showInputDialog(null, "Color", "color"), categoriaElegida); 
        break;
        
        case 3:
        losVehiculos[x] = new Cdeportivo(JOptionPane.showInputDialog(null, "Color", "color"), categoriaElegida); 
        break;
        
        case 4:
        losVehiculos[x] = new Camion(JOptionPane.showInputDialog(null, "Color", "color"), categoriaElegida); 
        break;
        
        case 5:
        losVehiculos[x] = new Tanque(JOptionPane.showInputDialog(null, "Color", "color"), categoriaElegida); 
        break;
    }
    
}
    
} else{
    
  
    
    for (int x =0;x<losVehiculos.length;x++){
        
              if(!resp.equals("Selecciona individualmente")){
String categoria1 = resp.substring(6); //aqui seleccionamos la palabra exacta extrayendo una subcadena de las opciones anteriores

categoriaElegida = categoria1;  //**las dos posibles opciones, una unica para todos, o una distinta para cada uno, con un simple if else

    //si las quieres seleccionar individualmente
    
    } else{
    String[] categoriaUnica = {  // un array de strings que contendra nuestras opciones del siguiente joptionpane, donde seleccionaremos la categoria
            "alta",
            "media",
            "baja"
            
        }; 
String categoria1 = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion para la categoria del vehiculo", "Categoria", JOptionPane.DEFAULT_OPTION, icon, categoriaUnica, categoriaUnica[0]);

   categoriaElegida = categoria1;  //**
    
}
         int j = (int)Math.round(Math.random()*100);
        
         if(j<16){
             j=0;
         } else if (j<32){
             j=1;
         }else if (j<48){
             j=2;
         }else if (j<62){
             j=3;
         }else if (j<78){
             j=4;
         }else if (j<100){
             j=5;
         }
         
         switch(j){
             
             case 0:
                 losVehiculos[x] = new Moto(JOptionPane.showInputDialog(null, "Color", "color"), categoriaElegida);
        break;
        
             case 1:
                 losVehiculos[x] = new Patinete(JOptionPane.showInputDialog(null, "Color", "color"), categoriaElegida);
        break;
             case 2:
                 losVehiculos[x] = new Cfamiliar(JOptionPane.showInputDialog(null, "Color", "color"), categoriaElegida);
        break;
        
             case 3:
                 losVehiculos[x] = new Cdeportivo(JOptionPane.showInputDialog(null, "Color", "color"), categoriaElegida);
        break;
        
             case 4:
                 losVehiculos[x] = new Camion(JOptionPane.showInputDialog(null, "Color", "color"), categoriaElegida);
        break;
        
             case 5:
                 losVehiculos[x] = new Tanque(JOptionPane.showInputDialog(null, "Color", "color"), categoriaElegida);
        break;
         }
         
    }
    
}

        for (Vehiculo losVehiculo : losVehiculos) {
            System.out.println(losVehiculo.datosVehiculo());
        }
        
        
       
  
        
    }
    
    
    
  
       
        
        
   }



