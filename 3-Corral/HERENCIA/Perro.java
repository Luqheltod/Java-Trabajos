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
public class Perro extends AnimalAbstracto {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void viveUnaHora(int hora) {
        boolean comiendo = false;
        System.out.println("El perro " + super.getNombre() + " está :");

        if (hora >= 8 && hora <= 22 && hora % 9 == 0) {
            comiendo = true;
            System.out.println("Comiendo");
        } else if (hora >= 8 && hora <= 22 && hora % 2 == 0) {

            
                System.out.println("Paseando");
            } else {
                System.out.println("Descansando");
            }

        }

    }


