package parte4.ej4;

public class Ej4 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			// Prueba de creación de fracciones válidas
			Fraccion fraccion1 = new Fraccion(2, 3);
			Fraccion fraccion2 = new Fraccion(4, 5);
			Fraccion fraccion3 = new Fraccion(3, 9);

			// Prueba de métodos de acceso
			System.out.println("Fracción 1: " + fraccion1.getNumerador() + "/" + fraccion1.getDenominador());
			System.out.println("Fracción 2: " + fraccion2.getNumerador() + "/" + fraccion2.getDenominador());
			System.out.println("Fracción 3: " + fraccion3.getNumerador() + "/" + fraccion3.getDenominador());

			// Prueba de método suma
			Fraccion suma = fraccion1.suma(fraccion2);
			System.out.println("Suma de fracción 1 y fracción 2: " + suma.getNumerador() + "/" + suma.getDenominador());

			// Prueba de método resta
			Fraccion resta = fraccion1.resta(fraccion2);
			System.out.println(
					"Resta de fracción 1 y fracción 2: " + resta.getNumerador() + "/" + resta.getDenominador());

			// Prueba de método multiplica
			Fraccion producto = fraccion1.multiplica(fraccion2);
			System.out.println("Producto de fracción 1 y fracción 2: " + producto.getNumerador() + "/"
					+ producto.getDenominador());

			// Prueba de método divide
			Fraccion cociente = fraccion1.divide(fraccion2);
			System.out.println("Cociente de fracción 1 y fracción 2: " + cociente.getNumerador() + "/"
					+ cociente.getDenominador());

			// Prueba de método simplifica
			Fraccion simplificada = fraccion3.simplifica(fraccion3);
			System.out.println(
					"Fracción 3 simplificada: " + simplificada.getNumerador() + "/" + simplificada.getDenominador());

			// Prueba de excepciones
			try {
				Fraccion fraccionInvalida1 = new Fraccion(0, 5); // Numerador no debe ser 0
			} catch (IllegalArgumentException e) {
				System.out.println("Excepción capturada: " + e.getMessage());
			}

			try {
				Fraccion fraccionInvalida2 = new Fraccion(5, 0); // Denominador no debe ser 0
			} catch (IllegalArgumentException e) {
				System.out.println("Excepción capturada: " + e.getMessage());
			}

		} catch (Exception e) {
			System.out.println("Se produjo un error: " + e.getMessage());
		}
	}
}
