package examenanterior;

import java.util.HashSet;

public class ListadoEmpleados {
	static private HashSet<Empleado> BaseDeDatos = new HashSet<>();

	public static boolean añadirEmpleadoNuevo(Empleado nuevoEmpleado) {
		return BaseDeDatos.add(nuevoEmpleado);
	}

	public static void imprimirBD() {
		for (Empleado elemento : BaseDeDatos) {
			System.out.println(elemento);
			System.out.println();
		}
	}

	public static boolean modificarHoras(Empleado e, int horasNuevas) {
		boolean resultado = false;

		Empleado modificar = buscarEmpleado(e);

		if (modificar != null) {
			modificar.setHorasExtra(horasNuevas);
			resultado = true;
		}

		return resultado;
	}

	public static Empleado buscarEmpleado(Empleado e) {
		Empleado e2 = null;

		for (Empleado elemento : BaseDeDatos) {
			if (e.equals(elemento)) {
				e2 = elemento;
			}
		}
		return e2;
	}
}
