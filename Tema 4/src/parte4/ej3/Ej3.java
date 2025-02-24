package parte4.ej3;

import java.util.Scanner;
import parte2.ej4.Pizza;

public class Ej3 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Variable para el menú
		int ans;

		do {
			// Menú
			System.out.println("1. Listado");
			System.out.println("2. Nuevo Pedido");
			System.out.println("3. Pizza Servida");
			System.out.println("0. Salir");
			ans = scanner.nextInt();
			scanner.nextLine(); // Añadir una línea aquí para evitar problemas de entrada.

			// Acción seleccionada
			switch (ans) {
			case 1 -> listar();
			case 2 -> nuevoPedido();
			case 3 -> servida();
			case 0 -> ans = 0;
			default -> System.out.println("Opción no válida, intenta de nuevo.");
			}

		} while (ans != 0);
	}

	/**
	 * Lista todos los pedidos disponibles.
	 */
	public static void listar() {
		CRUD.listado();
	}

	/**
	 * Crea un nuevo pedido de pizza pidiendo los datos al usuario.
	 */
	public static void nuevoPedido() {
		int codigo = pedirCodigo();
		String tamaño = pedirTamaño();
		String tipo = pedirTipo();

		Pizza nuevoArticulo = new Pizza(codigo, tamaño, tipo);

		if (CRUD.añadirObjeto(nuevoArticulo)) {
			System.out.println("Pedido procesado correctamente");
		} else {
			System.out.println("No se ha podido procesar su pedido");
		}
	}

	/**
	 * Marca una pizza como servida basándose en el código del pedido.
	 */
	public static void servida() {
		int codigo = pedirCodigo();

		if (CRUD.pizzaServida(codigo)) {
			System.out.println("Pizza servida");
		} else {
			System.out.println("Pizza no encontrada");
		}
	}

	/**
	 * Pide al usuario el código de un pedido.
	 * 
	 * @return el código del pedido ingresado por el usuario
	 */
	public static int pedirCodigo() {
		int cod;
		System.out.println("Introduce el código");
		cod = scanner.nextInt();
		return cod;
	}

	/**
	 * Pide al usuario el tamaño de la pizza.
	 * 
	 * @return el tamaño de la pizza ingresado por el usuario
	 */
	public static String pedirTamaño() {
		String tamaño;
		System.out.println("Introduce el tamaño");
		tamaño = scanner.next();
		return tamaño.toUpperCase();
	}

	/**
	 * Pide al usuario el tipo de pizza.
	 * 
	 * @return el tipo de pizza ingresado por el usuario
	 */
	public static String pedirTipo() {
		String tipo;
		System.out.println("Introduce el tipo");
		tipo = scanner.next();
		return tipo.toUpperCase();
	}
}
