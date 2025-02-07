package parte1.ej2;

import java.util.Scanner;

public class Ej2 {
	// Scanner
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Variables
		String dni;
		String nombre;
		String apellidos;
		int edad;

		// Creamos un array para almacenar las personas
		Persona[] personas = new Persona[2];

		for (int i = 0; i < personas.length; i++) {
			System.out.println("DNI: ");
			dni = scanner.nextLine();
			System.out.println("NOMBRE: ");
			nombre = scanner.nextLine();
			System.out.println("APELLIDOS: ");
			apellidos = scanner.nextLine();
			System.out.println("EDAD: ");
			edad = scanner.nextInt();
			scanner.nextLine();

			// Creamos el objeto Persona y lo almacenamos en el array
			personas[i] = new Persona(dni, nombre, apellidos, edad);
		}

		// Imprimir los objetos Persona
		for (Persona persona : personas) {
			System.out.println(persona);
		}

		// Modificar los valores de los atributos utilizando los setters
		personas[0].setNombre("NuevoNombre1");
		personas[0].setEdad(personas[0].getEdad() + 1);
		personas[1].setApellidos("NuevoApellido2");
		personas[1].setDni("NuevoDNI2");

		System.out.println("\nDespués de las modificaciones:");

		// Imprimir los objetos Persona modificados
		for (Persona persona : personas) {
			System.out.println(persona);
		}

		// Probar métodos esMayorEdad, esJubilado y diferenciaEdad
		System.out.println("\nPruebas de métodos adicionales:");
		System.out.println(personas[0].getNombre() + " es mayor de edad: " + personas[0].esMayorEdad());
		System.out.println(personas[1].getNombre() + " es jubilado: " + personas[1].esJubilado());
		System.out.println("Diferencia de edad entre " + personas[0].getNombre() + " y " + personas[1].getNombre()
				+ ": " + personas[0].diferenciaEdad(personas[1]) + " años");
	}
}
