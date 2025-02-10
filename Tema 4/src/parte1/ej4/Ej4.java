package parte1.ej4;

public class Ej4 {

	public static void main(String[] args) {
		// Creamos los objetos
		Articulo articulo1 = null;
		Articulo articulo2 = null;
		try {
			articulo1 = new Articulo("sal", 2, 21, 6);
		} catch (IllegalArgumentException e) {
			System.out.println("Error al crear articulo1: " + e.getMessage());
		}
		try {
			articulo2 = new Articulo("azúcar", 1.5, 10, 10);
		} catch (IllegalArgumentException e) {
			System.out.println("Error al crear articulo2: " + e.getMessage());
		}

		// Imprimimos los datos iniciales
		System.out.println(articulo1);
		System.out.println(articulo2);

		// Probamos los métodos getPVP y getPVPDescuento
		try {
			System.out.println("\nPVP de " + articulo1.getNombre() + ": " + articulo1.getPVP() + "€");
			System.out.println("PVP de " + articulo2.getNombre() + " con 10% de descuento: "
					+ articulo2.getPVPDescuento(10) + "€");
		} catch (IllegalArgumentException e) {
			System.out.println("Error al obtener PVP o PVPDescuento: " + e.getMessage());
		}

		// Probamos el método vender
		try {
			boolean venta1 = articulo1.vender(2);
			boolean venta2 = articulo2.vender(12); // Esto debería fallar porque no hay suficiente stock

			System.out.println(
					"\nVenta de 2 unidades de " + articulo1.getNombre() + ": " + (venta1 ? "éxito" : "fracaso"));
			System.out.println(
					"Venta de 12 unidades de " + articulo2.getNombre() + ": " + (venta2 ? "éxito" : "fracaso"));
		} catch (IllegalArgumentException e) {
			System.out.println("Error al vender artículos: " + e.getMessage());
		}

		// Probamos el método almacenar
		try {
			articulo1.almacenar(3);
			articulo2.almacenar(5);
		} catch (IllegalArgumentException e) {
			System.out.println("Error al almacenar artículos: " + e.getMessage());
		}

		// Imprimimos los datos después de las operaciones
		System.out.println("\nDespués de las operaciones:");
		System.out.println(articulo1);
		System.out.println(articulo2);

		// Intentamos asignar valores erróneos
		System.out.println("\nProbando con valores erróneos:");
		try {
			articulo1.setPrecio(-1); // Esto debería lanzar una excepción
		} catch (IllegalArgumentException e) {
			System.out.println("Error al asignar valor erróneo a articulo1: " + e.getMessage());
		}
		try {
			articulo2.setCuantosQuedan(-3); // Esto debería lanzar una excepción
		} catch (IllegalArgumentException e) {
			System.out.println("Error al asignar valor erróneo a articulo2: " + e.getMessage());
		}
	}
}