
package Password;



/**
 *
 * @author Gsancho
 */
public class Password {

    int longitud = 8;
    String contrasenia;

    public Password() {

    }

    public Password(int longitud) {

        this.longitud = longitud;
        contrasenia = generarPassword(longitud);

    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public final String generarPassword(int longitud) {
        String Password = "";
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXY1234567890";
        String cadena = "";

        for (int i = 0; i < longitud; i++) {

            cadena = Character.toString(caracteres.charAt((int) (Math.random() * 61)));

            Password = cadena + Password;

        }
        return Password;
    }

    public boolean esFuerte() {
        
        int minusculas = 0;
        int mayusculas = 0;
        int numeros = 0;
        int caracter;
        
        
        for (int i = 0; i < contrasenia.length(); i++) {

            caracter = (int) contrasenia.charAt(i);

            if (caracter >= (int)'A' && caracter <= (int)'Z') {
                mayusculas++;
            }
            if (caracter >= (int)'a' && caracter <= (int)'z') {
                minusculas++;
            }

            if (caracter >= (int)'0' && caracter <= (int)'9') {
                numeros++;
            }
        }

        return minusculas > 1 && mayusculas > 2 && numeros > 5;

    }}