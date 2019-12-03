
package Persona;

/**
 *
 * @author Gsancho
 */
public class Persona {

    private String nombre = "";
    private int edad = 0;
    private String dni = "";
    private char sexo = 'H';
    private double peso = 0;
    private double altura = 0;

    public Persona() {
        dni = generaDni();
    }

    public Persona(String nombre, int edad, char sexo) {

        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        dni = generaDni();

    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {

        this.nombre = nombre;
        this.edad = edad;
        dni = generaDni();
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularIMC() {
        double imc;
        imc = peso / (altura * 2);

        if (imc < 20) {
            imc = -1;
        }
        if (imc >= 20 || imc <= 25) {

            imc = 0;

        }
        if (imc > 25) {

            imc = 1;
        }

        return imc;
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    private char comprobarSexo(char sexo) {

        if (sexo != 'H' && sexo != 'M') {

            return 'H';
        } else {
            return sexo;
        }
    }

    private String generaDni() {

        int numeroDni = (int) (Math.random() * 100000000);

        String Caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        int letraNumero = numeroDni % 23;
        char letra = Caracteres.charAt(letraNumero);

        return Integer.toString(numeroDni) + letra;
    }

    @Override
    public String toString() {

        String pesoImc = "";
        String mayorDeEdad = "";
        if (calcularIMC() == -1) {
            pesoImc = "Esta muy delgado segun su IMC ";
        }
        if (calcularIMC() == 0) {
            pesoImc = "Esta en su peso ideal segun su IMC ";
        }
        if (calcularIMC() == 1) {
            pesoImc = "Tiene sobrepeso segun su IMC ";
        }

        if (esMayorDeEdad()) {
            mayorDeEdad = "Es mayor de edad";
        } else {
            mayorDeEdad = "No es mayor de edad";
        }
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}' + pesoImc + mayorDeEdad;
    }

}
