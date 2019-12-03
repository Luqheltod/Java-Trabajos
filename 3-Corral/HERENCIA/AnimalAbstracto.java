
package HERENCIA;

/**
 *
 * @author Gsancho
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
