package parte4.ej4;

import java.math.BigInteger;

public class Fraccion {
	private int numerador;
	private int denominador;

	/**
	 * Constructor para crear una fracción con numerador y denominador dados.
	 *
	 * @param n el numerador
	 * @param d el denominador
	 * @throws IllegalArgumentException si el numerador o denominador son 0
	 */
	Fraccion(int n, int d) {
		if (n == 0) {
			throw new IllegalArgumentException("El numerador no debe ser 0");
		}
		if (d == 0) {
			throw new IllegalArgumentException("El denominador no debe ser 0");
		}

		this.denominador = d;
		this.numerador = n;
	}

	/**
	 * Obtiene el numerador de la fracción.
	 *
	 * @return el numerador
	 */
	public int getNumerador() {
		return numerador;
	}

	/**
	 * Obtiene el denominador de la fracción.
	 *
	 * @return el denominador
	 */
	public int getDenominador() {
		return denominador;
	}

	/**
	 * Suma la fracción actual con otra fracción y devuelve el resultado
	 * simplificado.
	 *
	 * @param f2 la fracción a sumar
	 * @return una nueva fracción que es la suma de la fracción actual y f2
	 */
	public Fraccion suma(Fraccion f2) {
		int mcm = mcm(this.denominador, f2.denominador);
		int nuevoNumerador = (this.numerador * (mcm / this.denominador)) + (f2.numerador * (mcm / f2.denominador));
		return simplifica(new Fraccion(nuevoNumerador, mcm));
	}

	/**
	 * Resta la fracción actual con otra fracción y devuelve el resultado
	 * simplificado.
	 *
	 * @param f2 la fracción a restar
	 * @return una nueva fracción que es la resta de la fracción actual y f2
	 */
	public Fraccion resta(Fraccion f2) {
		int mcm = mcm(this.denominador, f2.denominador);
		int nuevoNumerador = (this.numerador * (mcm / this.denominador)) - (f2.numerador * (mcm / f2.denominador));
		return simplifica(new Fraccion(nuevoNumerador, mcm));
	}

	/**
	 * Multiplica la fracción actual con otra fracción y devuelve el resultado
	 * simplificado.
	 *
	 * @param f2 la fracción a multiplicar
	 * @return una nueva fracción que es el producto de la fracción actual y f2
	 */
	public Fraccion multiplica(Fraccion f2) {
		int numerador = this.numerador * f2.numerador;
		int denominador = this.denominador * f2.denominador;
		return simplifica(new Fraccion(numerador, denominador));
	}

	/**
	 * Divide la fracción actual con otra fracción y devuelve el resultado
	 * simplificado.
	 *
	 * @param f2 la fracción a dividir
	 * @return una nueva fracción que es el cociente de la fracción actual y f2
	 */
	public Fraccion divide(Fraccion f2) {
		int numerador = this.numerador * f2.denominador;
		int denominador = this.denominador * f2.numerador;
		return simplifica(new Fraccion(numerador, denominador));
	}

	/**
	 * Simplifica una fracción.
	 *
	 * @param f la fracción a simplificar
	 * @return la fracción simplificada
	 */
	public Fraccion simplifica(Fraccion f) {
		int mcd = mcd(f.numerador, f.denominador);
		return new Fraccion(f.numerador / mcd, f.denominador / mcd);
	}

	/**
	 * Calcula el máximo común divisor de dos números.
	 *
	 * @param a el primer número
	 * @param b el segundo número
	 * @return el máximo común divisor de a y b
	 */
	public static int mcd(int a, int b) {
		return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
	}

	/**
	 * Calcula el mínimo común múltiplo de dos números.
	 *
	 * @param a el primer número
	 * @param b el segundo número
	 * @return el mínimo común múltiplo de a y b
	 */
	public static int mcm(int a, int b) {
		return Math.abs(a * b) / mcd(a, b);
	}
}
