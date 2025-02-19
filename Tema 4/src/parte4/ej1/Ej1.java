package parte4.ej1;

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

		System.out.println("Indica el nombre: ");
		nombre = scanner.nextLine();
		scanner.nextLine();

		System.out.println("Indica la media: ");
		media = scanner.nextDouble();
		scanner.nextLine();

		Alumno nuevoAlumno = new Alumno(nombre, media);

		CRUD.añadirObjeto(nuevoAlumno);
	}

	/**
	 * Solicita el nombre de un alumno y modifica su media si el alumno existe.
	 */
	public static void modificar() {
		String nombre;
		double media;
		Alumno buscado;

		System.out.println("Indica el nombre: ");
		nombre = scanner.nextLine();
		scanner.nextLine();

		if (CRUD.buscarAlumno(nombre) != null) {
			buscado = CRUD.buscarAlumno(nombre);

			System.out.println("Indica la nueva media: ");
			media = scanner.nextDouble();
			scanner.nextLine();

			buscado.setMedia(media);

		} else {
			System.out.println("El alumno no existe");
		}
	}

	/**
	 * Solicita el nombre de un alumno y lo elimina de la lista si existe.
	 */
	public static void eliminar() {
		String nombre;

		System.out.println("Indica el nombre: ");
		nombre = scanner.nextLine();
		scanner.nextLine();
		if (CRUD.buscarAlumno(nombre) != null) {

			CRUD.borrarAlumno(nombre);

		} else {
			System.out.println("El alumno no existe");
		}
	}
}
