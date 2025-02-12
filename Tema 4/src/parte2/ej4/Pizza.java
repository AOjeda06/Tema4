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
	public Pizza(int codigo, TamañosTipo tamaño, TiposTipo tipo) {
		if (codigo < 0) {
			throw new IllegalArgumentException("El código no puede ser negativo.");
		}
		this.codigo = codigo;
		this.tamaño = tamaño;
		this.tipo = tipo;
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
	public TamañosTipo getTamaño() {
		return tamaño;
	}

	/**
	 * Obtiene el tipo de la pizza.
	 * 
	 * @return El tipo de la pizza.
	 */
	public TiposTipo getTipo() {
		return tipo;
	}

	/**
	 * Obtiene el estado de la pizza.
	 * 
	 * @return El estado de la pizza.
	 */
	public EstadosTipo getEstado() {
		return estado;
	}

	/**
	 * Establece el estado de la pizza.
	 * 
	 * @param estado El nuevo estado de la pizza.
	 */
	public void setEstado(EstadosTipo estado) {
		this.estado = estado;
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
