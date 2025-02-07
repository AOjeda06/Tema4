package parte1.ej1;

public class Punto {
	// Atributos
	private int x;
	private int y;

	// Constructor
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Métodos get y set
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// Método setXY
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Método desplaza
	public void desplaza(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}

	// Método distancia
	public double distancia(Punto p) {
		return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
	}

	// Override del método toString
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
