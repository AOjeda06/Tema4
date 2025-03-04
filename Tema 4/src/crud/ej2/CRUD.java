package crud.ej2;

import java.util.ArrayList;

import parte1.ej4.Articulo;

public class CRUD {

	/**
	 * Lista de artículos almacenados.
	 */
	static private ArrayList<Articulo> listaArticulos = new ArrayList<>();

	/**
	 * Muestra un listado de todos los artículos.
	 */
	public static void listado() {
		for (Articulo elemento : listaArticulos) {
			System.out.println(elemento.toString());
		}
	}

	/**
	 * Añade un nuevo artículo a la lista.
	 * 
	 * @param nuevoArticulo el artículo a añadir
	 * @return true si el artículo se añade correctamente, false en caso contrario
	 */
	public static boolean añadirArticulo(Articulo nuevoArticulo) {
		boolean res;
		res = listaArticulos.add(nuevoArticulo);
		return res;
	}

	/**
	 * Elimina un artículo de la lista por su nombre.
	 * 
	 * @param nombre el nombre del artículo a eliminar
	 */
	public static void eliminarArticulo(String nombre) {
		int index = buscarIndexArticulo(nombre);
		listaArticulos.remove(index);
	}

	/**
	 * Busca un artículo por su nombre.
	 * 
	 * @param nombre el nombre del artículo a buscar
	 * @return true si el artículo se encuentra en la lista, false en caso contrario
	 */
	public static boolean buscarArticulo(String nombre) {
		boolean res = false;
		for (Articulo elemento : listaArticulos) {
			if (elemento.getNombre().equals(nombre)) {
				res = true;
			}
		}
		return res;
	}

	/**
	 * Busca el índice de un artículo por su nombre.
	 * 
	 * @param nombre el nombre del artículo a buscar
	 * @return el índice del artículo en la lista, o -1 si no se encuentra
	 */
	public static int buscarIndexArticulo(String nombre) {
		Articulo buscado = null;
		for (Articulo elemento : listaArticulos) {
			if (elemento.getNombre().equals(nombre)) {
				buscado = elemento;
			}
		}
		return listaArticulos.indexOf(buscado);
	}

	/**
	 * Modifica el precio de un artículo.
	 * 
	 * @param nombre el nombre del artículo a modificar
	 * @param precio el nuevo precio del artículo
	 */
	public static void modificarPrecio(String nombre, double precio) {
		Articulo paraModificar = listaArticulos.get(buscarIndexArticulo(nombre));
		try {
			paraModificar.setPrecio(precio);
		} catch (IllegalArgumentException e) {
			System.out.println("Error al almacenar artículos: " + e.getMessage());
		}
	}

	/**
	 * Aumenta el stock de un artículo.
	 * 
	 * @param nombre el nombre del artículo a modificar
	 * @param stock  la cantidad a aumentar al stock del artículo
	 */
	public static void entradaArticulos(String nombre, int stock) {
		Articulo paraModificar = listaArticulos.get(buscarIndexArticulo(nombre));
		try {
			paraModificar.almacenar(stock);
		} catch (IllegalArgumentException e) {
			System.out.println("Error al almacenar artículos: " + e.getMessage());
		}
	}

	/**
	 * Disminuye el stock de un artículo.
	 * 
	 * @param nombre el nombre del artículo a modificar
	 * @param stock  la cantidad a disminuir del stock del artículo
	 */
	public static void salidaArticulos(String nombre, int stock) {
		Articulo paraModificar = listaArticulos.get(buscarIndexArticulo(nombre));
		try {
			paraModificar.vender(stock);
		} catch (IllegalArgumentException e) {
			System.out.println("Error al almacenar artículos: " + e.getMessage());
		}
	}
}
