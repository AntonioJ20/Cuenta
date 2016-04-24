package Cuenta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase TestCCuenta.
 * 
 * Aqu� podemos encontrar el main del proyecto y los m�todos que hacen ingresar y retirar una cantidad de dinero
 * 
 * @author Antonio Jes�s S�nchez Santacruz
 * @version 1.0
 */
public class TestCCuenta {
	/**
	 * Desde aqu� podemos leer desde teclado
	 */
	private static BufferedReader dato;

	/**
	 * Main principal
	 * @param args argumentos de main
	 */
	public static void main(String[] args) {
		dato = new BufferedReader(new InputStreamReader(
				System.in));
		CCuenta d15sasaa;

		int opc = 0;
		d15sasaa = new CCuenta("Antonio Jes�s S�nchez Santacruz", "2156465-32465-3256322-634",
				1000);
		do {
			try {
				mostrarMenu();
				opc = recogerOpcion(dato);

				switch (opc) {
				case 1:
					ingresar(dato, d15sasaa);
					break;
				case 2:
					retirar(dato, d15sasaa);
					break;
				case 3:
					System.out.println("�Hasta luego!");
				}
			} catch (IOException ex) {
				Logger.getLogger(TestCCuenta.class.getName()).log(Level.SEVERE,
						null, ex);
			}
		} while (opc != 3);
		System.out.println("Saldo actual: " + d15sasaa.getCuenta());
	}
	
	/**
	 * Menu con opciones
	 */
	private static void mostrarMenu() {
		System.out.println("MENU");
		System.out.println("Ingresar");
		System.out.println("Retirar");
		System.out.println("Salir");
	}

	/**
	 * M�todo que lee una opci�n introducida por teclado
	 * 
	 * @param dato
	 * @return opcion (entero)
	 * @throws IOException
	 */
	private static int recogerOpcion(BufferedReader dato) throws IOException {
		int opcion;
		opcion = Integer.parseInt(dato.readLine());
		return opcion;
	}

	/**
	 * Retirar dinero de la cuenta
	 * 
	 * @param dato
	 * @param cuenta1
	 * @throws IOException
	 */
	private static void retirar(BufferedReader dato, CCuenta cuenta1) throws IOException {
		System.out.println("�Qu� cantidad quiere retirar? ");
		float retirar = Integer.parseInt(dato.readLine());
		try {
			cuenta1.retirar(retirar);
		} catch (Exception e) {
			System.out.print("No se pudo retirar dinero");
		}
	}

	/**
	 * Ingresa dinero en la cuenta
	 * 
	 * @param dato
	 * @param cuenta1
	 * @throws IOException
	 */
	private static void ingresar(BufferedReader dato, CCuenta cuenta1) throws IOException {
		System.out.println("�Qu� cantidad quiere ingresar? ");
		float ingresar = Integer.parseInt(dato.readLine());
		try {
			System.out.println("Ingreso en cuenta");
			cuenta1.ingresar(ingresar);
		} catch (Exception e) {
			System.out.print("No se pudo ingresar dinero");
		}
	}
}
