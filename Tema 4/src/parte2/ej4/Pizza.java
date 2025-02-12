package parte2.ej4;

/**
 * Clase que representa una pizza con su código, tamaño, tipo y estado.
 */
public class Pizza {
	private int codigo;
	private TamañosTipo tamaño;
	private TiposTipo tipo;
	private EstadosTipo estado;

	/**
	 * Enumeración que representa los diferentes tamaños de pizza.
	 */
	enum TamañosTipo {
		MEDIANA, FAMILIAR
	}

	/**
	 * Enumeración que representa los diferentes tipos de pizza.
	 */
	enum TiposTipo {
		MARGARITA, CUATROQUESOS, FUNGHI
	}

	/**
	 * Enumeración que representa los diferentes estados de una pizza.
	 */
	enum EstadosTipo {
		PEDIDA, SERVIDA
	}

	/**
	 * Constructor para crear una pizza con código, tamaño y tipo.
	 * 
	 * @param codigo El código de la pizza.
	 * @param tamaño El tamaño de la pizza.
	 * @param tipo   El tipo de la pizza.
	 * @throws IllegalArgumentException si el código es negativo
	 */
	public Pizza(int codigo, String tamaño, String tipo) {
		if (codigo < 0) {
			throw new IllegalArgumentException("El código no puede ser negativo.");
		}
		this.codigo = codigo;

		if (tamaño == null || tamaño.isEmpty()) {
			throw new IllegalArgumentException("El tamaño no puede estar vacio.");
		}
		this.tamaño = TamañosTipo.valueOf(tamaño.toUpperCase());

		if (tipo == null || tipo.isEmpty()) {
			throw new IllegalArgumentException("El tipo no puede estar vacio.");
		}
		this.tipo = TiposTipo.valueOf(tamaño.toUpperCase());

		this.estado = EstadosTipo.PEDIDA;
	}

	/**
	 * Obtiene el código de la pizza.
	 * 
	 * @return El código de la pizza.
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Obtiene el tamaño de la pizza.
	 * 
	 * @return El tamaño de la pizza.
	 */
	public String getTamaño() {
		return String.valueOf(tamaño);
	}

	/**
	 * Obtiene el tipo de la pizza.
	 * 
	 * @return El tipo de la pizza.
	 */
	public String getTipo() {
		return String.valueOf(tipo);
	}

	/**
	 * Obtiene el estado de la pizza.
	 * 
	 * @return El estado de la pizza.
	 */
	public String getEstado() {
		return String.valueOf(estado);
	}

	/**
	 * Establece el estado de la pizza.
	 * 
	 * @param estado El nuevo estado de la pizza.
	 */
	public void setEstado(String estado) {
		if (estado == null || estado.isEmpty()) {
			throw new IllegalArgumentException("El tipo no puede estar vacio.");
		}
		this.estado = EstadosTipo.valueOf(estado.toUpperCase());
	}

	@Override
	/**
	 * Devuelve una representación en cadena de la pizza.
	 * 
	 * @return Una cadena con los datos de la pizza.
	 */
	public String toString() {
		return codigo + " - " + tamaño + " - " + tipo + " - " + estado;
	}

	@Override
	/**
	 * Compara si el objeto dado es equivalente a esta pizza.
	 * 
	 * @param objeto El objeto a comparar.
	 * @return true si los objetos son equivalentes, false en caso contrario.
	 */
	public boolean equals(Object objeto) {
		boolean equivalentes = false;
		if (objeto instanceof Pizza) {
			Pizza p1 = (Pizza) objeto;
			equivalentes = this.codigo == p1.codigo;
		}
		return equivalentes;
	}

}
