package parte1.ej4;

public class Articulo {
	// Atributos
	String nombre;
	double precio;
	final double IVA;
	int cuantosQuedan;

	// Override
	public String toString() {
		return nombre + " - Precio: " + precio + "€ - IVA: " + IVA + "% - PVP: " + (precio + (precio * (IVA / 100)))
				+ "€ - Quedan: " + cuantosQuedan;
	}

	// Constructor
	Articulo(String nombre, double precio, double IVA, int cuantosQuedan) {
		this.nombre = nombre;
		this.precio = precio;
		this.IVA = IVA;
		this.cuantosQuedan = cuantosQuedan;
	}
}
