package parte1.ej1;

public class Ej1 {

	public static void main(String[] args) {
		// Inicializamos los objetos y sus atributos
		Punto cc1 = new Punto(5, 0);

		Punto cc2 = new Punto(10, 10);

		Punto cc3 = new Punto(-3, 7);

		// Imprimimos los valores inciales
		System.out.println(cc1);
		System.out.println(cc2);
		System.out.println(cc3);
		System.out.println();

		// Modificamos los valores de los atributos
		cc1.x += 5;
		cc1.y -= 2;

		cc2.x *= 2;
		cc2.y /= 5;

		cc3.x += 3;
		cc3.y -= 1;

		// Imprimimos los nuevos atributos
		System.out.println(cc1);
		System.out.println(cc2);
		System.out.println(cc3);
	}

}
