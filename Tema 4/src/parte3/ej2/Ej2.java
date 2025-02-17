package parte3.ej2;

/**
 * La clase Ej2 proporciona métodos para calcular la media de números enteros.
 */
public class Ej2 {

	/**
	 * Calcula la media de dos números enteros.
	 * 
	 * @param a el primer número entero
	 * @param b el segundo número entero
	 * @return la media de los dos números como un valor de tipo double
	 */
	public static double media(int a, int b) {
		return ((double) (a + b) / 2);
	}

	/**
	 * Calcula la media de tres números enteros.
	 * 
	 * @param a el primer número entero
	 * @param b el segundo número entero
	 * @param c el tercer número entero
	 * @return la media de los tres números como un valor de tipo double
	 */
	public static double media(int a, int b, int c) {
		return ((double) (a + b + c) / 3);
	}
}
