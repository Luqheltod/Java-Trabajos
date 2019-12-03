
package Password;

import java.util.*;

/**
 *
 * @author Gsancho
 */
public class usoPassword {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Selecciona cuantas contraseñas quieres ");

        int numContrasenias = entrada.nextInt();

        System.out.println("Selecciona la longitud de las contrasenias ");

        int longitudContrasenias = entrada.nextInt();

        Password Passwords[] = new Password[numContrasenias];

        for (int i = 0; i < numContrasenias; i++) {

            Passwords[i] = new Password(longitudContrasenias);

        }
        String fuerte = "";
        for (Password Password1 : Passwords) {
          
            System.out.print(Password1.getContrasenia());
            fuerte = Password1.esFuerte()? "Es fuerte" : "No es fuerte";
            System.out.println(" " + fuerte);
        }
    }

}