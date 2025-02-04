package parte1.ej3;

public class Rectangulo {
	int x1 = 0;
	int x2 = 0;
	int y1 = 0;
	int y2 = 0;

	// Override
	public String toString() {
		return "Rectángulo: (" + x1 + "," + y1 + "), (" + x2 + "," + y2 + ")";
	}

	// Ancho valor absoluto
	public int getAncho() {
		return Math.abs(x2 - x1);
	}

	// Alto valor absoluto
	public int getAlto() {
		return Math.abs(y2 - y1);
	}

	// Perimetro
	public int getPerimetro() {
		return 2 * (getAlto() + getAncho());
	}

	// Area
	public int getArea() {
		return (getAlto() * getAncho());
	}

	// Constructor
	Rectangulo(int x1, int y1, int x2, int y2) {
		if (x1 >= 0)
			this.x1 = x1;

		if (y1 >= 0)
			this.y1 = y1;

		if (x2 >= 0)
			this.x2 = x2;

		if (y2 >= 0)
			this.y2 = y2;
	}
}
