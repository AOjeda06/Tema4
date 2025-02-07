package parte1.ej3;

/**
 * Clase que representa un rectángulo en un sistema de coordenadas.
 */
public class Rectangulo {

	private int x1 = 0;
	private int x2 = 0;
	private int y1 = 0;
	private int y2 = 0;

	/**
	 * Constructor que inicializa un rectángulo con las coordenadas dadas.
	 * 
	 * @param x1 Coordenada x del primer vértice
	 * @param y1 Coordenada y del primer vértice
	 * @param x2 Coordenada x del segundo vértice
	 * @param y2 Coordenada y del segundo vértice
	 */
	public Rectangulo(int x1, int y1, int x2, int y2) {
		setX1(x1);
		setY1(y1);
		setX2(x2);
		setY2(y2);
	}

	/**
	 * Obtiene la coordenada x del primer vértice.
	 * 
	 * @return Coordenada x del primer vértice
	 */
	public int getX1() {
		return x1;
	}

	/**
	 * Obtiene la coordenada x del segundo vértice.
	 * 
	 * @return Coordenada x del segundo vértice
	 */
	public int getX2() {
		return x2;
	}

	/**
	 * Obtiene la coordenada y del primer vértice.
	 * 
	 * @return Coordenada y del primer vértice
	 */
	public int getY1() {
		return y1;
	}

	/**
	 * Obtiene la coordenada y del segundo vértice.
	 * 
	 * @return Coordenada y del segundo vértice
	 */
	public int getY2() {
		return y2;
	}

	/**
	 * Establece la coordenada x del primer vértice.
	 * 
	 * @param x1 Coordenada x del primer vértice. Debe ser no negativa.
	 */
	public void setX1(int x1) {
		if (x1 >= 0) {
			this.x1 = x1;
		} else {
			throw new IllegalArgumentException("x1 no puede ser negativo.");
		}
	}

	/**
	 * Establece la coordenada x del segundo vértice.
	 * 
	 * @param x2 Coordenada x del segundo vértice. Debe ser no negativa.
	 */
	public void setX2(int x2) {
		if (x2 >= 0) {
			this.x2 = x2;
		} else {
			throw new IllegalArgumentException("x2 no puede ser negativo.");
		}
	}

	/**
	 * Establece la coordenada y del primer vértice.
	 * 
	 * @param y1 Coordenada y del primer vértice. Debe ser no negativa.
	 */
	public void setY1(int y1) {
		if (y1 >= 0) {
			this.y1 = y1;
		} else {
			throw new IllegalArgumentException("y1 no puede ser negativo.");
		}
	}

	/**
	 * Establece la coordenada y del segundo vértice.
	 * 
	 * @param y2 Coordenada y del segundo vértice. Debe ser no negativa.
	 */
	public void setY2(int y2) {
		if (y2 >= 0) {
			this.y2 = y2;
		} else {
			throw new IllegalArgumentException("y2 no puede ser negativo.");
		}
	}

	/**
	 * Establece las coordenadas x e y del primer vértice.
	 * 
	 * @param x1 Coordenada x del primer vértice
	 * @param y1 Coordenada y del primer vértice
	 */
	public void setX1Y1(int x1, int y1) {
		setX1(x1);
		setY1(y1);
	}

	/**
	 * Establece las coordenadas x e y del segundo vértice.
	 * 
	 * @param x2 Coordenada x del segundo vértice
	 * @param y2 Coordenada y del segundo vértice
	 */
	public void setX2Y2(int x2, int y2) {
		setX2(x2);
		setY2(y2);
	}

	/**
	 * Establece todas las coordenadas del rectángulo.
	 * 
	 * @param x1 Coordenada x del primer vértice
	 * @param y1 Coordenada y del primer vértice
	 * @param x2 Coordenada x del segundo vértice
	 * @param y2 Coordenada y del segundo vértice
	 */
	public void setAll(int x1, int y1, int x2, int y2) {
		setX1(x1);
		setY1(y1);
		setX2(x2);
		setY2(y2);
	}

	/**
	 * Calcula el perímetro del rectángulo.
	 * 
	 * @return Perímetro del rectángulo
	 */
	public int getPerimetro() {
		return 2 * (getAlto() + getAncho());
	}

	/**
	 * Calcula el área del rectángulo.
	 * 
	 * @return Área del rectángulo
	 */
	public int getArea() {
		return getAlto() * getAncho();
	}

	/**
	 * Calcula el ancho del rectángulo.
	 * 
	 * @return Ancho del rectángulo
	 */
	public int getAncho() {
		return Math.abs(x2 - x1);
	}

	/**
	 * Calcula el alto del rectángulo.
	 * 
	 * @return Alto del rectángulo
	 */
	public int getAlto() {
		return Math.abs(y2 - y1);
	}

	@Override
	public String toString() {
		return "Rectángulo: (" + x1 + "," + y1 + "), (" + x2 + "," + y2 + ")" + " - Ancho: " + getAncho() + ", Alto: "
				+ getAlto() + " - Perímetro: " + getPerimetro() + ", Área: " + getArea();
	}
}
