package parte1.ej4;

/**
 * Clase que representa un artículo con su nombre, precio, IVA y cantidad en
 * stock.
 */
public class Articulo {
	private String nombre;
	private double precio;
	private final double IVA;
	private int cuantosQuedan;

	/**
	 * Constructor que inicializa un artículo con el nombre, precio, IVA y cantidad
	 * en stock.
	 * 
	 * @param nombre        Nombre del artículo.
	 * @param precio        Precio del artículo.
	 * @param IVA           Porcentaje de IVA del artículo.
	 * @param cuantosQuedan Cantidad en stock del artículo.
	 */
	public Articulo(String nombre, double precio, double IVA, int cuantosQuedan) {
		setNombre(nombre);
		setPrecio(precio);
		this.IVA = IVA >= 0 ? IVA : 21; // Por defecto, IVA del 21% si el valor dado es negativo
		setCuantosQuedan(cuantosQuedan);
	}

	/**
	 * Obtiene el nombre del artículo.
	 * 
	 * @return El nombre del artículo.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Obtiene el precio del artículo.
	 * 
	 * @return El precio del artículo.
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Obtiene el porcentaje de IVA del artículo.
	 * 
	 * @return El porcentaje de IVA del artículo.
	 */
	public double getIVA() {
		return IVA;
	}

	/**
	 * Obtiene la cantidad en stock del artículo.
	 * 
	 * @return La cantidad en stock del artículo.
	 */
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	/**
	 * Establece el nombre del artículo.
	 * 
	 * @param nombre El nombre del artículo. No puede estar vacío.
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		} else {
			throw new IllegalArgumentException("Nombre no puede estar vacío.");
		}
	}

	/**
	 * Establece el precio del artículo.
	 * 
	 * @param precio El precio del artículo. No puede ser negativo.
	 */
	public void setPrecio(double precio) {
		if (precio >= 0) {
			this.precio = precio;
		} else {
			throw new IllegalArgumentException("Precio no puede ser negativo.");
		}
	}

	/**
	 * Establece la cantidad en stock del artículo.
	 * 
	 * @param cuantosQuedan La cantidad en stock del artículo. No puede ser
	 *                      negativa.
	 */
	public void setCuantosQuedan(int cuantosQuedan) {
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		} else {
			throw new IllegalArgumentException("La cantidad no puede ser negativa.");
		}
	}

	/**
	 * Calcula el precio de venta al público (PVP) del artículo con IVA incluido.
	 * 
	 * @return El PVP del artículo.
	 */
	public double getPVP() {
		return precio + (precio * (IVA / 100));
	}

	/**
	 * Calcula el PVP del artículo aplicando un descuento.
	 * 
	 * @param descuento Porcentaje de descuento a aplicar. Debe estar entre 0 y 100.
	 * @return El PVP del artículo con el descuento aplicado.
	 */
	public double getPVPDescuento(double descuento) {
		if (descuento < 0 || descuento > 100) {
			throw new IllegalArgumentException("El descuento debe estar entre 0 y 100.");
		}
		return getPVP() * (1 - descuento / 100);
	}

	/**
	 * Vende una cantidad del artículo, reduciendo el stock disponible.
	 * 
	 * @param cantidad La cantidad a vender. Debe ser positiva y no mayor que el
	 *                 stock disponible.
	 * @return true si la venta fue exitosa, false si no había suficiente stock.
	 */
	public boolean vender(int cantidad) {
		boolean vendido = false;
		if (cantidad > 0 && cantidad <= cuantosQuedan) {
			cuantosQuedan -= cantidad;
			vendido = true;
		}
		return vendido;
	}

	/**
	 * Almacena una cantidad adicional del artículo, aumentando el stock disponible.
	 * 
	 * @param cantidad La cantidad a almacenar. Debe ser positiva.
	 */
	public void almacenar(int cantidad) {
		if (cantidad > 0) {
			cuantosQuedan += cantidad;
		} else {
			throw new IllegalArgumentException("La cantidad a almacenar debe ser positiva.");
		}
	}

	@Override
	public String toString() {
		return "Artículo: " + nombre + " - Precio: " + precio + "€ - IVA: " + IVA + "% - PVP: " + getPVP()
				+ "€ - Quedan: " + cuantosQuedan;
	}
}
