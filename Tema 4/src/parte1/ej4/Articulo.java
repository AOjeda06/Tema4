package parte1.ej4;

public class Articulo {
	// Atributos
	String nombre;
	double precio;
	final double IVA = 21;
	int cuantosQuedan;

	// Override
	public String toString() {
		return nombre + " - Precio: " + precio + "€ - IVA: " + IVA + "% - PVP: " + (precio + (precio * (IVA / 100)))
				+ "€ - Quedan: " + cuantosQuedan;
	}
}
