package Cuenta;

/**
 * Clase CCuentaData.
 * 
 * Getters y Setters de CCcuenta
 * 
 * @author Antonio Jes�s S�nchez Santacruz
 * @version 1.0
 */
public class CCuentaInfo {
	/**
	 * Nombre del titular
	 */
	private String nombre;
	/**
	 * N�mero de cuenta
	 */
	private String cuenta;
	/**
	 * Saldo de la cuenta
	 */
	private double saldo;
	/**
	 * Constructor por defecto
	 */
	public CCuentaInfo() {
	}

	/**
	 * Te muestra el nombre del titular
	 * 
	 * @return nombre del titular
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Pone un nombre de titular a la cuenta
	 * 
	 * @param nombre del titular
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Muestra el n�mero de cuenta del titular
	 * 
	 * @return n�mero de cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Poner un n�mero de cuenta
	 * 
	 * @param cuenta (n�mero de cuenta)
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Muestra el saldo de la cuenta
	 * 
	 * @return saldo de la cuenta
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Pone un saldo a la cuenta
	 * 
	 * @param saldo de la cuenta
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}