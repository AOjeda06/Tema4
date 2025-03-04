package parte4.ej2;

/**
 * La clase Contador representa un contador simple que puede ser incrementado y
 * decrementado.
 */
public class Contador {
	/**
	 * El valor actual del contador.
	 */
	private int cont;

	/**
	 * Construye un nuevo contador con un valor inicial.
	 * 
	 * @param cont Valor inicial del contador.
	 * @throws IllegalArgumentException si el valor inicial es negativo.
	 */
	Contador(int cont) {
		if (cont < 0) {
			throw new IllegalArgumentException("El contador no puede ser negativo");
		}
		this.cont = cont;
	}

	/**
	 * Devuelve el valor actual del contador.
	 * 
	 * @return El valor actual del contador.
	 */
	public int getCont() {
		return cont;
	}

	/**
	 * Incrementa el valor del contador en 1.
	 */
	public void incrementar() {
		cont++;
	}

	/**
	 * Decrementa el valor del contador en 1. Si el valor del contador es menor que
	 * 0 después del decremento, se ajusta a 0.
	 */
	public void decrementar() {
		cont--;
		if (cont < 0) {
			cont = 0;
		}
	}

	/**
	 * Devuelve una representación en forma de cadena del contador.
	 * 
	 * @return Una cadena que representa el valor del contador.
	 */
	public String toString() {
		return "Contador: " + cont;
	}

	/**
	 * Compara este contador con el objeto especificado para igualdad.
	 * 
	 * @param obj El objeto a comparar con este contador.
	 * @return true si los contadores tienen el mismo valor; false en caso
	 *         contrario.
	 */
	public boolean equals(Object obj) {
		boolean eq = false;

		Contador c = (Contador) obj;

		eq = this.cont == c.cont;

		return eq;
	}
}
