package examenanterior;

import java.util.Scanner;

/**
 * Clase principal que contiene el menú y las funciones para gestionar
 * empleados.
 */
public class Principal {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Variable para el menú
		int ans;

		do {
			// Menú
			System.out.println("1. Añadir Empleado");
			System.out.println("2. Listar Empleados");
			System.out.println("3. Modificar horas extra");
			System.out.println("4. Modificar importe horas extra");
			System.out.println("5. Eliminar empleado");
			System.out.println("0. Salir");
			ans = scanner.nextInt();
			scanner.nextLine(); // Añadir una línea aquí para evitar problemas de entrada.

			// Acción seleccionada
			switch (ans) {
			case 1 -> añadirEmpleado();
			case 2 -> listarEmpleado();
			case 3 -> modificarHoras();
			case 4 -> modificarImporte();
			case 5 -> eliminarEmpleado();
			case 0 -> ans = 0;
			default -> System.out.println("Opción no válida, intenta de nuevo.");
			}

		} while (ans != 0);
	}

	public static void añadirEmpleado() {
		String dni = pedirDni();
		String nombre = pedirNombre();
		double sueldoBase = pedirSueldoBase();
		int horasExtra = pedirHorasExtra();

		try {
			Empleado nuevoEmpleado = new Empleado(dni, nombre, sueldoBase, horasExtra);
			if (ListadoEmpleados.añadirEmpleadoNuevo(nuevoEmpleado)) {
				System.out.println("Empleado añadido correctamente");
			} else {
				System.out.println("No se ha podido añadir el nuevo empleado a la base de datos");
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void listarEmpleado() {
		ListadoEmpleados.imprimirBD();
	}

	public static void modificarHoras() {
		String dni = pedirDni();
		int horas = pedirHorasExtra();

		try {
			Empleado empleadoParaModificar = new Empleado(dni);
			if (ListadoEmpleados.modificarHoras(empleadoParaModificar, horas)) {
				System.out.println("Empleado modificado correctamente");
			} else {
				System.out.println("No se ha podido modificar los datos");
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void modificarImporte() {
		double importe = pedirImporte();
		ListadoEmpleados.modificarImporteHE(importe);
		System.out.println("Importe modificado.");
	}

	public static void eliminarEmpleado() {
		String dni = pedirDni();

		try {
			Empleado empleadoParaEliminar = new Empleado(dni);
			if (ListadoEmpleados.eliminarEmpleado(empleadoParaEliminar)) {
				System.out.println("Empleado eliminado correctamente");
			} else {
				System.out.println("No se ha podido encontrar al empleado");
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	private static String pedirNombre() {
		System.out.println("Escriba el nombre del Empleado: ");
		String nombre = scanner.next();
		scanner.nextLine();
		return nombre;
	}

	private static String pedirDni() {
		System.out.println("Escriba el dni del empleado: ");
		String dni = scanner.next();
		scanner.nextLine();
		return dni;
	}

	private static double pedirSueldoBase() {
		System.out.println("Indique el sueldo base del empleado: ");
		double sueldo = scanner.nextDouble();
		scanner.nextLine();
		return sueldo;
	}

	private static int pedirHorasExtra() {
		System.out.println("Indique el numero de horas extra: ");
		int horas = scanner.nextInt();
		scanner.nextLine();
		return horas;
	}

	private static double pedirImporte() {
		System.out.println("Introduzca el nuevo importe: ");
		double importe = scanner.nextDouble();
		scanner.nextLine();
		return importe;
	}
}
