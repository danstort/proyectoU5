/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectou5;

/**
 *
 * @author danie
 */
public class CCuenta {


    // Propiedades de la Clase Cuenta
    
    /**
     * Titular de la cuenta
     */
    protected String nombre;
    
    /**
     * Nombre de la cuenta
     */
    protected String cuenta;
    
    /**
     * Saldo disponible
     */
    protected double saldo;
    
    /**
     * Interés aplicado a la cuenta
     */
    protected double tipoInterés;

    /**
     * Constructor sin argumentos
     */
    public CCuenta ()
    {}
    
    /**
     * Constructor con parámetro para iniciar todas las propiedades de la clase
     * @param nom tipo String que asigna el nombre del titular de la cuenta
     * @param cue tipo String que asigna el nombre de la cuenta
     * @param sal tipo double que asigna el saldo de la cuenta
     * @param tipo tipo double que indica el tipo de cuenta
     */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre=nom;
        cuenta=cue;
        saldo=sal;
    }
   
    /**
     * Método para asignar el nombre del titular de la cuenta
     * @param nom tipo String para asignar el titular de la cuenta
     */
    public void setNombre(String nom)
    {
        nombre=nom;
    }

    /**
     * Método que me devuelve el nombre del titular
     * @return devuelve el titular de la cuenta
     */
    public String getNombre()
    {
        return nombre;
    }

    
    /**
     * Método que me devuelve el saldo disponible en cada momento
     * @return devuelve el saldo disponible de la cuenta
     */
     public double getEstado ()
    {
        return getSaldo();
    }

    
     /**
      * Método para ingresar cantidades en la cuenta. Modifica el saldo.
      * @param cantidad tipo double cantidad a ingresar en la cuenta
      * @throws Exception produce una excepcion cuando se intenta ingresar una cantidad negativa.
      */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Método para retirar cantidades en la cuenta. Modifica el saldo.
     * @param cantidad tipo double que indica la cantidad a ingresar.
     * @throws Exception tipo Excepción cuando el argumento cantidad sea menor que 0 o mayor que la cantidad a retirar.
     */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getEstado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }


    /**
     * Método que me devuelve el número de cuenta
     * @return devuelve el estado de la cuenta
     */
    public String getCuenta ()
    {
        return cuenta;
    }

    /**
     * Actualiza el nombre de la cuenta
     * @param cuenta tipo String para cambiar el nombre de la cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Actualiza el saldo de la cuenta
     * @return devuelve el saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Actualiza el saldo de la cuenta
     * @param saldo tipo double para actualizar el saldo disponible de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés
     * @return devuelve el tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Actualiza el tipo de interés.
     * @param tipoInterés tipo double para actualizar el tipo de interés.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
