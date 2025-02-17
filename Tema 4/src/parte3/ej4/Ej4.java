package parte3.ej4;

/**
 * La clase Ej4 proporciona métodos para convertir diferentes tipos de datos a
 * booleanos.
 */
public class Ej4 {

	/**
	 * Convierte un valor entero a su representación booleana.
	 * 
	 * @param a el número entero (debe ser 0 o 1)
	 * @return true si a es 1, false si a es 0
	 */
	public static boolean parseToBoolean(int a) {
		boolean bool = false;
		switch (a) {
		case 1 -> {
			bool = true;
		}
		case 0 -> {
			bool = false;
		}
		}
		return bool;
	}

	/**
	 * Convierte una cadena de texto a su representación booleana.
	 * 
	 * @param a la cadena de texto (debe ser "true" o "false")
	 * @return true si a es "true", false si a es "false"
	 */
	public static boolean parseToBoolean(String a) {
		boolean bool = false;
		switch (a) {
		case "true" -> {
			bool = true;
		}
		case "false" -> {
			bool = false;
		}
		}
		return bool;
	}
}
