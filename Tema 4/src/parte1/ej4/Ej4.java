package parte1.ej4;

public class Ej4 {

	public static void main(String[] args) {
		try {
			// Creamos los objetos
			Articulo articulo1 = new Articulo("sal", 2, 21, 6);
			Articulo articulo2 = new Articulo("azúcar", 1.5, 10, 10);

			// Imprimimos los datos iniciales
			System.out.println(articulo1);
			System.out.println(articulo2);

			// Probamos los métodos getPVP y getPVPDescuento
			System.out.println("\nPVP de " + articulo1.getNombre() + ": " + articulo1.getPVP() + "€");
			System.out.println("PVP de " + articulo2.getNombre() + " con 10% de descuento: "
					+ articulo2.getPVPDescuento(10) + "€");

			// Probamos el método vender
			boolean venta1 = articulo1.vender(2);
			boolean venta2 = articulo2.vender(12); // Esto debería fallar porque no hay suficiente stock

			System.out.println(
					"\nVenta de 2 unidades de " + articulo1.getNombre() + ": " + (venta1 ? "éxito" : "fracaso"));
			System.out.println(
					"Venta de 12 unidades de " + articulo2.getNombre() + ": " + (venta2 ? "éxito" : "fracaso"));

			// Probamos el método almacenar
			articulo1.almacenar(3);
			articulo2.almacenar(5);

			// Imprimimos los datos después de las operaciones
			System.out.println("\nDespués de las operaciones:");
			System.out.println(articulo1);
			System.out.println(articulo2);

			// Intentamos asignar valores erróneos
			System.out.println("\nProbando con valores erróneos:");
			articulo1.setPrecio(-1); // Esto debería lanzar una excepción
			articulo2.setCuantosQuedan(-3); // Esto debería lanzar una excepción
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
