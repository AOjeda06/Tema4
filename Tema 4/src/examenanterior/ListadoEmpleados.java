package examenanterior;

import java.util.HashSet;

/**
 * Clase que gestiona un listado de empleados.
 */
public class ListadoEmpleados {
	static private HashSet<Empleado> BaseDeDatos = new HashSet<>();

	/**
	 * Añade un nuevo empleado a la base de datos.
	 *
	 * @param nuevoEmpleado el nuevo empleado a añadir
	 * @return true si el empleado fue añadido correctamente, false en caso
	 *         contrario
	 */
	public static boolean añadirEmpleadoNuevo(Empleado nuevoEmpleado) {
		return BaseDeDatos.add(nuevoEmpleado);
	}

	/**
	 * Imprime la base de datos de empleados.
	 */
	public static void imprimirBD() {
		for (Empleado elemento : BaseDeDatos) {
			System.out.println(elemento.toString());
			System.out.println();
		}
	}

	/**
	 * Modifica las horas extras de un empleado.
	 *
	 * @param e           el empleado a modificar
	 * @param horasNuevas las nuevas horas extras
	 * @return true si las horas fueron modificadas correctamente, false en caso
	 *         contrario
	 */
	public static boolean modificarHoras(Empleado e, int horasNuevas) {
		boolean resultado = false;

		Empleado modificar = buscarEmpleado(e);

		if (modificar != null) {
			modificar.setHorasExtra(horasNuevas);
			resultado = true;
		}

		return resultado;
	}

	/**
	 * Busca un empleado en la base de datos.
	 *
	 * @param e el empleado a buscar
	 * @return el empleado encontrado, o null si no se encuentra
	 */
	public static Empleado buscarEmpleado(Empleado e) {
		Empleado e2 = null;

		for (Empleado elemento : BaseDeDatos) {
			if (e.equals(elemento)) {
				e2 = elemento;
			}
		}
		return e2;
	}

	/**
	 * Elimina un empleado de la base de datos.
	 *
	 * @param e el empleado a eliminar
	 * @return true si el empleado fue eliminado correctamente, false en caso
	 *         contrario
	 */
	public static boolean eliminarEmpleado(Empleado e) {
		boolean resultado = false;

		Empleado eliminar = buscarEmpleado(e);

		if (eliminar != null) {
			BaseDeDatos.remove(eliminar);
			resultado = true;
		}

		return resultado;
	}

	/**
	 * Modifica el importe de horas extra para todos los empleados en la base de
	 * datos.
	 *
	 * @param nuevoImporte el nuevo importe de horas extra
	 */
	public static void modificarImporteHE(double nuevoImporte) {
		Empleado.setImporteHorasExtraDefault(nuevoImporte);
		for (Empleado elemento : BaseDeDatos) {
			elemento.setImporteHorasExtra(nuevoImporte);
		}
	}
}
