package parte1.ej3;

public class Ej3 {

	public static void main(String[] args) {
		try {
			// Creamos los objetos
			Rectangulo r1 = new Rectangulo(0, 0, 5, 5);
			Rectangulo r2 = new Rectangulo(7, 9, 2, 3);

			// Imprimimos los datos
			System.out.println(r1);
			System.out.println(r2);

			// Modificamos los atributos utilizando los nuevos métodos set
			r1.setX1Y1(2, 2);
			r1.setX2Y2(4, 4);
			r2.setAll(1, 1, 6, 6);

			// Imprimimos los datos después de modificarlos
			System.out.println("\nDespués de las modificaciones:");
			System.out.println(r1);
			System.out.println(r2);

			// Intentamos asignar valores erróneos
			System.out.println("\nProbando con valores erróneos:");
			r1.setX1(-1); // Esto debería lanzar una excepción
			r2.setY2(-2); // Esto debería lanzar una excepción
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
