package parte1.ej2;

import java.util.Scanner;

public class Ej2 {
	// Scanner
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Creamos los objetos y un array para facilitar la introduccion de datos
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona[] personas = { p1, p2 };

		// Metemos los datos a los objetos
		for (int i = 0; i < 2; i++) {
			System.out.println("Introduce el nombre");
			personas[i].nombre = scanner.nextLine();

			System.out.println("Introduce los apellidos");
			personas[i].apellidos = scanner.nextLine();

			System.out.println("Introduce el dni");
			personas[i].dni = scanner.nextLine();

			System.out.println("Introduce la edad");
			personas[i].edad = scanner.nextInt();
			scanner.nextLine();
		}

		// Imprimir los objetos Persona
		System.out.println(p1);
		System.out.println(p2);
	}
}
