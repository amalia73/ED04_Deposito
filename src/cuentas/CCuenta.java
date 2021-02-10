package cuentas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author AMALIA
 */
public class CCuenta {
    // Propiedades de la Clase Cuenta

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor sin argumentos
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetro que inicia todas las propiedades de la clase
     *
     * @param nom Nombre del cliente de la cuenta
     * @param cue Número de la cuenta del cliente
     * @param sal Saldo actual en la cuenta
     * @param tipo Tipo de interés a aplicar en la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * Método que devuelve el saldo disponible en cada momento
     *
     * @return  <code>saldo</code> Saldo disponible en cuenta
     */
    public double estado() {
        return saldo;
    }

    /**
     * Método para ingresar cantidades en la cuenta. Modifica el saldo.
     *
     * @param cantidad Dinero a ingresar en cuenta
     * @throws Exception COntrolamos que no se introduzcan cantidades negativas
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(saldo + cantidad);
    }

    /**
     * Método para retirar cantidades en la cuenta. Mofifica el saldo.
     *
     * @param cantidad Dinero a sacar la cuenta
     * @throws Exception Controlamos que no se retiren cantidades superiores al
     * saldo o que no se retires cantidades negativas
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(saldo - cantidad);
    }

    /**
     * Asignamos el número de la cuenta
     *
     * @param cuenta Número de la cuenta del cliente
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Asignamos el valor al saldo
     *
     * @param saldo Introduce el saldo actal (the saldo to set)
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Nos devuelve el tipo de interés
     *
     * @return <code>tipoInterés</code> Porcentaje a aplicar
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Asignamos el valor del tipo de interés
     *
     * @param tipoInterés Porcentaje a aplicar
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
