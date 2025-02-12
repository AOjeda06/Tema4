package parte2.ej2;

/**
 * Clase que representa un libro en una biblioteca.
 */
public class Libro {

	private String titulo;
	private String autor;
	private int numEjemplares;
	private int prestados;
	private GenerosTipo genero;

	/**
	 * Enumeración que representa los diferentes géneros literarios.
	 */
	enum GenerosTipo {
		NARRATIVO, LIRICO, DRAMATICO, DIDACTICO, POETICO
	}

	/**
	 * Constructor para crear un libro con título y autor.
	 * 
	 * @param titulo El título del libro.
	 * @param autor  El autor del libro.
	 * @throws IllegalArgumentException si el título o el autor están vacíos
	 */
	public Libro(String titulo, String autor) {
		if (titulo == null || titulo.isEmpty()) {
			throw new IllegalArgumentException("El título no puede estar vacío.");
		}
		if (autor == null || autor.isEmpty()) {
			throw new IllegalArgumentException("El autor no puede estar vacío.");
		}
		this.titulo = titulo;
		this.autor = autor;
	}

	/**
	 * Constructor para crear un libro con título, autor, número de ejemplares y
	 * cantidad de ejemplares prestados.
	 * 
	 * @param titulo        El título del libro.
	 * @param autor         El autor del libro.
	 * @param numEjemplares El número total de ejemplares del libro.
	 * @param prestados     La cantidad de ejemplares prestados del libro.
	 * @throws IllegalArgumentException si el título o el autor están vacíos, el
	 *                                  número de ejemplares es negativo o la
	 *                                  cantidad de ejemplares prestados es mayor al
	 *                                  total de ejemplares
	 */
	public Libro(String titulo, String autor, int numEjemplares, int prestados) {
		if (titulo == null || titulo.isEmpty()) {
			throw new IllegalArgumentException("El título no puede estar vacío.");
		}
		if (autor == null || autor.isEmpty()) {
			throw new IllegalArgumentException("El autor no puede estar vacío.");
		}
		if (numEjemplares < 0) {
			throw new IllegalArgumentException("El número de ejemplares no puede ser negativo.");
		}
		if (prestados < 0 || prestados > numEjemplares) {
			throw new IllegalArgumentException(
					"La cantidad de ejemplares prestados no puede ser negativa ni mayor al número total de ejemplares.");
		}
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		this.prestados = prestados;
	}

	/**
	 * Constructor para crear un libro con todos sus atributos.
	 * 
	 * @param titulo        El título del libro.
	 * @param autor         El autor del libro.
	 * @param numEjemplares El número total de ejemplares del libro.
	 * @param prestados     La cantidad de ejemplares prestados del libro.
	 * @param genero        El género literario del libro.
	 * @throws IllegalArgumentException si el título o el autor están vacíos, el
	 *                                  número de ejemplares es negativo o la
	 *                                  cantidad de ejemplares prestados es mayor al
	 *                                  total de ejemplares
	 */
	public Libro(String titulo, String autor, int numEjemplares, int prestados, GenerosTipo genero) {
		if (titulo == null || titulo.isEmpty()) {
			throw new IllegalArgumentException("El título no puede estar vacío.");
		}
		if (autor == null || autor.isEmpty()) {
			throw new IllegalArgumentException("El autor no puede estar vacío.");
		}
		if (numEjemplares < 0) {
			throw new IllegalArgumentException("El número de ejemplares no puede ser negativo.");
		}
		if (prestados < 0 || prestados > numEjemplares) {
			throw new IllegalArgumentException(
					"La cantidad de ejemplares prestados no puede ser negativa ni mayor al número total de ejemplares.");
		}
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		this.prestados = prestados;
		this.genero = genero;
	}

	/**
	 * Obtiene el título del libro.
	 * 
	 * @return El título del libro.
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Obtiene el autor del libro.
	 * 
	 * @return El autor del libro.
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Obtiene el número total de ejemplares del libro.
	 * 
	 * @return El número total de ejemplares del libro.
	 */
	public int getNumEjemplares() {
		return numEjemplares;
	}

	/**
	 * Obtiene la cantidad de ejemplares prestados del libro.
	 * 
	 * @return La cantidad de ejemplares prestados del libro.
	 */
	public int getPrestados() {
		return prestados;
	}

	/**
	 * Obtiene el género literario del libro.
	 * 
	 * @return El género literario del libro.
	 */
	public GenerosTipo getGenero() {
		return genero;
	}

	/**
	 * Establece el número total de ejemplares del libro.
	 * 
	 * @param numEjemplares El nuevo número total de ejemplares del libro.
	 * @throws IllegalArgumentException si el número de ejemplares es negativo
	 */
	public void setNumEjemplares(int numEjemplares) {
		if (numEjemplares >= 0) {
			this.numEjemplares = numEjemplares;
		} else {
			throw new IllegalArgumentException("El número de ejemplares no puede ser negativo.");
		}
	}

	/**
	 * Establece la cantidad de ejemplares prestados del libro.
	 * 
	 * @param prestados La nueva cantidad de ejemplares prestados del libro.
	 * @throws IllegalArgumentException si la cantidad de ejemplares prestados es
	 *                                  negativa o mayor al número total de
	 *                                  ejemplares
	 */
	public void setPrestados(int prestados) {
		if (prestados >= 0 && prestados <= numEjemplares) {
			this.prestados = prestados;
		} else {
			throw new IllegalArgumentException(
					"La cantidad de ejemplares prestados no puede ser negativa ni mayor al número total de ejemplares.");
		}
	}

	/**
	 * Realiza un préstamo de un ejemplar del libro.
	 * 
	 * @return true si el préstamo es viable, false en caso contrario.
	 */
	public boolean prestamo() {
		boolean viable = true;
		if (prestados < numEjemplares) {
			prestados++;
		} else {
			viable = false;
		}
		return viable;
	}

	/**
	 * Realiza una devolución de un ejemplar del libro.
	 * 
	 * @return true si la devolución es viable, false en caso contrario.
	 */
	public boolean devolucion() {
		boolean viable = true;
		if (prestados >= 1) {
			prestados--;
		} else {
			viable = false;
		}
		return viable;
	}

	/**
	 * Devuelve una representación en cadena del libro.
	 * 
	 * @return Una cadena con los datos del libro.
	 */
	@Override
	public String toString() {
		return "Titulo: " + titulo + ", Autor: " + autor + ", Ejemplares: " + numEjemplares + ", Prestados: "
				+ prestados + ", Genero: " + genero;
	}

	/**
	 * Compara si el objeto dado es equivalente a este libro.
	 * 
	 * @param objeto El objeto a comparar.
	 * @return true si los objetos son equivalentes, false en caso contrario.
	 */
	@Override
	public boolean equals(Object objeto) {
		boolean equivalentes = false;
		if (objeto instanceof Libro) {
			Libro l1 = (Libro) objeto;
			equivalentes = this.titulo.equals(l1.titulo) && this.autor.equals(l1.autor);
		}
		return equivalentes;
	}
}
