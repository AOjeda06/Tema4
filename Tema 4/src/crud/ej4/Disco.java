package crud.ej4;

public class Disco {
	/**
	 * Código identificador del disco.
	 */
	private int codigo;
	/**
	 * Autor del disco.
	 */
	private String autor;
	/**
	 * Título del disco.
	 */
	private String titulo;
	/**
	 * Duración del disco en horas.
	 */
	private double duracionEnHoras;
	/**
	 * Género del disco.
	 */
	private TipoGenero genero;

	/**
	 * Enumeración que define los posibles géneros musicales.
	 */
	enum TipoGenero {
		ROCK, POP, JAZZ, BLUES
	}

	/**
	 * Constructor de la clase Disco.
	 * 
	 * @param codigo   Código identificador del disco.
	 * @param autor    Autor del disco.
	 * @param titulo   Título del disco.
	 * @param duracion Duración del disco en horas.
	 * @param genero   Género del disco.
	 * @throws IllegalArgumentException si algún parámetro es inválido.
	 */
	public Disco(int codigo, String autor, String titulo, double duracion, String genero) {
		if (codigo <= 0) {
			throw new IllegalArgumentException("El código debe ser mayor que 0");
		}
		if (autor == null || autor.trim().isEmpty()) {
			throw new IllegalArgumentException("El autor no puede estar vacío");
		}
		if (titulo == null || titulo.trim().isEmpty()) {
			throw new IllegalArgumentException("El título no puede estar vacío");
		}
		if (duracion <= 0) {
			throw new IllegalArgumentException("La duración debe ser mayor que 0");
		}
		try {
			this.genero = TipoGenero.valueOf(genero.toUpperCase());
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Género no válido");
		}

		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.duracionEnHoras = duracion;
	}

	/**
	 * Obtiene el código del disco.
	 * 
	 * @return el código del disco.
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Obtiene el autor del disco.
	 * 
	 * @return el autor del disco.
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Obtiene el título del disco.
	 * 
	 * @return el título del disco.
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Obtiene la duración del disco en horas.
	 * 
	 * @return la duración del disco en horas.
	 */
	public double getDuracionEnHoras() {
		return duracionEnHoras;
	}

	/**
	 * Obtiene el género del disco como cadena de texto.
	 * 
	 * @return el género del disco como cadena de texto.
	 */
	public String getGenero() {
		return genero.toString();
	}

	@Override
	/**
	 * Devuelve una representación en cadena del disco.
	 * 
	 * @return una cadena con la información del disco.
	 */
	public String toString() {
		return "Codigo: " + codigo + ", Titulo: " + titulo + ", Autor: " + autor + ", Horas de duracion: "
				+ duracionEnHoras + ", Genero: " + genero.toString();
	}

	@Override
	/**
	 * Compara este disco con otro objeto para determinar si son equivalentes.
	 * 
	 * @param objeto el objeto a comparar.
	 * @return true si los objetos son equivalentes, false en caso contrario.
	 */
	public boolean equals(Object objeto) {
		boolean equivalentes = false;
		if (objeto instanceof Disco) {
			Disco d = (Disco) objeto;
			equivalentes = this.codigo == d.codigo;
		}

		return equivalentes;
	}
}
