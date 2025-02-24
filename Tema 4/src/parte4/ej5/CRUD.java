package parte4.ej5;

import java.util.ArrayList;

import parte2.ej1.CuentaCorriente;

public class CRUD {
	/**
	 * Lista de cuentas corrientes almacenadas.
	 */
	static private ArrayList<CuentaCorriente> listaCuentas = new ArrayList<>();

	/**
	 * Lista todas las cuentas corrientes disponibles.
	 */
	public static void listaCuentas() {
		for (CuentaCorriente elemento : listaCuentas) {
			System.out.println(elemento.toString());
		}
	}

	/**
	 * Añade una nueva cuenta corriente a la lista.
	 * 
	 * @param nueva La nueva cuenta corriente a añadir.
	 * @return true si la cuenta corriente se añadió correctamente, false en caso
	 *         contrario.
	 */
	public static boolean añadirNuevaCC(CuentaCorriente nueva) {
		return listaCuentas.add(nueva);
	}

	/**
	 * Busca y elimina una cuenta corriente por su DNI.
	 * 
	 * @param dni El DNI de la cuenta corriente a eliminar.
	 * @return true si la cuenta corriente se eliminó correctamente, false en caso
	 *         contrario.
	 */
	public static boolean buscarBorrar(String dni) {
		boolean res = false;

		for (CuentaCorriente elemento : listaCuentas) {
			if (elemento.getDni().equals(dni)) {
				res = listaCuentas.remove(elemento);
			}
		}

		return res;
	}
}
