package parte3.ej5;

import java.util.Random;

/**
 * La clase Ej5 proporciona métodos para generar y mostrar números aleatorios.
 */
public class Ej5 {

	/**
	 * Genera y muestra números aleatorios de 0 a 1.
	 * 
	 * @param a la cantidad de números aleatorios a generar
	 */
	public static void numerosAleatorios(int a) {
		Random random = new Random();
		int rand;

		for (int i = 0; i < a; i++) {
			rand = random.nextInt(2);
			System.out.println(rand + " ");
		}
	}

	/**
	 * Genera y muestra números aleatorios de 0 a b.
	 * 
	 * @param a la cantidad de números aleatorios a generar
	 * @param b el valor máximo (inclusive) de los números aleatorios
	 */
	public static void numerosAleatorios(int a, int b) {
		Random random = new Random();
		int rand;

		for (int i = 0; i < a; i++) {
			rand = random.nextInt((b + 1));
			System.out.println(rand + " ");
		}
	}

	/**
	 * Genera y muestra números aleatorios entre b y c.
	 * 
	 * @param a la cantidad de números aleatorios a generar
	 * @param b el valor mínimo (inclusive) de los números aleatorios
	 * @param c el valor máximo (inclusive) de los números aleatorios
	 */
	public static void numerosAleatorios(int a, int b, int c) {
		Random random = new Random();
		int rand;

		for (int i = 0; i < a; i++) {
			rand = random.nextInt(b, (c + 1));
			System.out.println(rand + " ");
		}
	}
}
