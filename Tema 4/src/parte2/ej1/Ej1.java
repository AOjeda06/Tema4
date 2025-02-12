package parte2.ej1;

public class Ej1 {

	public static void main(String[] args) {
		try {
			// Crear objetos de CuentaCorriente utilizando diferentes constructores
			@SuppressWarnings("unused")
			CuentaCorriente cuenta1 = new CuentaCorriente("12345678A", 1000.0);
			@SuppressWarnings("unused")
			CuentaCorriente cuenta2 = new CuentaCorriente("87654321B", "Juan Pérez", 2000.0);
			@SuppressWarnings("unused")
			CuentaCorriente cuenta3 = new CuentaCorriente("12344321C", "Ana García", 3000.0,
					CuentaCorriente.nacion.EXTRANJERA);
		} catch (IllegalArgumentException e) {
			System.out.println("Error al crear una cuenta corriente: " + e.getMessage());
		}

		// Probar getters
		try {
			CuentaCorriente cuenta1 = new CuentaCorriente("12345678A", 1000.0);
			System.out.println("Cuenta1 DNI: " + cuenta1.getDni());
		} catch (IllegalArgumentException e) {
			System.out.println("Error al obtener el DNI de cuenta1: " + e.getMessage());
		}

		try {
			CuentaCorriente cuenta2 = new CuentaCorriente("87654321B", "Juan Pérez", 2000.0);
			System.out.println("Cuenta2 Nombre: " + cuenta2.getNombre());
		} catch (IllegalArgumentException e) {
			System.out.println("Error al obtener el nombre de cuenta2: " + e.getMessage());
		}

		try {
			CuentaCorriente cuenta3 = new CuentaCorriente("12344321C", "Ana García", 3000.0,
					CuentaCorriente.nacion.EXTRANJERA);
			System.out.println("Cuenta3 Saldo: " + cuenta3.getSaldo());
			System.out.println("Cuenta3 Nacionalidad: " + cuenta3.getNacionalidad());
		} catch (IllegalArgumentException e) {
			System.out.println("Error al obtener los datos de cuenta3: " + e.getMessage());
		}

		// Probar sacarDinero
		try {
			CuentaCorriente cuenta2 = new CuentaCorriente("87654321B", "Juan Pérez", 2000.0);
			boolean resultadoSacar = cuenta2.sacarDinero(500.0);
			System.out.println(
					"\nSacar dinero de cuenta2 (500.0): " + resultadoSacar + ", Saldo actual: " + cuenta2.getSaldo());

			resultadoSacar = cuenta2.sacarDinero(2000.0);
			System.out.println(
					"Sacar dinero de cuenta2 (2000.0): " + resultadoSacar + ", Saldo actual: " + cuenta2.getSaldo());
		} catch (IllegalArgumentException e) {
			System.out.println("Error al sacar dinero de cuenta2: " + e.getMessage());
		}

		// Probar ingresarDinero
		try {
			CuentaCorriente cuenta3 = new CuentaCorriente("12344321C", "Ana García", 3000.0,
					CuentaCorriente.nacion.EXTRANJERA);
			boolean resultadoIngresar = cuenta3.ingresarDinero(500.0);
			System.out.println("\nIngresar dinero en cuenta3 (500.0): " + resultadoIngresar + ", Saldo actual: "
					+ cuenta3.getSaldo());

			resultadoIngresar = cuenta3.ingresarDinero(-100.0);
			System.out.println("Ingresar dinero en cuenta3 (-100.0): " + resultadoIngresar + ", Saldo actual: "
					+ cuenta3.getSaldo());
		} catch (IllegalArgumentException e) {
			System.out.println("Error al ingresar dinero en cuenta3: " + e.getMessage());
		}

		// Probar equals
		try {
			CuentaCorriente cuenta2 = new CuentaCorriente("87654321B", "Juan Pérez", 2000.0);
			CuentaCorriente cuenta3 = new CuentaCorriente("12344321C", "Ana García", 3000.0,
					CuentaCorriente.nacion.EXTRANJERA);
			boolean sonIguales = cuenta2.equals(cuenta3);
			System.out.println("\n¿Cuenta2 y cuenta3 son iguales?: " + sonIguales);

			CuentaCorriente cuenta4 = new CuentaCorriente("87654321B", "Juan Pérez", 2000.0,
					CuentaCorriente.nacion.ESPAÑOLA);
			sonIguales = cuenta2.equals(cuenta4);
			System.out.println("¿Cuenta2 y cuenta4 son iguales?: " + sonIguales);
		} catch (IllegalArgumentException e) {
			System.out.println("Error al comparar cuentas: " + e.getMessage());
		}

		// Probar toString
		try {
			CuentaCorriente cuenta1 = new CuentaCorriente("12345678A", 1000.0);
			CuentaCorriente cuenta2 = new CuentaCorriente("87654321B", "Juan Pérez", 2000.0);
			CuentaCorriente cuenta3 = new CuentaCorriente("12344321C", "Ana García", 3000.0,
					CuentaCorriente.nacion.EXTRANJERA);
			System.out.println("\nInformación de cuenta1: " + cuenta1.toString());
			System.out.println("Información de cuenta2: " + cuenta2.toString());
			System.out.println("Información de cuenta3: " + cuenta3.toString());
		} catch (IllegalArgumentException e) {
			System.out.println("Error al obtener la información de las cuentas: " + e.getMessage());
		}
	}
}
