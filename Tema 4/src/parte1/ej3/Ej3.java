package parte1.ej3;

public class Ej3 {

	public static void main(String[] args) {
		// Creamos los objetos
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();

		// Modificamos los atributos
		r1.x1 = 0;
		r1.y1 = 0;
		r1.x2 = 5;
		r1.y2 = 5;

		r2.x1 = 7;
		r2.y1 = 9;
		r2.x2 = 2;
		r2.y2 = 3;

		// Imprimmos los datos
		imprimirRectangulo(r1);
		imprimirRectangulo(r2);

		// Modificamos los atributos
		r1.x1 = 2;
		r1.y1 = 2;
		r1.x2 = 4;
		r1.y2 = 4;

		r2.x1 = 5;
		r2.y1 = 7;
		r2.x2 = 4;
		r2.y2 = 5;

		// Imprimmos los datos
		imprimirRectangulo(r1);
		imprimirRectangulo(r2);
	}

	// Funcion para imprimir los datos
	public static void imprimirRectangulo(Rectangulo r) {
		System.out.println(r);
		System.out.println("Perimetro: " + r.getPerimetro());
		System.out.println("Area: " + r.getArea());
	}
}
