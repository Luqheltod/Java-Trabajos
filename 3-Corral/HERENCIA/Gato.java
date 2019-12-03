/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HERENCIA;

/**
 *
 * @author ALUMNO13TA
 */
public class Gato extends AnimalAbstracto {

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void viveUnaHora(int hora) {
        
        System.out.println("El gato " + super.getNombre()+ " está :");
        if(hora >= 1 && hora<= 9 && hora%3==0){
            
            System.out.println("Comiendo");
        }
       else {
            
            System.out.println("Durmiendo");
           
       }
    }
    
}
