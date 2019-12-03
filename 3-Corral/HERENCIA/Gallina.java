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
public class Gallina extends AnimalAbstracto {

    public Gallina(String nombre) {
        super(nombre);
    }

    @Override
    public void viveUnaHora(int hora) {
        boolean comiendo = false;
        System.out.println("La gallina " + super.getNombre()+ " está :");
        if(hora >= 6 && hora<= 20 && hora%3==0){
            comiendo = true;
            System.out.println("Comiendo");
        }
       else if(hora > 6 && hora< 20 && hora%6==1){
            System.out.println("Poniendo un huevo");
        }else if(hora >= 6 && hora<= 20 &&!comiendo){
            
            System.out.println("Esta de pie y no hace nada");
           
       }else{
            System.out.println("Durmiendo");
        }
        
    }
    
    
    
}
