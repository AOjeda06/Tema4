package parte2.ej4;

/**
 * Clase que representa una pizza con su código, tamaño, tipo y estado.
 */
public class Pizza {
	int codigo;
	tamaños tamaño;
	tipos tipo;
	estados estado;

	/**
	 * Enumeración que representa los diferentes tamaños de pizza.
	 */
	enum tamaños {
		MEDIANA, FAMILIAR
	}

	/**
	 * Enumeración que representa los diferentes tipos de pizza.
	 */
	enum tipos {
		MARGARITA, CUATROQUESOS, FUNGHI
	}

	/**
	 * Enumeración que representa los diferentes estados de una pizza.
	 */
	enum estados {
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
	public Pizza(int codigo, tamaños tamaño, tipos tipo) {
		if (codigo < 0) {
			throw new IllegalArgumentException("El código no puede ser negativo.");
		}
		this.codigo = codigo;
		this.tamaño = tamaño;
		this.tipo = tipo;
		this.estado = estados.PEDIDA;
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
	 * Establece el código de la pizza.
	 * 
	 * @param codigo El nuevo código de la pizza.
	 * @throws IllegalArgumentException si el código es negativo
	 */
	public void setCodigo(int codigo) {
		if (codigo >= 0) {
			this.codigo = codigo;
		} else {
			throw new IllegalArgumentException("El código no puede ser negativo.");
		}
	}

	/**
	 * Obtiene el tamaño de la pizza.
	 * 
	 * @return El tamaño de la pizza.
	 */
	public tamaños getTamaño() {
		return tamaño;
	}

	/**
	 * Establece el tamaño de la pizza.
	 * 
	 * @param tamaño El nuevo tamaño de la pizza.
	 */
	public void setTamaño(tamaños tamaño) {
		this.tamaño = tamaño;
	}

	/**
	 * Obtiene el tipo de la pizza.
	 * 
	 * @return El tipo de la pizza.
	 */
	public tipos getTipo() {
		return tipo;
	}

	/**
	 * Establece el tipo de la pizza.
	 * 
	 * @param tipo El nuevo tipo de la pizza.
	 */
	public void setTipo(tipos tipo) {
		this.tipo = tipo;
	}

	/**
	 * Obtiene el estado de la pizza.
	 * 
	 * @return El estado de la pizza.
	 */
	public estados getEstado() {
		return estado;
	}

	/**
	 * Establece el estado de la pizza.
	 * 
	 * @param estado El nuevo estado de la pizza.
	 */
	public void setEstado(estados estado) {
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
