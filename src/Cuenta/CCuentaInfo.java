package Cuenta;

/**
 * Clase CCuentaData.
 * 
 * Getters y Setters de CCcuenta
 * 
 * @author Antonio Jesús Sánchez Santacruz
 * @version 1.0
 */
public class CCuentaInfo {
	/**
	 * Nombre del titular
	 */
	private String nombre;
	/**
	 * Número de cuenta
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
	 * Muestra el número de cuenta del titular
	 * 
	 * @return número de cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Poner un número de cuenta
	 * 
	 * @param cuenta (número de cuenta)
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