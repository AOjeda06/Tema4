package parte4.ej3;

import java.util.ArrayList;
import parte2.ej4.Pizza;

public class CRUD {

	/**
	 * Lista de pizzas almacenadas.
	 */
	static private ArrayList<Pizza> listaPizza = new ArrayList<>();

	/**
	 * Muestra un listado de todas las pizzas.
	 */
	public static void listado() {
		for (Pizza elemento : listaPizza) {
			System.out.println(elemento.toString());
		}
	}

	/**
	 * Añade una nueva pizza a la lista.
	 * 
	 * @param nueva la pizza a añadir
	 * @return true si la pizza se añade correctamente, false en caso contrario
	 */
	public static boolean añadirObjeto(Pizza nueva) {
		return listaPizza.add(nueva);
	}

	/**
	 * Marca una pizza como servida basándose en el código del pedido.
	 * 
	 * @param codigo el código del pedido
	 * @return true si la pizza es encontrada y marcada como servida, false en caso
	 *         contrario
	 */
	public static boolean pizzaServida(int codigo) {
		boolean res = false;
		for (Pizza elemento : listaPizza) {
			if (elemento.getCodigo() == (codigo)) {
				elemento.setEstado("SERVIDA");
				res = true;
			}
		}
		return res;
	}
}
