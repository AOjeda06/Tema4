package parte2.ej3;

/**
 * Clase que representa a un alumno con su nombre y media.
 */
public class Alumno {
	private String nombre;
	private double media;

	/**
	 * Constructor para crear un alumno con su nombre y media.
	 * 
	 * @param nombre El nombre del alumno.
	 * @param media  La media del alumno.
	 * @throws IllegalArgumentException si el nombre está vacío o la media es
	 *                                  negativa
	 */
	public Alumno(String nombre, double media) {
		if (nombre == null || nombre.isEmpty()) {
			throw new IllegalArgumentException("El nombre no puede estar vacío.");
		}
		if (media < 0) {
			throw new IllegalArgumentException("La media no puede ser negativa.");
		}
		this.nombre = nombre;
		this.media = media;
	}

	/**
	 * Obtiene el nombre del alumno.
	 * 
	 * @return El nombre del alumno.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Obtiene la media del alumno.
	 * 
	 * @return La media del alumno.
	 */
	public double getMedia() {
		return media;
	}

	/**
	 * Establece la media del alumno.
	 * 
	 * @param media La nueva media del alumno.
	 * @throws IllegalArgumentException si la media es negativa
	 */
	public void setMedia(double media) {
		if (media >= 0) {
			this.media = media;
		} else {
			throw new IllegalArgumentException("La media no puede ser negativa.");
		}
	}

	@Override
	/**
	 * Devuelve una representación en cadena del alumno.
	 * 
	 * @return Una cadena con los datos del alumno.
	 */
	public String toString() {
		return "Nombre: " + nombre + ", Media: " + media;
	}

	@Override
	/**
	 * Compara si el objeto dado es equivalente a este alumno.
	 * 
	 * @param objeto El objeto a comparar.
	 * @return true si los objetos son equivalentes, false en caso contrario.
	 */
	public boolean equals(Object objeto) {
		boolean equivalentes = false;
		if (objeto instanceof Alumno) {
			Alumno a1 = (Alumno) objeto;
			equivalentes = this.nombre.equals(a1.nombre) && this.media == a1.media;
		}
		return equivalentes;
	}
}
