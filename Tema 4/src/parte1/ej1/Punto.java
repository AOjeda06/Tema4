package parte1.ej1;

public class Punto {
	// Atributos
	int x;
	int y;

	// Override
	public String toString() {
		return "Punto(" + "x=" + x + ", y=" + y + ')';
	}

	// Constructor
	Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
