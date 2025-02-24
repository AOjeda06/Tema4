package parte4.ej4;

import java.util.ArrayList;

public class CRUD {
	/**
	 * Lista de discos almacenados.
	 */
	static private ArrayList<Disco> listaDiscos = new ArrayList<>();

	/**
	 * Lista todos los discos disponibles.
	 */
	public static void listadoDiscos() {
		for (Disco elemento : listaDiscos) {
			System.out.println(elemento.toString());
		}
	}

	/**
	 * Añade un nuevo disco a la lista.
	 * 
	 * @param nuevo El nuevo disco a añadir.
	 * @return true si el disco se añadió correctamente, false en caso contrario.
	 */
	public static boolean añadirDisco(Disco nuevo) {
		return listaDiscos.add(nuevo);
	}

	/**
	 * Busca y elimina un disco por su código.
	 * 
	 * @param cod El código del disco a eliminar.
	 * @return true si el disco se eliminó correctamente, false en caso contrario.
	 */
	public static boolean buscarBorrar(int cod) {
		boolean res = false;

		for (Disco elemento : listaDiscos) {
			if (elemento.getCodigo() == cod) {
				res = listaDiscos.remove(elemento);
			}
		}

		return res;
	}
}
