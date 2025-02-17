package parte3.ej6;

/**
 * La clase FuncionesMatematicas proporciona métodos para realizar operaciones
 * matemáticas recursivas.
 */
public class FuncionesMatematicas {

	/**
	 * Calcula el sumatorio de un número entero.
	 * 
	 * @param numero el número entero para el cual se quiere calcular el sumatorio
	 * @return el sumatorio del número especificado
	 */
	public static int sumatorio(int numero) {
		int resultado;

		if (numero == 0) {
			resultado = 0;
		} else {
			resultado = numero + (sumatorio(numero - 1));
		}
		return resultado;
	}

	/**
	 * Calcula la potencia de un número.
	 * 
	 * @param a la base
	 * @param n el exponente
	 * @return el resultado de elevar la base a la potencia del exponente
	 */
	public static double potencia(double a, int n) {
		double resultado;

		if (n == 0) {
			resultado = 1;
		} else {
			resultado = a * (potencia(a, n - 1));
		}

		return resultado;
	}

	/**
	 * Calcula el valor de la serie de Fibonacci para un número dado.
	 * 
	 * @param numero el número para el cual se quiere calcular el valor de la serie
	 *               de Fibonacci
	 * @return el valor de la serie de Fibonacci para el número especificado
	 */
	public static int serieFibonacci(int numero) {
		int resultado;

		if (numero == 0 || numero == 1) {
			resultado = 1;
		} else {
			resultado = serieFibonacci(numero - 1) + serieFibonacci(numero - 2);
		}

		return resultado;
	}
}
