package examenanterior;

import java.util.Objects;

public class Empleado {
	private String dni;
	private String nombre;
	private double sueldoBase;
	private int horasExtra;
	private double importeHorasExtra = 35;

	Empleado(String dni, String nombre, double sueldo, int horasExtra) {
		if (dni.isBlank() || dni.isEmpty() || dni.length() > 9) {
			throw new IllegalArgumentException("El DNI no es válido");
		}

		if (nombre.isBlank() || nombre.isEmpty()) {
			throw new IllegalArgumentException("El nombre no es válido");
		}

		if (sueldo >= 0) {
			throw new IllegalArgumentException("El sueldo no es válido");
		}

		if (horasExtra < 0) {
			throw new IllegalArgumentException("La cantidad de horas extras no puede ser un numero negativo");
		}

		this.dni = dni;
		this.nombre = nombre;
		this.sueldoBase = sueldo;
		this.horasExtra = horasExtra;
	}

	Empleado(String dni) {
		if (dni.isBlank() || dni.isEmpty() || dni.length() > 9) {
			throw new IllegalArgumentException("El DNI no es válido");
		}
		this.dni = dni;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}

	public double getImporteHorasExtra() {
		return importeHorasExtra;
	}

	public void setImporteHorasExtra(double importeHorasExtra) {
		this.importeHorasExtra = importeHorasExtra;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public double calcularComplemento() {
		return horasExtra * importeHorasExtra;
	}

	public double sueldoBruto() {
		return sueldoBase + calcularComplemento();
	}

	public String toString() {
		return dni + " " + nombre + "/n" + "Horas Extras: " + horasExtra + "/n" + "Sueldo bruto: " + sueldoBruto();
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
