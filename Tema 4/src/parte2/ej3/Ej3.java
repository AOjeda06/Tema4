package parte2.ej3;

public class Ej3 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Alumno alumno1 = null;
		Alumno alumno2 = null;

		// Crear instancias de Alumno usando el constructor
		try {
			alumno1 = new Alumno("Juan Pérez", 8.5);
			System.out.println("Alumno1 creado exitosamente.");
		} catch (IllegalArgumentException e) {
			System.out.println("Error al crear alumno1: " + e.getMessage());
		}

		try {
			alumno2 = new Alumno("María López", 9.0);
			System.out.println("Alumno2 creado exitosamente.");
		} catch (IllegalArgumentException e) {
			System.out.println("Error al crear alumno2: " + e.getMessage());
		}

		// Probar los métodos get
		if (alumno1 != null) {
			try {
				System.out.println("Nombre alumno1: " + alumno1.getNombre());
				System.out.println("Media alumno1: " + alumno1.getMedia());
			} catch (IllegalArgumentException e) {
				System.out.println("Error al obtener los datos de alumno1: " + e.getMessage());
			}
		}

		if (alumno2 != null) {
			try {
				System.out.println("Nombre alumno2: " + alumno2.getNombre());
				System.out.println("Media alumno2: " + alumno2.getMedia());
			} catch (IllegalArgumentException e) {
				System.out.println("Error al obtener los datos de alumno2: " + e.getMessage());
			}
		}

		// Probar los métodos set
		if (alumno1 != null) {
			try {
				alumno1.setNombre("Juanito Pérez");
				alumno1.setMedia(9.5);
				System.out.println("Atributos de alumno1 modificados exitosamente.");
			} catch (IllegalArgumentException e) {
				System.out.println("Error al modificar los atributos de alumno1: " + e.getMessage());
			}
		}

		if (alumno2 != null) {
			try {
				alumno2.setNombre("María Luisa López");
				alumno2.setMedia(9.8);
				System.out.println("Atributos de alumno2 modificados exitosamente.");
			} catch (IllegalArgumentException e) {
				System.out.println("Error al modificar los atributos de alumno2: " + e.getMessage());
			}
		}

		System.out.println("\nDespués de modificar los atributos:");
		if (alumno1 != null) {
			try {
				System.out.println(alumno1.toString());
			} catch (IllegalArgumentException e) {
				System.out.println("Error al crear alumno1 modificado: " + e.getMessage());
			}
		}

		if (alumno2 != null) {
			try {
				System.out.println(alumno2.toString());
			} catch (IllegalArgumentException e) {
				System.out.println("Error al crear alumno2 modificado: " + e.getMessage());
			}
		}

		// Probar el método equals
		if (alumno2 != null) {
			try {
				Alumno alumno3 = new Alumno("María Luisa López", 9.8);
				System.out.println("\n¿Alumno2 es igual a Alumno3? " + (alumno2.equals(alumno3) ? "Sí" : "No"));
			} catch (IllegalArgumentException e) {
				System.out.println("Error al comparar alumnos: " + e.getMessage());
			}
		}

		// Crear instancias con datos inválidos para probar control de errores
		try {
			Alumno alumnoInvalido1 = new Alumno("", 8.5);
		} catch (IllegalArgumentException e) {
			System.out.println("Error al crear alumno con nombre vacío: " + e.getMessage());
		}

		try {
			Alumno alumnoInvalido2 = new Alumno("Juan Pérez", -1);
		} catch (IllegalArgumentException e) {
			System.out.println("Error al crear alumno con media negativa: " + e.getMessage());
		}
	}
}
