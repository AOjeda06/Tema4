package parte4.ej2;

import java.util.Scanner;

import parte1.ej4.Articulo;

public class Ej2 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Variable para el menú
		int ans;

		do {
			// Menú
			System.out.println("1. Listado");
			System.out.println("2. Nuevo Articulo");
			System.out.println("3. Borrar Articulo");
			System.out.println("4. Modificar Precio de Articulo");
			System.out.println("5. Entrada de mercancia");
			System.out.println("6. Salida de mercancia");
			System.out.println("0. Salir");
			ans = scanner.nextInt();
			scanner.nextLine(); // Añadir una línea aquí para evitar problemas de entrada.

			// Acción seleccionada
			switch (ans) {
			case 1 -> listarArticulos();
			case 2 -> altaArticulo();
			case 3 -> borrarArticulo();
			case 4 -> modificar();
			case 5 -> entrada();
			case 6 -> salida();
			case 0 -> ans = 0;
			}

		} while (ans != 0);
	}

	/**
	 * Pide al usuario el nombre de un artículo.
	 * 
	 * @return el nombre del artículo ingresado por el usuario
	 */
	public static String pedirNombre() {
		String nombre;

		System.out.println("Escriba el nombre");
		nombre = scanner.nextLine();

		return nombre;
	}

	/**
	 * Pide al usuario el precio de un artículo.
	 * 
	 * @return el precio del artículo ingresado por el usuario
	 */
	public static double pedirPrecio() {
		double precio;

		System.out.println("Escriba el precio");
		precio = scanner.nextDouble();

		return precio;
	}

	/**
	 * Pide al usuario la cantidad de stock de un artículo.
	 * 
	 * @return el stock del artículo ingresado por el usuario
	 */
	public static int pedirStock() {
		int stock;

		System.out.println("Indique el stock");
		stock = scanner.nextInt();

		return stock;
	}

	/**
	 * Lista todos los artículos disponibles.
	 */
	public static void listarArticulos() {
		System.out.println("Lista de artículos");
		CRUD.listado();
	}

	/**
	 * Da de alta un nuevo artículo pidiendo los datos al usuario.
	 */
	public static void altaArticulo() {
		String nombre = pedirNombre();
		double precio = pedirPrecio();
		final double IVA = 21;
		int stock = pedirStock();

		Articulo nuevoArticulo = new Articulo(nombre, precio, IVA, stock);

		if (CRUD.añadirArticulo(nuevoArticulo)) {
			System.out.println("Articulo añadido correctamente");
		} else {
			System.out.println("No se ha podido añadir el articulo");
		}
	}

	/**
	 * Borra un artículo existente pidiendo el nombre al usuario.
	 */
	public static void borrarArticulo() {
		String nombre = pedirNombre();

		if (CRUD.buscarArticulo(nombre)) {
			CRUD.eliminarArticulo(nombre);
			System.out.println("Articulo eliminado correctamente");
		} else {
			System.out.println("Articulo no encontrado");
		}
	}

	/**
	 * Modifica el precio de un artículo existente.
	 */
	public static void modificar() {
		String nombre = pedirNombre();
		double precio;
		if (CRUD.buscarArticulo(nombre)) {
			precio = pedirPrecio();
			CRUD.modificarPrecio(nombre, precio);
		} else {
			System.out.println("Articulo no encontrado");
		}
	}

	/**
	 * Realiza una entrada de mercancía (aumenta el stock) para un artículo
	 * existente.
	 */
	public static void entrada() {
		String nombre = pedirNombre();
		int stock;
		if (CRUD.buscarArticulo(nombre)) {
			System.out.println("En cuánto quiere modificar el stock? (+)");
			stock = scanner.nextInt();
			CRUD.entradaArticulos(nombre, stock);
		} else {
			System.out.println("Articulo no encontrado");
		}
	}

	/**
	 * Realiza una salida de mercancía (disminuye el stock) para un artículo
	 * existente.
	 */
	public static void salida() {
		String nombre = pedirNombre();
		int stock;
		if (CRUD.buscarArticulo(nombre)) {
			System.out.println("En cuánto quiere modificar el stock? (-)");
			stock = scanner.nextInt();
			CRUD.salidaArticulos(nombre, stock);
		} else {
			System.out.println("Articulo no encontrado");
		}
	}
}
