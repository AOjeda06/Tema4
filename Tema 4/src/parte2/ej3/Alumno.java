package parte2.ej3;

/**
 * Clase que representa a un alumno con su nombre y media.
 */
public class Alumno {
	String nombre;
	double media;

	/**
	 * Constructor para crear un alumno con su nombre y media.
	 * 
	 * @param nombre El nombre del alumno.
	 * @param media  La media del alumno.
	 */
	public Alumno(String nombre, double media) {
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
	 * Establece el nombre del alumno.
	 * 
	 * @param nombre El nuevo nombre del alumno.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Establece la media del alumno.
	 * 
	 * @param media La nueva media del alumno.
	 */
	public void setMedia(double media) {
		this.media = media;
	}

	@Override
	/**
	 * Devuelve una representación en cadena del alumno.
	 * 
	 * @return Una cadena con los datos del alumno.
	 */
	public String toString() {
		return nombre + " " + media;
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
			equivalentes = this.nombre.equals(a1.nombre);
		}
		return equivalentes;
	}
}
