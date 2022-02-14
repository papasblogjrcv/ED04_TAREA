package cuentas;
/**
 * Clase que crea una cuenta con los datos
 * del usuario como son
 * nombre de tipo String
 * cuenta de tipo String
 * saldo de tipo double
 * TipoInterés de tipo double
 * Crea metodos de estado, ingresar y retirar
 * @author Juan Ramon Castaños Villacieros DAM A
 *
 */
public class CCuenta {
	/**
	 * Constructor de la clase CCcuenta
	 * @param nombre
	 * @param cuenta
	 * @param saldo
	 * @param TipoInterés
	 */

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
/**
 * constructor de cuenta
 */
    public CCuenta()
    {
    }
    /**
     * Constructor de la clase CCuenta
     * @param nom nombre de usuario
     * @param cue cuenta de usuario
     * @param sal saldo de usuario
     * @param tipo tipo de interés de usuario
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
    	/** Metodo que deuelve el saldo
    	 * de un cliente concreto con una cuenta concreta
    	 * @param sal,cue,nom
    	 * 
    	 */
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
 /**
  * Metodo que devuelve el estado del saldo del cliente
  * @return saldo
  */
    public double estado()
     {
    	
        return getSaldo();
    }
/**
 * Metodo que ingresa dinero en la cuenta del cliente
 * Simpre que la cantidad sea mayor de 0
 * @param cantidad cantidad a ingresar
 * @throws Exception cantidad cero o no valida
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * metodo que permite retirar una cantidad mayor que 0
 * que no supere el saldo
 * @param cantidad cantidad a retirar
 * @throws Exception cantidad mayor que saldo o cero
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
/**
 * getter de nombre
 * @return devuelve el nombre del propietario de la cuenta 
 * 
 */
	private String getNombre() {
		return nombre;
	}
/** setter de nombre
 * metodo que añade el nombre del propietario de una cuenta
 * @param nombre
 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * getter de cuenta
 *  Método que devuelve una cuenta de un usuario
 * 
 * @return
 */
	private String getCuenta() {
		return cuenta;
	}
/**
 * Setter cuenta
 * Metodo que añade una cuenta a un usuario
 * @param cuenta
 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
/** getter saldo
 * Metodo que obtiene el saldo de un cuenta de un usuario
 * @return saldo
 */
	private double getSaldo() {
		return saldo;
	}
/**
 * setter saldo
 * Método que indica el saldo de una cuenta y usuario
 * @see
 * @param saldo
 */
	
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/**
 * getter TipoInterés
 * Método que devuelve el interes de la cuenta de un usuario
 * @return tipoInterés
 */
	private double getTipoInterés() {
		return tipoInterés;
	}
/**
 * setter TipoInterés
 * Metodo que pone el tipo de interes de la cuenta de un usuario
 * @param tipoInterés
 */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
