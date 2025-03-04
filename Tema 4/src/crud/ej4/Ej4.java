package crud.ej4;

import java.util.Scanner;

public class Ej4 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Variable para el menú
		int ans;

		do {
			// Menú
			System.out.println("1. Listado");
			System.out.println("2. Nuevo Disco");
			System.out.println("3. Borrar");
			System.out.println("0. Salir");
			ans = scanner.nextInt();
			scanner.nextLine(); // Añadir una línea aquí para evitar problemas de entrada.

			// Acción seleccionada
			switch (ans) {
			case 1 -> listar();
			case 2 -> nuevoDisco();
			case 3 -> borrar();
			case 0 -> ans = 0;
			default -> System.out.println("Opción no válida, intenta de nuevo.");
			}

		} while (ans != 0);

	}

	/**
	 * Método que lista los discos disponibles.
	 */
	public static void listar() {
		CRUD.listadoDiscos();
	}

	/**
	 * Método que permite al usuario añadir un nuevo disco.
	 */
	public static void nuevoDisco() {
		int cod = preguntaCodigo();
		String autor = preguntaAutor();
		String titulo = preguntaTitulo();
		double duracion = preguntaDuracion();
		String genero = preguntaGenero();
		Disco nuevoDisco = null;
		try {
			nuevoDisco = new Disco(cod, autor, titulo, duracion, genero);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		if (CRUD.añadirDisco(nuevoDisco)) {
			System.out.println("Disco añadido correctamente");
		} else {
			System.out.println("No se ha podido añadir el disco");
		}
	}

	/**
	 * Método que solicita al usuario el código del disco.
	 * 
	 * @return el código del disco.
	 */
	public static int preguntaCodigo() {
		System.out.println("Escriba el codigo: ");
		int cod = scanner.nextInt();
		return cod;
	}

	/**
	 * Método que solicita al usuario el autor del disco.
	 * 
	 * @return el autor del disco.
	 */
	public static String preguntaAutor() {
		System.out.println("Escriba el autor: ");
		String autor = scanner.nextLine();
		return autor;
	}

	/**
	 * Método que solicita al usuario el título del disco.
	 * 
	 * @return el título del disco.
	 */
	public static String preguntaTitulo() {
		System.out.println("Escriba el titulo: ");
		String titulo = scanner.nextLine();
		return titulo;
	}

	/**
	 * Método que solicita al usuario la duración del disco en horas.
	 * 
	 * @return la duración del disco en horas.
	 */
	public static double preguntaDuracion() {
		System.out.println("Escriba la duracion: ");
		double duracion = scanner.nextDouble();
		return duracion;
	}

	/**
	 * Método que solicita al usuario el género del disco.
	 * 
	 * @return el género del disco.
	 */
	public static String preguntaGenero() {
		System.out.println("Escriba el genero: ");
		String genero = scanner.nextLine();
		return genero;
	}

	/**
	 * Método que permite al usuario borrar un disco.
	 */
	public static void borrar() {
		int cod = preguntaCodigo();

		if (CRUD.buscarBorrar(cod)) {
			System.out.println("Disco eliminado");
		} else {
			System.out.println("No se ha encontrado el disco");
		}
	}
}
