package parte2.ej4;

public class Ej4 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Pizza pizza1 = null;
		Pizza pizza2 = null;

		// Crear instancias de Pizza usando el constructor
		try {
			pizza1 = new Pizza(1, "MEDIANA", "MARGARITA");
			System.out.println("Pizza1 creada exitosamente.");
		} catch (IllegalArgumentException e) {
			System.out.println("Error al crear pizza1: " + e.getMessage());
		}

		try {
			pizza2 = new Pizza(2, "FAMILIAR", "CUATROQUESOS");
			System.out.println("Pizza2 creada exitosamente.");
		} catch (IllegalArgumentException e) {
			System.out.println("Error al crear pizza2: " + e.getMessage());
		}

		// Probar los métodos get
		if (pizza1 != null) {
			System.out.println("Código pizza1: " + pizza1.getCodigo());
			System.out.println("Tamaño pizza1: " + pizza1.getTamaño());
			System.out.println("Tipo pizza1: " + pizza1.getTipo());
			System.out.println("Estado pizza1: " + pizza1.getEstado());
		}

		if (pizza2 != null) {
			System.out.println("Código pizza2: " + pizza2.getCodigo());
			System.out.println("Tamaño pizza2: " + pizza2.getTamaño());
			System.out.println("Tipo pizza2: " + pizza2.getTipo());
			System.out.println("Estado pizza2: " + pizza2.getEstado());
		}

		// Probar los métodos set
		if (pizza1 != null) {
			pizza1.setEstado("SERVIDA");
			System.out.println("Atributos de pizza1 modificados exitosamente.");
		}

		if (pizza2 != null) {
			pizza2.setEstado("SERVIDA");
			System.out.println("Atributos de pizza2 modificados exitosamente.");
		}

		System.out.println("\nDespués de modificar los atributos:");
		if (pizza1 != null) {
			System.out.println(pizza1.toString());
		}

		if (pizza2 != null) {
			System.out.println(pizza2.toString());
		}

		// Probar el método equals
		if (pizza2 != null) {
			Pizza pizza3 = new Pizza(4, "MEDIANA", "MARGARITA");
			pizza3.setEstado("SERVIDA");
			System.out.println("\n¿Pizza2 es igual a Pizza3? " + (pizza2.equals(pizza3) ? "Sí" : "No"));
		}

		// Crear instancias con datos inválidos para probar control de errores
		try {
			Pizza pizzaInvalida1 = new Pizza(-1, "MEDIANA", "MARGARITA");
		} catch (IllegalArgumentException e) {
			System.out.println("Error al crear pizza con código negativo: " + e.getMessage());
		}
	}
}
