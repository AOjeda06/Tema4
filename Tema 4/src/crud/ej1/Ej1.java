package crud.ej1;

import java.util.Scanner;

import parte2.ej3.Alumno;

public class Ej1 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		// Variable para el menú
		int ans;

		do {
			// Menú
			System.out.println("1. Listado");
			System.out.println("2. Nuevo Alumno");
			System.out.println("3. Modificar");
			System.out.println("4. Borrar");
			System.out.println("5. Salir");
			ans = scanner.nextInt();
			scanner.nextLine(); // Añadir una línea aquí para evitar problemas de entrada.

			// Acción seleccionada
			switch (ans) {
			case 1 -> CRUD.imprimirLista();
			case 2 -> nuevoAlumno();
			case 3 -> modificar();
			case 4 -> eliminar();
			case 5 -> ans = 0;
			}

		} while (ans != 0);
	}

	/**
	 * Solicita los datos para crear un nuevo alumno y lo añade a la lista.
	 */
	public static void nuevoAlumno() {
		String nombre;
		double media;

		nombre = pedirNombre();

		media = pedirMedia();

		Alumno nuevoAlumno = new Alumno(nombre, media);

		CRUD.añadirObjeto(nuevoAlumno);
		System.out.println("Alumno añadido correctamente");
	}

	/**
	 * 
	 * @return Devuelve la media
	 */
	private static double pedirMedia() {
		double media;
		System.out.println("Indica la media: ");
		media = scanner.nextDouble();
		scanner.nextLine();
		return media;
	}

	/**
	 * 
	 * @return Devuelve el nombre
	 */
	private static String pedirNombre() {
		String nombre;
		System.out.println("Indica el nombre: ");
		nombre = scanner.nextLine();
		scanner.nextLine();
		return nombre;
	}

	/**
	 * Solicita el nombre de un alumno y modifica su media si el alumno existe.
	 */
	public static void modificar() {
		String nombre;
		double media;

		nombre = pedirNombre();

		if (CRUD.buscarAlumno(nombre) != null) {
			media = pedirMedia();

			if (CRUD.buscarAlumnoYModificar(nombre, media)) {
				System.out.println("Datos modificados correctamente");
			}

		} else {
			System.out.println("El alumno no existe");
		}
	}

	/**
	 * Solicita el nombre de un alumno y lo elimina de la lista si existe.
	 */
	public static void eliminar() {
		String nombre;

		nombre = pedirNombre();
		if (CRUD.buscarAlumno(nombre) != null) {

			CRUD.borrarAlumno(nombre);
			System.out.println("Alumno borrado correctamente");

		} else {
			System.out.println("El alumno no existe");
		}
	}
}
