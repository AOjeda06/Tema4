package parte4.ej3;

/**
 * La clase Fecha representa una fecha en un formato simple con día, mes y año.
 */
public class Fecha {

	/** El día de la fecha. */
	private int dia;

	/** El mes de la fecha. */
	private int mes;

	/** El año de la fecha. */
	private int ano;

	/**
	 * Construye una nueva instancia de Fecha.
	 *
	 * @param dia el día de la fecha
	 * @param mes el mes de la fecha
	 * @param ano el año de la fecha
	 * @throws IllegalArgumentException si el mes no es válido (1-12) o si el año es
	 *                                  menor que 0 o si el día no es válido para el
	 *                                  mes correspondiente
	 */
	Fecha(int dia, int mes, int ano) {
		if (!fechaCorrecta(dia, mes, ano)) {
			throw new IllegalArgumentException("Fecha no válida.");
		}

		this.mes = mes;
		this.ano = ano;
		this.dia = dia;
	}

	/**
	 * Verifica si una fecha es correcta.
	 *
	 * @param dia el día de la fecha
	 * @param mes el mes de la fecha
	 * @param ano el año de la fecha
	 * @return true si la fecha es correcta, false en caso contrario
	 */
	private boolean fechaCorrecta(int dia, int mes, int ano) {
		boolean correcto = true;

		if (mes < 1 || mes > 12) {
			correcto = false;
		}
		if (ano < 0) {
			correcto = false;
		}
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12 -> {
			if (dia < 1 || dia > 31) {
				correcto = false;
			}
		}
		case 2 -> {
			if (esBisiesto(ano)) {
				if (dia < 1 || dia > 29) {
					correcto = false;
				}
			} else {
				if (dia < 1 || dia > 28) {
					correcto = false;
				}
			}
		}
		case 4, 6, 9, 11 -> {
			if (dia < 1 || dia > 30) {
				correcto = false;
			}
		}
		}

		return correcto;
	}

	/**
	 * Devuelve el día de la fecha.
	 *
	 * @return el día de la fecha
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * Devuelve el mes de la fecha.
	 *
	 * @return el mes de la fecha
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * Devuelve el año de la fecha.
	 *
	 * @return el año de la fecha
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * Determina si el año es bisiesto.
	 *
	 * @param ano el año a comprobar
	 * @return true si el año es bisiesto, false en caso contrario
	 */
	private boolean esBisiesto(int ano) {
		return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
	}

	/**
	 * Incrementa la fecha en un día, manejando el cambio de mes y año según sea
	 * necesario.
	 */
	public void diaSiguiente() {
		dia++;
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12 -> {
			if (dia > 31) {
				dia = 1;
				mes++;
			}
		}
		case 2 -> {
			if (esBisiesto(this.ano)) {
				if (dia > 29) {
					dia = 1;
					mes++;
				}
			} else {
				if (dia > 28) {
					dia = 1;
					mes++;
				}
			}
		}
		case 4, 6, 9, 11 -> {
			if (dia > 30) {
				dia = 1;
				mes++;
			}
		}
		}

		if (mes > 12) {
			mes = 1;
			ano++;
		}
	}

	/**
	 * Devuelve una representación en cadena de la fecha en formato "día-mes-año".
	 *
	 * @return una representación en cadena de la fecha
	 */
	@Override
	public String toString() {
		return dia + "-" + mes + "-" + ano;
	}
}
