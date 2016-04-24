package Cuenta;

/**
 * Clase CCuenta.
 * En esta clase encontramos las operaciones que vamos a realizar con nuestra cuenta
 * 
 * @author Antonio Jes�s S�nchez Santacruz
 * @version 1.0
 */
public class CCuenta {
	/**
	 * Aqu� encontramos los datos de la cuenta
	 */
	CCuentaInfo info = new CCuentaInfo();

	/**
	 * Constructor con nombre del titular, numero de cuenta y saldo de la cuenta
	 * 
	 * @param nombre nombre del titular
	 * @param cuenta n�mero de cuenta
	 * @param saldo saldo de la cuenta
	 */
	public CCuenta(String nombre, String cuenta, double saldo) {
		info.setNombre(nombre);
		info.setCuenta(cuenta);
		info.setSaldo(saldo);
	}

	/**
	 * Nos muestra el saldo que tiene la cuenta
	 * 
	 * @return saldo de la cuenta
	 */
	public double getCuenta() {
		return info.getSaldo();
	}

	/**
	 * Ingresa la cantidad de dinero que le indicamos en nuestra cuenta
	 * 
	 * @param cantidad a ingresar
	 * @throws Exception
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se ha podido ingresar la cantidad que indica");
		}
		setSaldo(info.getSaldo() + cantidad);
	}

	/**
	 * Retira la cantidad de dinero que le indicamos de nuestra cuenta
	 * 
	 * @param cantidad a retirar
	 * @throws Exception
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se ha podido retirar la cantidad que indica");
		}
		if (getCuenta() < cantidad) {
			throw new Exception("El saldo es negativo, no puede retirar esa cantidad de dinero");
		}
		setSaldo(info.getSaldo() - cantidad);
	}

	/**
	 * Indica el saldo de la cuenta despu�s de realizar movimientos
	 * 
	 * @param saldo de la  cuenta
	 */
	public void setSaldo(double saldo) {
		this.info.setSaldo(saldo);
	}
}
