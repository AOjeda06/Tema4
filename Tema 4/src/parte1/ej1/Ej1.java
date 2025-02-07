package parte1.ej1;

public class Ej1 {

	public static void main(String[] args) {
		// Inicializamos los objetos y sus atributos
		Punto cc1 = new Punto(5, 0);
		Punto cc2 = new Punto(10, 10);
		Punto cc3 = new Punto(-3, 7);

		// Imprimimos los valores iniciales
		System.out.println("Valores iniciales:");
		System.out.println(cc1);
		System.out.println(cc2);
		System.out.println(cc3);
		System.out.println();

		// Modificamos los valores de los atributos utilizando los setters
		cc1.setX(cc1.getX() + 5);
		cc1.setY(cc1.getY() - 2);
		cc2.setX(cc2.getX() * 2);
		cc2.setY(cc2.getY() / 5);
		cc3.setX(cc3.getX() + 3);
		cc3.setY(cc3.getY() - 1);

		// Imprimimos los nuevos atributos
		System.out.println("Después de modificar con setters:");
		System.out.println(cc1);
		System.out.println(cc2);
		System.out.println(cc3);
		System.out.println();

		// Utilizamos el método setXY
		cc1.setXY(1, 1);
		cc2.setXY(2, 2);
		cc3.setXY(3, 3);

		// Imprimimos los nuevos atributos
		System.out.println("Después de modificar con setXY:");
		System.out.println(cc1);
		System.out.println(cc2);
		System.out.println(cc3);
		System.out.println();

		// Desplazamos los puntos
		cc1.desplaza(2, 5);
		cc2.desplaza(-1, -1);
		cc3.desplaza(0, 0); // No cambiará los valores

		// Imprimimos los nuevos atributos
		System.out.println("Después de desplazar:");
		System.out.println(cc1);
		System.out.println(cc2);
		System.out.println(cc3);
		System.out.println();

		// Calculamos y mostramos las distancias
		System.out.println("Distancias:");
		System.out.println("Distancia entre cc1 y cc2: " + cc1.distancia(cc2));
		System.out.println("Distancia entre cc1 y cc3: " + cc1.distancia(cc3));
		System.out.println("Distancia entre cc2 y cc3: " + cc2.distancia(cc3));
	}
}
