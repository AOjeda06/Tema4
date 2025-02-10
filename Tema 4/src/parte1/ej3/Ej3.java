package parte1.ej3;

public class Ej3 {

	public static void main(String[] args) {
		// Creamos los objetos
		Rectangulo r1 = null;
		Rectangulo r2 = null;
		try {
			r1 = new Rectangulo(0, 0, 5, 5);
		} catch (IllegalArgumentException e) {
			System.out.println("Error al crear r1: " + e.getMessage());
		}
		try {
			r2 = new Rectangulo(7, 9, 2, 3);
		} catch (IllegalArgumentException e) {
			System.out.println("Error al crear r2: " + e.getMessage());
		}

		// Imprimimos los datos
		if (r1 != null)
			System.out.println(r1);
		if (r2 != null)
			System.out.println(r2);

		// Modificamos los atributos utilizando los nuevos métodos set
		try {
			if (r1 != null) {
				r1.setX1Y1(2, 2);
				r1.setX2Y2(4, 4);
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Error al modificar r1: " + e.getMessage());
		}
		try {
			if (r2 != null)
				r2.setAll(1, 1, 6, 6);
		} catch (IllegalArgumentException e) {
			System.out.println("Error al modificar r2: " + e.getMessage());
		}

		// Imprimimos los datos después de modificarlos
		System.out.println("\nDespués de las modificaciones:");
		if (r1 != null)
			System.out.println(r1);
		if (r2 != null)
			System.out.println(r2);

		// Intentamos asignar valores erróneos
		System.out.println("\nProbando con valores erróneos:");
		try {
			if (r1 != null)
				r1.setX1(-1); // Esto debería lanzar una excepción
		} catch (IllegalArgumentException e) {
			System.out.println("Error al asignar valor erróneo a r1: " + e.getMessage());
		}
		try {
			if (r2 != null)
				r2.setY2(-2); // Esto debería lanzar una excepción
		} catch (IllegalArgumentException e) {
			System.out.println("Error al asignar valor erróneo a r2: " + e.getMessage());
		}
	}
}
