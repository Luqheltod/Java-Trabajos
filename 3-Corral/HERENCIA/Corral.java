
package HERENCIA;

/**
 *
 * @author Gsancho 
 */
public class Corral {
    
    private Animal[] animales;

    public Corral() {
        animales = new Animal[5];
        animales[0] = new Gallina ("Federica");
        animales[1] = new Gallina ("Manuela");
        animales[2] = new Perro ("Black");
        animales[3] = new Perro ("Dirty");
        animales[4] = new Gato ("Tonelete");
    }
    
    public void simulaUnDia(){
        for (int i = 0; i <= 23; i++) {
            
            System.out.println("--" +i+ "h --");
            
            for (Animal animales : animales) {
                
                animales.viveUnaHora(i);
            }
        }
    }
    
}
