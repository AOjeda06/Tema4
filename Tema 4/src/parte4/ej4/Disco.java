package parte4.ej4;

public class Disco {
	/**
	 * 
	 */
	int codigo;
	String autor;
	String titulo;
	double duracionEnHoras;
	TipoGenero genero;

	/**
	 * 
	 */
	enum TipoGenero {
		ROCK, POP, JAZZ, BLUES
	}

	public Disco(int codigo, String autor, String titulo, double duracion, String genero) {
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.duracionEnHoras = duracion;
		this.genero = TipoGenero.valueOf(genero.toUpperCase());
	}
}
