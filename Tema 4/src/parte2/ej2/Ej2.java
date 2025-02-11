package parte2.ej2;

public class Ej2 {

	public static void main(String[] args) {
		// Crear instancias de Libro usando los diferentes constructores
		Libro libro1 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");
		Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 10, 2);
		Libro libro3 = new Libro("La Odisea", "Homero", 5, 1, Libro.generos.NARRATIVO);

		// Probar los métodos get
		System.out.println("Titulo libro1: " + libro1.getTitulo());
		System.out.println("Autor libro1: " + libro1.getAutor());

		System.out.println("Titulo libro2: " + libro2.getTitulo());
		System.out.println("Autor libro2: " + libro2.getAutor());
		System.out.println("Num. Ejemplares libro2: " + libro2.getNumEjemplares());
		System.out.println("Prestados libro2: " + libro2.getPrestados());

		System.out.println("Titulo libro3: " + libro3.getTitulo());
		System.out.println("Autor libro3: " + libro3.getAutor());
		System.out.println("Num. Ejemplares libro3: " + libro3.getNumEjemplares());
		System.out.println("Prestados libro3: " + libro3.getPrestados());
		System.out.println("Genero libro3: " + libro3.getGenero());

		// Probar los métodos set
		libro1.setTitulo("El ingenioso hidalgo Don Quijote de la Mancha");
		libro1.setAutor("Cervantes");
		libro2.setNumEjemplares(15);
		libro2.setPrestados(3);
		libro3.setGenero(Libro.generos.POETICO);

		System.out.println("\nDespués de modificar los atributos:");
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		System.out.println(libro3.toString());

		// Probar los métodos prestamo y devolucion
		System.out.println("\nPréstamo libro2: " + (libro2.prestamo() ? "Exitoso" : "Fallido"));
		System.out.println("Devolución libro2: " + (libro2.devolucion() ? "Exitoso" : "Fallido"));

		// Probar el método equals
		Libro libro4 = new Libro("La Odisea", "Homero", 5, 1, Libro.generos.NARRATIVO);
		System.out.println("\n¿Libro3 es igual a Libro4? " + (libro3.equals(libro4) ? "Sí" : "No"));
	}
}
