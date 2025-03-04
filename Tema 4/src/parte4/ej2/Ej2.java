package parte4.ej2;

/**
 * Clase de prueba para la clase Contador.
 */
public class Ej2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Declaración de variables Contador
		Contador c1 = null;
		Contador c2 = null;
		Contador c3 = null;
		Contador c4 = null;

		// Prueba del primer contador
		System.out.println("Contador 1");
		try {
			// Creación de un nuevo contador con valor inicial 1
			c1 = new Contador(1);

			// Mostrar el valor inicial del contador
			System.out.println(c1.toString());

			// Incrementar el valor del contador
			c1.incrementar();

			// Mostrar el valor después de incrementar
			System.out.println(c1.toString());

			// Decrementar el valor del contador
			c1.decrementar();

			// Mostrar el valor después de decrementar
			System.out.println(c1.toString());

		} catch (IllegalArgumentException e) {
			// Manejo de la excepción en caso de valor inicial inválido
			System.out.println("Error: " + e.getMessage());
		}

		System.out.println();
		// Prueba del segundo contador
		System.out.println("Contador 2");
		try {
			// Creación de un nuevo contador con valor inicial 0
			c2 = new Contador(0);

			// Mostrar el valor inicial del contador
			System.out.println(c2.toString());

			// Incrementar el valor del contador
			c2.incrementar();

			// Mostrar el valor después de incrementar
			System.out.println(c2.toString());

			// Decrementar el valor del contador
			c2.decrementar();

			// Mostrar el valor después de decrementar
			System.out.println(c2.toString());

		} catch (IllegalArgumentException e) {
			// Manejo de la excepción en caso de valor inicial inválido
			System.out.println("Error: " + e.getMessage());
		}

		System.out.println();
		// Prueba del tercer contador
		System.out.println("Contador 3");
		try {
			// Creación de un nuevo contador con valor inicial -1 (debería lanzar excepción)
			c3 = new Contador(-1);

		} catch (IllegalArgumentException e) {
			// Manejo de la excepción en caso de valor inicial inválido
			System.out.println("Error: " + e.getMessage());
		}

		System.out.println();
		// Prueba del cuarto contador
		System.out.println("Contador 4");
		try {
			// Creación de un nuevo contador con valor inicial 0
			c4 = new Contador(0);

			// Mostrar el valor inicial del contador
			System.out.println(c4.toString());

			// Decrementar el valor del contador
			c4.decrementar();

			// Mostrar el valor después de decrementar
			System.out.println(c4.toString());

		} catch (IllegalArgumentException e) {
			// Manejo de la excepción en caso de valor inicial inválido
			System.out.println("Error: " + e.getMessage());
		}

		System.out.println();
		// Prueba del método equals
		System.out.println("Prueba equals: ");

		// Comparación de contadores para igualdad
		System.out.println("Contador 1 y contador 2: " + c1.equals(c2));

	}
}
