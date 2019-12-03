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
public class Corral {
    
    private Animal[] animales;

    public Corral() {
        animales = new Animal[5];
        animales[0] = new Gallina ("Federica");
        animales[1] = new Gallina ("Manuela");
        animales[2] = new Perro ("Black");
        animales[3] = new Perro ("Dirty");
        animales[4] = new Gato ("Tonet");
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
