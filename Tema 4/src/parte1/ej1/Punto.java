package parte1.ej1;

/**
 * Clase que representa un punto en un sistema de coordenadas.
 */
public class Punto {

	private int x;
	private int y;

	/**
	 * Constructor que inicializa un punto con las coordenadas dadas.
	 * 
	 * @param x Coordenada x del punto.
	 * @param y Coordenada y del punto.
	 */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Obtiene la coordenada x del punto.
	 * 
	 * @return La coordenada x del punto.
	 */
	public int getX() {
		return x;
	}

	/**
	 * Establece la coordenada x del punto.
	 * 
	 * @param x La coordenada x del punto.
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Obtiene la coordenada y del punto.
	 * 
	 * @return La coordenada y del punto.
	 */
	public int getY() {
		return y;
	}

	/**
	 * Establece la coordenada y del punto.
	 * 
	 * @param y La coordenada y del punto.
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Establece las coordenadas x e y del punto.
	 * 
	 * @param x La coordenada x del punto.
	 * @param y La coordenada y del punto.
	 */
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Desplaza el punto en las coordenadas x e y.
	 * 
	 * @param dx Cantidad a desplazar en la coordenada x.
	 * @param dy Cantidad a desplazar en la coordenada y.
	 */
	public void desplaza(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}

	/**
	 * Calcula la distancia entre este punto y otro punto dado.
	 * 
	 * @param p Otro punto con el que calcular la distancia.
	 * @return La distancia entre este punto y el punto dado.
	 */
	public double distancia(Punto p) {
		return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
