/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import java.util.Scanner;

/**
 *
 * @author Gsancho
 */
public class UsoPersona {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Buenos dias \nIntrouduce nombre: ");

        String nombre = entrada.next();

        System.out.println("Introduce edad: ");

        int edad = entrada.nextInt();

        System.out.println("Introduce el sexo");

        char sexo = entrada.next().charAt(0);

        System.out.println("Introduce el peso");

        double peso = entrada.nextDouble();

        System.out.println("Introduce la altura");

        double altura = entrada.nextDouble();

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);

        Persona persona2 = new Persona(nombre, edad, sexo);

        Persona persona3 = new Persona();
        persona3.setNombre("German");
        persona3.setEdad(32);
        persona3.setPeso(80);
        persona3.setAltura(1.81);

        //mostramos todos los datos a la vez, tanto mayoria de edad como imc,
        System.out.println(persona1);

        System.out.println(persona2);

        System.out.println(persona3);

    }
}
