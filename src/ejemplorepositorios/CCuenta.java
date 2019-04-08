/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplorepositorios;

/**
 * Valores de la Cuenta Bancaria
 * @version 
 * @author 
 */
public class CCuenta {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInteres
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param tipoInteres the tipoInteres to set
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
    /**
     * nombre = el nombre de la cuenta bancaria
     */
    private String nombre;
    private String cuenta;
    private int saldo;
    private double tipoInteres;

    
    // Constructor con parámetros para iniciar todas las propiedades de la clase

    /**
     *
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta (String nom, String cue, int sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres = tipo;
    }
   

    // Método que me devuelve el saldo disponible en cada momento

    /**
     * Método que me devuelve el saldo disponible en cada momento
     * @return
     */
     public int estado ()
    {
        return getSaldo();
    }

    /** Método para ingresar cantidades en la cuenta. Modifica el saldo.
     * 
     */

    /**
     *
     * @param cantidad
     */

    public void ingresar(int cantidad) 
    {
        setSaldo(getSaldo() + cantidad);
    }
    
    // Devuelve verdadero si el saldo es menor que 0, falso en caso contrario

    /**
     *
     * @return
     */
    public boolean comprobarnumerosrojos()
    { 
        if(getSaldo()<0)
        return true;
        else return false;
    }
     
    // devuelve en formato string el nombre y la cuenta del objeto

    /**
     *
     * @return
     */
    public String dimeinfo()
      {
         String aux;
         aux = "El nombre del usuario es "+getNombre()+" y su cuenta es: "+getCuenta();
         return aux;
      }

    /* Método para retirar cantidades en la cuenta. Modifica el saldo.
     * 
     */

    /**
     *
     * @param cantidad
     */

    public void retirar (int cantidad) 
    {
        if (cantidad <= 0)
            System.out.println("No se puede retirar una cantidad negativa");
        else if (estado()< cantidad){
            setSaldo(-1);
            System.out.println("No hay suficiente saldo");}
        else{
            setSaldo(getSaldo() - cantidad);}
    }



   
   
}
