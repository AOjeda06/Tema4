package parte4.ej1;

public class Hora {
	/**
	 * Horas en formato 00-23
	 */
	private int hora;

	/**
	 * Minutos en formato 00-59
	 */
	private int minuto;

	/**
	 * Segundos en formarto 00-59
	 */
	private int segundo;

	/**
	 * Constructor de la clase Hora
	 * 
	 * @param hora    Horas
	 * @param minuto  Minutos
	 * @param segundo Segundos
	 */
	Hora(int hora, int minuto, int segundo) {
		if (hora < 0 || hora > 23) {
			throw new IllegalArgumentException("La hora debe estar entre 00 y 23");
		}

		if (minuto < 0 || minuto > 59) {
			throw new IllegalArgumentException("Los minutos deben estar entre 00 y 59");
		}

		if (segundo < 0 || segundo > 59) {
			throw new IllegalArgumentException("Los segundos deben estar entre 00 y 59");
		}

		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	/**
	 * Metodo para aumentar los segundos
	 */
	public void aumentarSegundos() {
		segundo++;
		if (segundo == 60) {
			segundo = 0;
			aumentarMinutos();
		}
	}

	/**
	 * Metodo para ajustar los minutos
	 */
	private void aumentarMinutos() {
		minuto++;
		if (minuto == 60) {
			minuto = 0;
			aumentarHora();
		}
	}

	/**
	 * Metodo para ajustar las horas
	 */
	private void aumentarHora() {
		hora++;
		if (hora == 24) {
			hora = 0;
		}
	}

	/**
	 * Getter de la hora
	 * 
	 * @return Hora
	 */
	public int getHora() {
		return hora;
	}

	/**
	 * Getter de los minutos
	 * 
	 * @return Minutos
	 */
	public int getMinuto() {
		return minuto;
	}

	/**
	 * Getter de los segundos
	 * 
	 * @return Segundos
	 */
	public int getSegundo() {
		return segundo;
	}

	/**
	 * Metodo toString para la clase Hora
	 * 
	 * @return Una cadena con la informacion de la hora que contiene
	 */
	public String toString() {
		return "Hora: " + hora + ", Minutos: " + minuto + ", Segundos: " + segundo;
	}

	/**
	 * Metodo para comparar dos objetos Hora
	 * 
	 * @param Un objeto
	 * 
	 * @return True o false según sean iguales o no
	 */
	public boolean equals(Object obj) {
		boolean res = false;

		Hora h = (Hora) obj;
		res = this.hora == h.hora && this.minuto == h.minuto && this.segundo == h.segundo;

		return res;
	}

}
