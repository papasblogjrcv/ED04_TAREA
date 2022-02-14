package cuentas;
/**
 * Clase que crea una cuenta con los datos
 * del usuario como son
 * nombre de tipo String
 * cuenta de tipo String
 * saldo de tipo double
 * TipoInter�s de tipo double
 * Crea metodos de estado, ingresar y retirar
 * @author Juan Ramon Casta�os Villacieros DAM A
 *
 */
public class CCuenta {
	/**
	 * Constructor de la clase CCcuenta
	 * @param nombre
	 * @param cuenta
	 * @param saldo
	 * @param TipoInter�s
	 */

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInter�s;
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
     * @param tipo tipo de inter�s de usuario
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
 * metodo que a�ade el nombre del propietario de una cuenta
 * @param nombre
 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * getter de cuenta
 *  M�todo que devuelve una cuenta de un usuario
 * 
 * @return
 */
	private String getCuenta() {
		return cuenta;
	}
/**
 * Setter cuenta
 * Metodo que a�ade una cuenta a un usuario
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
 * M�todo que indica el saldo de una cuenta y usuario
 * @see
 * @param saldo
 */
	
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/**
 * getter TipoInter�s
 * M�todo que devuelve el interes de la cuenta de un usuario
 * @return tipoInter�s
 */
	private double getTipoInter�s() {
		return tipoInter�s;
	}
/**
 * setter TipoInter�s
 * Metodo que pone el tipo de interes de la cuenta de un usuario
 * @param tipoInter�s
 */
	private void setTipoInter�s(double tipoInter�s) {
		this.tipoInter�s = tipoInter�s;
	}
}
