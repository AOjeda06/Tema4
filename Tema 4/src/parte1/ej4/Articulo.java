package parte1.ej4;

public class Articulo {
	// Atributos
	private String nombre;
	private double precio;
	private final double IVA;
	private int cuantosQuedan;

	// Override
	@Override
	public String toString() {
		return nombre + " - Precio: " + precio + "€ - IVA: " + IVA + "% - PVP: " + (precio + (precio * (IVA / 100)))
				+ "€ - Quedan: " + cuantosQuedan;
	}

	// Constructor
	public Articulo(String nombre, double precio, double IVA, int cuantosQuedan) {
		setNombre(nombre);
		setPrecio(precio);
		this.IVA = IVA >= 0 ? IVA : 21; // Por defecto, IVA del 21% si el valor dado es negativo
		setCuantosQuedan(cuantosQuedan);
	}

	// Getters
	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public double getIVA() {
		return IVA;
	}

	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	// Setters
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		} else {
			throw new IllegalArgumentException("Nombre no puede estar vacío.");
		}
	}

	public void setPrecio(double precio) {
		if (precio >= 0) {
			this.precio = precio;
		} else {
			throw new IllegalArgumentException("Precio no puede ser negativo.");
		}
	}

	public void setCuantosQuedan(int cuantosQuedan) {
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		} else {
			throw new IllegalArgumentException("La cantidad no puede ser negativa.");
		}
	}
}
