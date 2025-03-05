package parte4.ej3;

public class Ej3 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			// Prueba de creación de fechas válidas
			Fecha fecha1 = new Fecha(28, 2, 2024); // Año bisiesto
			Fecha fecha2 = new Fecha(31, 12, 2023); // Fin de año
			Fecha fecha3 = new Fecha(30, 4, 2023); // Mes con 30 días

			// Prueba de métodos de acceso
			System.out.println("Fecha 1: " + fecha1);
			System.out.println("Fecha 2: " + fecha2);
			System.out.println("Fecha 3: " + fecha3);
			System.out.println("Día de Fecha 1: " + fecha1.getDia());
			System.out.println("Mes de Fecha 1: " + fecha1.getMes());
			System.out.println("Año de Fecha 1: " + fecha1.getAno());

			// Prueba de método diaSiguiente
			fecha1.diaSiguiente();
			System.out.println("Día siguiente de Fecha 1: " + fecha1);
			fecha2.diaSiguiente();
			System.out.println("Día siguiente de Fecha 2: " + fecha2);
			fecha3.diaSiguiente();
			System.out.println("Día siguiente de Fecha 3: " + fecha3);

			// Prueba de excepciones
			try {
				Fecha fechaInvalida = new Fecha(31, 4, 2023); // Abril solo tiene 30 días
			} catch (IllegalArgumentException e) {
				System.out.println("Excepción capturada: " + e.getMessage());
			}

			try {
				Fecha fechaInvalida = new Fecha(29, 2, 2023); // 2023 no es año bisiesto
			} catch (IllegalArgumentException e) {
				System.out.println("Excepción capturada: " + e.getMessage());
			}

			try {
				Fecha fechaInvalida = new Fecha(31, 13, 2023); // Mes no válido
			} catch (IllegalArgumentException e) {
				System.out.println("Excepción capturada: " + e.getMessage());
			}

			try {
				Fecha fechaInvalida = new Fecha(1, -1, 2023); // Mes no válido
			} catch (IllegalArgumentException e) {
				System.out.println("Excepción capturada: " + e.getMessage());
			}

			try {
				Fecha fechaInvalida = new Fecha(1, 1, -1); // Año no válido
			} catch (IllegalArgumentException e) {
				System.out.println("Excepción capturada: " + e.getMessage());
			}

		} catch (Exception e) {
			System.out.println("Se produjo un error: " + e.getMessage());
		}
	}
}
