package crud.ej1;

import java.util.ArrayList;

import parte2.ej3.Alumno;

public class CRUD {

	static private ArrayList<Alumno> ListaAlumnos = new ArrayList<>();

	/**
	 * Imprime la lista de alumnos en la consola.
	 */
	public static void imprimirLista() {
		for (Alumno elemento : ListaAlumnos) {
			System.out.println(elemento.toString());
		}
	}

	/**
	 * Añade un nuevo alumno a la lista.
	 * 
	 * @param nuevoAlumno el alumno que se va a añadir a la lista
	 */
	public static void añadirObjeto(Alumno nuevoAlumno) {
		ListaAlumnos.add(nuevoAlumno);
	}

	/**
	 * Busca un alumno en la lista por su nombre.
	 * 
	 * @param nombre el nombre del alumno que se va a buscar
	 * @return el objeto Alumno si se encuentra, de lo contrario, null
	 */
	public static Alumno buscarAlumno(String nombre) {
		Alumno buscado = null;
		for (Alumno elemento : ListaAlumnos) {
			if (elemento.getNombre().equals(nombre)) {
				buscado = elemento;
			}
		}
		return buscado;
	}

	public static boolean buscarAlumnoYModificar(String nombre, double media) {
		boolean res = false;
		Alumno buscado = null;
		for (Alumno elemento : ListaAlumnos) {
			if (elemento.getNombre().equals(nombre)) {
				buscado = elemento;
				res = true;
			}
		}

		buscado.setMedia(media);
		return res;
	}

	/**
	 * Obtiene el índice de un alumno en la lista.
	 * 
	 * @param buscado el alumno del que se quiere obtener el índice
	 * @return el índice del alumno en la lista, o -1 si no se encuentra
	 */
	public static int getIndex(Alumno buscado) {
		return ListaAlumnos.indexOf(buscado);
	}

	/**
	 * Borra un alumno de la lista por su nombre.
	 * 
	 * @param nombre el nombre del alumno que se va a borrar
	 * @return true si el alumno fue eliminado, false si no se encontró el alumno
	 */
	public static boolean borrarAlumno(String nombre) {
		Alumno buscado = buscarAlumno(nombre);
		return ListaAlumnos.remove(buscado);
	}
}
