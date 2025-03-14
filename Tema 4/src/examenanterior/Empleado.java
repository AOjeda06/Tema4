package examenanterior;

import java.util.Objects;

/**
 * Clase que representa un empleado con DNI, nombre, sueldo base, horas extras y
 * el importe de horas extra.
 */
public class Empleado {
	private String dni;
	private String nombre;
	private double sueldoBase;
	private int horasExtra;
	private static double importeHorasExtraDefault = 35;
	private double importeHorasExtra;

	/**
	 * Constructor que inicializa un objeto Empleado con DNI, nombre, sueldo base y
	 * horas extras.
	 *
	 * @param dni        el DNI del empleado
	 * @param nombre     el nombre del empleado
	 * @param sueldo     el sueldo base del empleado
	 * @param horasExtra la cantidad de horas extras trabajadas por el empleado
	 * @throws IllegalArgumentException si el DNI, nombre, sueldo o horas extra no
	 *                                  son válidos
	 */
	Empleado(String dni, String nombre, double sueldo, int horasExtra) {
		if (dni.isBlank() || dni.isEmpty() || dni.length() > 9) {
			throw new IllegalArgumentException("El DNI no es válido");
		}

		if (nombre.isBlank() || nombre.isEmpty()) {
			throw new IllegalArgumentException("El nombre no es válido");
		}

		if (sueldo < 0) {
			throw new IllegalArgumentException("El sueldo no es válido");
		}

		if (horasExtra < 0) {
			throw new IllegalArgumentException("La cantidad de horas extras no puede ser un número negativo");
		}

		this.dni = dni;
		this.nombre = nombre;
		this.sueldoBase = sueldo;
		this.horasExtra = horasExtra;
		this.importeHorasExtra = importeHorasExtraDefault;
	}

	/**
	 * Constructor que inicializa un objeto Empleado con DNI.
	 *
	 * @param dni el DNI del empleado
	 * @throws IllegalArgumentException si el DNI no es válido
	 */
	Empleado(String dni) {
		if (dni.isBlank() || dni.isEmpty() || dni.length() > 9) {
			throw new IllegalArgumentException("El DNI no es válido");
		}
		this.dni = dni;
	}

	/**
	 * Obtiene el sueldo base del empleado.
	 *
	 * @return el sueldo base del empleado
	 */
	public double getSueldoBase() {
		return sueldoBase;
	}

	/**
	 * Establece el sueldo base del empleado.
	 *
	 * @param sueldoBase el nuevo sueldo base del empleado
	 */
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	/**
	 * Obtiene la cantidad de horas extras trabajadas por el empleado.
	 *
	 * @return la cantidad de horas extras trabajadas por el empleado
	 */
	public int getHorasExtra() {
		return horasExtra;
	}

	/**
	 * Establece la cantidad de horas extras trabajadas por el empleado.
	 *
	 * @param horasExtra la nueva cantidad de horas extras trabajadas por el
	 *                   empleado
	 */
	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}

	/**
	 * Obtiene el importe por hora extra trabajada.
	 *
	 * @return el importe por hora extra trabajada
	 */
	public double getImporteHorasExtra() {
		return importeHorasExtra;
	}

	/**
	 * Establece el importe por hora extra trabajada.
	 *
	 * @param importeHorasExtra el nuevo importe por hora extra trabajada
	 */
	public void setImporteHorasExtra(double importeHorasExtra) {
		this.importeHorasExtra = importeHorasExtra;
	}

	/**
	 * Establece el importe por hora extra por defecto para las nuevas instancias.
	 *
	 * @param nuevoImporteHorasExtraDefault el nuevo importe por hora extra por
	 *                                      defecto
	 */
	public static void setImporteHorasExtraDefault(double nuevoImporteHorasExtraDefault) {
		importeHorasExtraDefault = nuevoImporteHorasExtraDefault;
	}

	/**
	 * Obtiene el DNI del empleado.
	 *
	 * @return el DNI del empleado
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Obtiene el nombre del empleado.
	 *
	 * @return el nombre del empleado
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Calcula el complemento salarial basado en las horas extras y su importe.
	 *
	 * @return el complemento salarial
	 */
	public double calcularComplemento() {
		return horasExtra * importeHorasExtra;
	}

	/**
	 * Calcula el sueldo bruto del empleado.
	 *
	 * @return el sueldo bruto del empleado
	 */
	public double sueldoBruto() {
		return sueldoBase + calcularComplemento();
	}

	/**
	 * Retorna una representación en cadena del objeto Empleado.
	 *
	 * @return una cadena con la información del empleado
	 */
	@Override
	public String toString() {
		return dni + " " + nombre + "\n" + "Horas Extras: " + horasExtra + "\n" + "Sueldo bruto: " + sueldoBruto();
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		boolean equivalentes = false;
		if (obj instanceof Empleado) {
			Empleado e = (Empleado) obj;
			equivalentes = this.dni.equals(e.dni);
		}
		return equivalentes;
	}
}
