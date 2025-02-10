package parte2.ej1;

public class Ej1 {

	public static void main(String[] args) {
		// Crear objetos de CuentaCorriente utilizando diferentes constructores
		CuentaCorriente cuenta1 = new CuentaCorriente("12345678A", 1000.0);
		CuentaCorriente cuenta2 = new CuentaCorriente("87654321B", "Juan Pérez", 2000.0);
		CuentaCorriente cuenta3 = new CuentaCorriente("12344321C", "Ana García", 3000.0,
				CuentaCorriente.nacion.EXTRANJERA);

		// Probar getters
		System.out.println("Cuenta1 DNI: " + cuenta1.getDni());
		System.out.println("Cuenta2 Nombre: " + cuenta2.getNombre());
		System.out.println("Cuenta3 Saldo: " + cuenta3.getSaldo());
		System.out.println("Cuenta3 Nacionalidad: " + cuenta3.getNacionalidad());

		// Probar setters
		cuenta1.setNombre("Luis Rodríguez");
		cuenta1.setSaldo(1500.0);
		cuenta1.setNacionalidad(CuentaCorriente.nacion.EXTRANJERA);
		System.out.println("\nCuenta1 después de usar setters: " + cuenta1.toString());

		// Probar sacarDinero
		boolean resultadoSacar = cuenta2.sacarDinero(500.0);
		System.out.println(
				"\nSacar dinero de cuenta2 (500.0): " + resultadoSacar + ", Saldo actual: " + cuenta2.getSaldo());

		resultadoSacar = cuenta2.sacarDinero(2000.0);
		System.out.println(
				"Sacar dinero de cuenta2 (2000.0): " + resultadoSacar + ", Saldo actual: " + cuenta2.getSaldo());

		// Probar ingresarDinero
		boolean resultadoIngresar = cuenta3.ingresarDinero(500.0);
		System.out.println(
				"\nIngresar dinero en cuenta3 (500.0): " + resultadoIngresar + ", Saldo actual: " + cuenta3.getSaldo());

		resultadoIngresar = cuenta3.ingresarDinero(-100.0);
		System.out.println(
				"Ingresar dinero en cuenta3 (-100.0): " + resultadoIngresar + ", Saldo actual: " + cuenta3.getSaldo());

		// Probar equals
		boolean sonIguales = cuenta2.equals(cuenta3);
		System.out.println("\n¿Cuenta2 y cuenta3 son iguales?: " + sonIguales);

		CuentaCorriente cuenta4 = new CuentaCorriente("87654321B", "Juan Pérez", 2000.0,
				CuentaCorriente.nacion.ESPAÑOLA);
		sonIguales = cuenta2.equals(cuenta4);
		System.out.println("¿Cuenta2 y cuenta4 son iguales?: " + sonIguales);

		// Probar toString
		System.out.println("\nInformación de cuenta1: " + cuenta1.toString());
		System.out.println("Información de cuenta2: " + cuenta2.toString());
		System.out.println("Información de cuenta3: " + cuenta3.toString());
	}
}
