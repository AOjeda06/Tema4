package parte4.ej1;

public class Ej1 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Prueba con valores correctos
		try {
			Hora hora = new Hora(23, 59, 58);
			System.out.println(hora.toString());

			hora.aumentarSegundos();
			System.out.println("Después de aumentar 1 segundo: " + hora.getHora() + ":" + hora.getMinuto() + ":"
					+ hora.getSegundo());

			System.out.println(hora.toString());

			hora.aumentarSegundos();
			System.out.println("Después de aumentar 1 segundo más: " + hora.getHora() + ":" + hora.getMinuto() + ":"
					+ hora.getSegundo());

			System.out.println(hora.toString());
			
			Hora hora2 = new Hora(23, 59, 58);

			System.out.println(hora.equals(hora2));

		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}

		// Prueba con valores incorrectos
		try {
			Hora horaInvalida = new Hora(25, 0, 0); // Hora inválida
		} catch (IllegalArgumentException e) {
			System.out.println("Error al crear hora con valor inválido: " + e.getMessage());
		}

		try {
			Hora minutoInvalido = new Hora(10, 60, 0); // Minuto inválido
		} catch (IllegalArgumentException e) {
			System.out.println("Error al crear hora con minuto inválido: " + e.getMessage());
		}

		try {
			Hora segundoInvalido = new Hora(10, 0, 60); // Segundo inválido
		} catch (IllegalArgumentException e) {
			System.out.println("Error al crear hora con segundo inválido: " + e.getMessage());
		}
	}
}
