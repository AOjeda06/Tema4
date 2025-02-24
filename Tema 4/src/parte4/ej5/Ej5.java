package parte4.ej5;

import java.util.Scanner;
import parte2.ej1.CuentaCorriente;

public class Ej5 {
	static Scanner scanner = new Scanner(System.in);

	/**
	 * Método principal que gestiona el menú y las acciones del usuario.
	 * 
	 * @param args Argumentos de la línea de comandos (no se utilizan).
	 */
	public static void main(String[] args) {
		// Variable para el menú
		int ans;

		do {
			// Menú
			System.out.println("1. Listado");
			System.out.println("2. Nueva Cuenta");
			System.out.println("3. Borrar");
			System.out.println("0. Salir");
			ans = scanner.nextInt();
			scanner.nextLine(); // Añadir una línea aquí para evitar problemas de entrada.

			// Acción seleccionada
			switch (ans) {
			case 1 -> listar();
			case 2 -> nuevaCuenta();
			case 3 -> borrar();
			case 0 -> ans = 0;
			default -> System.out.println("Opción no válida, intenta de nuevo.");
			}

		} while (ans != 0);
	}

	/**
	 * Método que lista todas las cuentas corrientes disponibles.
	 */
	public static void listar() {
		CRUD.listaCuentas();
	}

	/**
	 * Método que permite al usuario crear una nueva cuenta corriente.
	 */
	public static void nuevaCuenta() {
		String dni = preguntaDni();
		String nombre = preguntaNombre();
		double saldo = preguntaSaldo();
		CuentaCorriente nuevaCC = null;

		try {
			nuevaCC = new CuentaCorriente(dni, nombre, saldo);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		if (CRUD.añadirNuevaCC(nuevaCC)) {
			System.out.println("Cuenta creada correctamente");
		} else {
			System.out.println("No se ha podido crear la cuenta");
		}
	}

	/**
	 * Método que permite al usuario borrar una cuenta corriente.
	 */
	public static void borrar() {
		String dni = preguntaDni();

		if (CRUD.buscarBorrar(dni)) {
			System.out.println("Cuenta eliminada correctamente");
		} else {
			System.out.println("No se ha podido eliminar la cuenta");
		}
	}

	/**
	 * Solicita al usuario que introduzca el DNI de la cuenta corriente.
	 * 
	 * @return El DNI introducido por el usuario.
	 */
	public static String preguntaDni() {
		System.out.println("Introduzca el dni: ");
		String dni = scanner.nextLine();
		return dni;
	}

	/**
	 * Solicita al usuario que introduzca el nombre del titular de la cuenta
	 * corriente.
	 * 
	 * @return El nombre introducido por el usuario.
	 */
	public static String preguntaNombre() {
		System.out.println("Introduzca el nombre: ");
		String nombre = scanner.nextLine();
		return nombre;
	}

	/**
	 * Solicita al usuario que introduzca el saldo inicial de la cuenta corriente.
	 * 
	 * @return El saldo introducido por el usuario.
	 */
	public static double preguntaSaldo() {
		System.out.println("Indique su saldo: ");
		double saldo = scanner.nextDouble();
		return saldo;
	}
}
