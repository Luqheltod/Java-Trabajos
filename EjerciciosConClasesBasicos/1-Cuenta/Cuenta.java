/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuenta;

/**
 *
 * @author Gsancho
 */
public class Cuenta {

    private String titular;
    private double cantidad;

    public Cuenta(String titular) {

        this.titular = titular;
    }

    public Cuenta(String titular, double cantidad) {

        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta de cliente: " + "Titular = " + titular + ", Cantidad = " + cantidad + "€";
    }

    public void Ingresar(double ingreso) {

        if (ingreso > 0) {
            cantidad += ingreso;
        }

    }

    public void Retirar(double retiro) {

        cantidad -= retiro;

        if (cantidad < 0) {
            cantidad = 0;
        }
    }
}
