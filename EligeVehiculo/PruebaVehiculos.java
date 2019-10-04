package VehiculosAbstract;




import resources.MyIcon; //importamos la clase de MyIcon, para el icono de un JOptionPane
import javax.swing.*; //el paquete de joptionpane

/**
 *
 * @author Gsancho
 */
public class PruebaVehiculos {
   
    
    public static void main(String[] args) {
         
         
        
  
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
String categoriaElegida;  //aqui se guardara la categoria que elija el usuario
if (eleccion!=1){  //si has elegido algo que no sea todo aleatorio, entonces elige individualmente:
for ( int x = 0; x<losVehiculos.length; x++){  //el for hasta el numero determinado de vehiculos que elegiste, y de manera individual
    
    int eleccion1 = JOptionPane.showOptionDialog(null, "Elija el tipo de vehiculo", "Tipos", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tipos, tipos[0]);

    //si no has de seleccionar individualmente las categorias entonces...
   
    if(!resp.equals("Selecciona individualmente")){
String categoria1 = resp.substring(6); //aqui seleccionamos la palabra exacta extrayendo una subcadena de las opciones anteriores, se les resta la palabra "todos"

categoriaElegida = categoria1;  //**las dos posibles opciones, una unica para todos, o una distinta para cada uno, con un simple if else

    //y si las quieres seleccionar individualmente entonces...  elije
    
    } else{
    String[] categoriaUnica = {  // un array de strings que contendra nuestras opciones del siguiente joptionpane, donde seleccionaremos la categoria
            "alta",
            "media",
            "baja"
          
        }; 
String categoria1 = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion para la categoria del vehiculo", "Categoria", JOptionPane.DEFAULT_OPTION, icon, categoriaUnica, categoriaUnica[0]);

   categoriaElegida = categoria1;  //**
    
}

    //mediante este switch elijiremos uno a uno los vehiculos si la eleccion fue seleccionar individualmente, 
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
    
  
    
    for (int x =0;x<losVehiculos.length;x++){ //el for hasta el numero determinado de vehiculos que elegiste, y de manera aleatoria, y se repite el codigo del otro for
        
              if(!resp.equals("Selecciona individualmente")){
String categoria1 = resp.substring(6);

categoriaElegida = categoria1;  
    
    
    } else{
    String[] categoriaUnica = {  // un array de strings que contendra nuestras opciones del siguiente joptionpane, donde seleccionaremos la categoria
            "alta",
            "media",
            "baja"
            
        }; 
String categoria1 = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion para la categoria del vehiculo", "Categoria", JOptionPane.DEFAULT_OPTION, icon, categoriaUnica, categoriaUnica[0]);

   categoriaElegida = categoria1;  //**
    
}
         int j = (int)Math.round(Math.random()*100);  // aqui encontramos el modo de elegir aleatoriamente con un mathrandom redondeado, para evitar el 0
        
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
         
         switch(j){  // y elige uno automaticamente de manera aleatoria
             
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

        for (Vehiculo losVehiculo : losVehiculos) {  //muestra los datos de todos los vehiculos, con su correspondiente id asignada por el programa
            System.out.println(losVehiculo.datosVehiculo());
        }
        
        
       
  
        
    }
    
    
    
  
       
        
        
   }
