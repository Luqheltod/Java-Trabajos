
package HERENCIA;

/**
 *
 * @author Gsancho
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
