package parte4.ej3;

public class Fecha {

	private int dia;
	private int mes;
	private int ano;

	Fecha(int dia, int mes, int ano) {
		if (mes < 1 || mes > 12) {
			throw new IllegalArgumentException("Mes no válido.");
		}

		if (ano < 0) {
			throw new IllegalArgumentException("Sólo años d.C.");
		}

		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12 -> {
			if (dia < 1 || dia > 31) {
				throw new IllegalArgumentException("Día no válido.");
			}
		}
		case 2 -> {
			if (dia < 0 || dia > 28) {
				throw new IllegalArgumentException("Día no válido.");
			}
		}
		case 4, 6, 9, 11 -> {
			if (dia < 0 || dia > 30) {
				throw new IllegalArgumentException("Día no válido.");
			}
		}
		}

		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
}
