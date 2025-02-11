package parte2.ej4;

public class Ej4 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Pizza pizza1 = null;
		Pizza pizza2 = null;

		// Crear instancias de Pizza usando el constructor
		try {
			pizza1 = new Pizza(1, Pizza.TamañosTipo.MEDIANA, Pizza.TiposTipo.MARGARITA);
			System.out.println("Pizza1 creada exitosamente.");
		} catch (IllegalArgumentException e) {
			System.out.println("Error al crear pizza1: " + e.getMessage());
		}

		try {
			pizza2 = new Pizza(2, Pizza.TamañosTipo.FAMILIAR, Pizza.TiposTipo.CUATROQUESOS);
			System.out.println("Pizza2 creada exitosamente.");
		} catch (IllegalArgumentException e) {
			System.out.println("Error al crear pizza2: " + e.getMessage());
		}

		// Probar los métodos get
		if (pizza1 != null) {
			try {
				System.out.println("Código pizza1: " + pizza1.getCodigo());
				System.out.println("Tamaño pizza1: " + pizza1.getTamaño());
				System.out.println("Tipo pizza1: " + pizza1.getTipo());
				System.out.println("Estado pizza1: " + pizza1.getEstado());
			} catch (IllegalArgumentException e) {
				System.out.println("Error al obtener los datos de pizza1: " + e.getMessage());
			}
		}

		if (pizza2 != null) {
			try {
				System.out.println("Código pizza2: " + pizza2.getCodigo());
				System.out.println("Tamaño pizza2: " + pizza2.getTamaño());
				System.out.println("Tipo pizza2: " + pizza2.getTipo());
				System.out.println("Estado pizza2: " + pizza2.getEstado());
			} catch (IllegalArgumentException e) {
				System.out.println("Error al obtener los datos de pizza2: " + e.getMessage());
			}
		}

		// Probar los métodos set
		if (pizza1 != null) {
			try {
				pizza1.setCodigo(3);
				pizza1.setTamaño(Pizza.TamañosTipo.FAMILIAR);
				pizza1.setTipo(Pizza.TiposTipo.FUNGHI);
				pizza1.setEstado(Pizza.EstadosTipo.SERVIDA);
				System.out.println("Atributos de pizza1 modificados exitosamente.");
			} catch (IllegalArgumentException e) {
				System.out.println("Error al modificar los atributos de pizza1: " + e.getMessage());
			}
		}

		if (pizza2 != null) {
			try {
				pizza2.setCodigo(4);
				pizza2.setTamaño(Pizza.TamañosTipo.MEDIANA);
				pizza2.setTipo(Pizza.TiposTipo.MARGARITA);
				pizza2.setEstado(Pizza.EstadosTipo.SERVIDA);
				System.out.println("Atributos de pizza2 modificados exitosamente.");
			} catch (IllegalArgumentException e) {
				System.out.println("Error al modificar los atributos de pizza2: " + e.getMessage());
			}
		}

		System.out.println("\nDespués de modificar los atributos:");
		if (pizza1 != null) {
			try {
				System.out.println(pizza1.toString());
			} catch (IllegalArgumentException e) {
				System.out.println("Error al mostrar pizza1 modificada: " + e.getMessage());
			}
		}

		if (pizza2 != null) {
			try {
				System.out.println(pizza2.toString());
			} catch (IllegalArgumentException e) {
				System.out.println("Error al mostrar pizza2 modificada: " + e.getMessage());
			}
		}

		// Probar el método equals
		if (pizza2 != null) {
			try {
				Pizza pizza3 = new Pizza(4, Pizza.TamañosTipo.MEDIANA, Pizza.TiposTipo.MARGARITA);
				pizza3.setEstado(Pizza.EstadosTipo.SERVIDA);
				System.out.println("\n¿Pizza2 es igual a Pizza3? " + (pizza2.equals(pizza3) ? "Sí" : "No"));
			} catch (IllegalArgumentException e) {
				System.out.println("Error al comparar pizzas: " + e.getMessage());
			}
		}

		// Crear instancias con datos inválidos para probar control de errores
		try {
			Pizza pizzaInvalida1 = new Pizza(-1, Pizza.TamañosTipo.MEDIANA, Pizza.TiposTipo.MARGARITA);
		} catch (IllegalArgumentException e) {
			System.out.println("Error al crear pizza con código negativo: " + e.getMessage());
		}
	}
}
