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
public abstract class AnimalAbstracto implements Animal {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public abstract void viveUnaHora(int hora);

    public AnimalAbstracto(String nombre) {
        this.nombre = nombre;
    }

}
