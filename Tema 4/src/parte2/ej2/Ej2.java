package parte2.ej2;

public class Ej2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Crear instancias de Libro usando los diferentes constructores
		try {
			Libro libro1 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");
			System.out.println("Libro1 creado exitosamente.");
		} catch (IllegalArgumentException e) {
			System.out.println("Error al crear libro1: " + e.getMessage());
		}

		try {
			Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 10, 2);
			System.out.println("Libro2 creado exitosamente.");
		} catch (IllegalArgumentException e) {
			System.out.println("Error al crear libro2: " + e.getMessage());
		}

		try {
			Libro libro3 = new Libro("La Odisea", "Homero", 5, 1, Libro.GenerosTipo.NARRATIVO);
			System.out.println("Libro3 creado exitosamente.");
		} catch (IllegalArgumentException e) {
			System.out.println("Error al crear libro3: " + e.getMessage());
		}

		// Probar los métodos get
		try {
			Libro libro1 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");
			System.out.println("Titulo libro1: " + libro1.getTitulo());
			System.out.println("Autor libro1: " + libro1.getAutor());
		} catch (IllegalArgumentException e) {
			System.out.println("Error al obtener los datos de libro1: " + e.getMessage());
		}

		try {
			Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 10, 2);
			System.out.println("Titulo libro2: " + libro2.getTitulo());
			System.out.println("Autor libro2: " + libro2.getAutor());
			System.out.println("Num. Ejemplares libro2: " + libro2.getNumEjemplares());
			System.out.println("Prestados libro2: " + libro2.getPrestados());
		} catch (IllegalArgumentException e) {
			System.out.println("Error al obtener los datos de libro2: " + e.getMessage());
		}

		try {
			Libro libro3 = new Libro("La Odisea", "Homero", 5, 1, Libro.GenerosTipo.NARRATIVO);
			System.out.println("Titulo libro3: " + libro3.getTitulo());
			System.out.println("Autor libro3: " + libro3.getAutor());
			System.out.println("Num. Ejemplares libro3: " + libro3.getNumEjemplares());
			System.out.println("Prestados libro3: " + libro3.getPrestados());
			System.out.println("Genero libro3: " + libro3.getGenero());
		} catch (IllegalArgumentException e) {
			System.out.println("Error al obtener los datos de libro3: " + e.getMessage());
		}

		// Probar los métodos set
		try {
			Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 10, 2);
			libro2.setNumEjemplares(15);
			libro2.setPrestados(3);
			System.out.println("Atributos de libro2 modificados exitosamente.");
		} catch (IllegalArgumentException e) {
			System.out.println("Error al modificar los atributos de libro2: " + e.getMessage());
		}

		// Probar los métodos prestamo y devolucion
		try {
			Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 10, 2);
			System.out.println("\nPréstamo libro2: " + (libro2.prestamo() ? "Exitoso" : "Fallido"));
			System.out.println("Devolución libro2: " + (libro2.devolucion() ? "Exitoso" : "Fallido"));
		} catch (IllegalArgumentException e) {
			System.out.println("Error al realizar préstamo o devolución en libro2: " + e.getMessage());
		}

		// Probar el método equals
		try {
			Libro libro3 = new Libro("La Odisea", "Homero", 5, 1, Libro.GenerosTipo.NARRATIVO);
			Libro libro4 = new Libro("La Odisea", "Homero", 5, 1, Libro.GenerosTipo.NARRATIVO);
			System.out.println("\n¿Libro3 es igual a Libro4? " + (libro3.equals(libro4) ? "Sí" : "No"));
		} catch (IllegalArgumentException e) {
			System.out.println("Error al comparar libros: " + e.getMessage());
		}

		// Crear instancias con datos inválidos para probar control de errores
		try {
			Libro libroInvalido1 = new Libro("", "Autor Inválido");
		} catch (IllegalArgumentException e) {
			System.out.println("Error al crear libro con título vacío: " + e.getMessage());
		}

		try {
			Libro libroInvalido2 = new Libro("Título Inválido", "");
		} catch (IllegalArgumentException e) {
			System.out.println("Error al crear libro con autor vacío: " + e.getMessage());
		}

		try {
			Libro libroInvalido3 = new Libro("Título Inválido", "Autor Inválido", -1, 1);
		} catch (IllegalArgumentException e) {
			System.out.println("Error al crear libro con número de ejemplares negativo: " + e.getMessage());
		}

		try {
			Libro libroInvalido4 = new Libro("Título Inválido", "Autor Inválido", 1, 2);
		} catch (IllegalArgumentException e) {
			System.out.println("Error al crear libro con ejemplares prestados mayor que el total: " + e.getMessage());
		}

		try {
			Libro libroInvalido5 = new Libro("Título Inválido", "Autor Inválido", 1, -1);
		} catch (IllegalArgumentException e) {
			System.out.println("Error al crear libro con ejemplares prestados negativo: " + e.getMessage());
		}
	}
}
