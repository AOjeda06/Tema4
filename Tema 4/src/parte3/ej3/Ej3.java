package parte3.ej3;

/**
 * La clase Ej3 proporciona métodos para sumar números enteros de forma
 * recursiva.
 */
public class Ej3 {

	/**
	 * Calcula la suma de todos los enteros desde 0 hasta el número especificado
	 * (inclusive).
	 * 
	 * @param a el número entero hasta el cual se quiere calcular la suma
	 * @return la suma de todos los enteros desde 0 hasta a
	 */
	public static int sumaEnteros(int a) {
		int resultado;

		if (a == 0) {
			resultado = 0;
		} else {
			resultado = a + (sumaEnteros(a - 1));
		}
		return resultado;
	}

	/**
	 * Calcula la suma de todos los enteros desde 0 hasta la diferencia entre dos
	 * números (inclusive).
	 * 
	 * @param a el primer número entero
	 * @param b el segundo número entero
	 * @return la suma de todos los enteros desde 0 hasta la diferencia entre a y b
	 */
	public static int sumaEnteros(int a, int b) {
		int resultado;
		int dif = Math.abs(a - b);

		if (dif == 0) {
			resultado = 0;
		} else {
			resultado = dif + (sumaEnteros(dif - 1));
		}
		return resultado;
	}
}
