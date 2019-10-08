
package EligeVehiculo;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author Gsancho
 */
public class EligeVehiculo {
    
    
    public static void main(String[] args) {
       
        
     
       // en las siguientes lineas compararemos mendiante un while si lo introducido es de tipo int, se repetira hasta que se introduzca un int
        // despues se seguira reptiendo hasta que sea un valor numerico valido. 
       
       Scanner entrada1 = new Scanner(System.in);  

        int seleccion;
        do {
            System.out.print("Selecciona el tipo de vehiculo que quieres : \n 1- Coche \n 2- Camion \n 3- Moto");
            
            
            while (!entrada1.hasNextInt()) {
                String input = entrada1.next();
                System.out.printf("\"%s\" No es un numero.\n", input);
            }
            seleccion = entrada1.nextInt();
            if (seleccion < 1 || seleccion > 3){
             
                System.out.println("No esta dentro de los valores");
            }
        } while (seleccion < 1 || seleccion > 3);

       
    
       
      
       
     // mediante este switch creamos el objeto que queramos dependiendo de la decision del usuario y le preguntamos los extras que necesita
    switch (seleccion) {
        
        case 1 : 
            Coche coche = new Coche();
            coche.setColor(JOptionPane.showInputDialog("Elige el color de tu coche"));
            String asientos = JOptionPane.showInputDialog("¿Lleva asientos de cuero? s/n");
            while(!"s".equalsIgnoreCase(asientos) && !"n".equalsIgnoreCase(asientos)){ //comparamos strings, si es invalido, se vuelve a preguntar.
                asientos = JOptionPane.showInputDialog("Conteste unicamente con una S o una N");
            }
            coche.setAsientos(asientos);
            String climatizador = JOptionPane.showInputDialog("¿Lleva climatizador? s/n");
            while(!"s".equalsIgnoreCase(climatizador) && !"n".equalsIgnoreCase(climatizador)){
                climatizador = JOptionPane.showInputDialog("Conteste unicamente con una S o una N");
            }
            coche.setClimatizador(climatizador);
           coche.datosCoche(); //metodo descriptivo general
           break; 
           
        case 2 : 
            Camion camion = new Camion();
            camion.setColor(JOptionPane.showInputDialog("Elige el color de tu camion"));
            String asientos1 = JOptionPane.showInputDialog("¿Lleva asientos de cuero? s/n");
            while(!"s".equalsIgnoreCase(asientos1) && !"n".equalsIgnoreCase(asientos1)){
                asientos1 = JOptionPane.showInputDialog("Conteste unicamente con una S o una N");
            }
            camion.setAsientos(asientos1);
            String climatizador1 = JOptionPane.showInputDialog("¿Lleva climatizador? s/n");
            while(!"s".equalsIgnoreCase(climatizador1) && !"n".equalsIgnoreCase(climatizador1)){
                climatizador1 = JOptionPane.showInputDialog("Conteste unicamente con una S o una N");
            }
            camion.setClimatizador(climatizador1);
           camion.datosCamion();
           break; 
           
        case 3 :  
            Moto moto = new Moto();
             moto.setColor(JOptionPane.showInputDialog("Elige el color de tu moto"));
            String asientos2 = JOptionPane.showInputDialog("¿Lleva asientos de cuero? s/n");
            while(!"s".equals(asientos2) && !"n".equals(asientos2)){
                asientos2 = JOptionPane.showInputDialog("Conteste unicamente con una S o una N");
            }
            moto.setAsientos(asientos2);
            String ruedas = JOptionPane.showInputDialog("¿Quieres ruedas de competicion?s/n");
            while(!"s".equalsIgnoreCase(ruedas) && !"n".equalsIgnoreCase(ruedas)) {
                ruedas = JOptionPane.showInputDialog("Conteste unicamente con una S o una N");
            }       
            moto.setRuedas(ruedas);
            moto.datosMoto();;  
           break;
    }
    
        System.out.println("Gracias por su compra :D");  //final del programa
    }
    
}
