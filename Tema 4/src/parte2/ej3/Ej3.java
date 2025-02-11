package parte2.ej3;

public class Ej3 {

	public static void main(String[] args) {
		// Crear instancias de Alumno usando el constructor
		Alumno alumno1 = new Alumno("Juan Pérez", 8.5);
		Alumno alumno2 = new Alumno("María López", 9.0);

		// Probar los métodos get
		System.out.println("Nombre alumno1: " + alumno1.getNombre());
		System.out.println("Media alumno1: " + alumno1.getMedia());

		System.out.println("Nombre alumno2: " + alumno2.getNombre());
		System.out.println("Media alumno2: " + alumno2.getMedia());

		// Probar los métodos set
		alumno1.setNombre("Juanito Pérez");
		alumno1.setMedia(9.5);

		alumno2.setNombre("María Luisa López");
		alumno2.setMedia(9.8);

		System.out.println("\nDespués de modificar los atributos:");
		System.out.println(alumno1.toString());
		System.out.println(alumno2.toString());

		// Probar el método equals
		Alumno alumno3 = new Alumno("María Luisa López", 9.8);
		System.out.println("\n¿Alumno2 es igual a Alumno3? " + (alumno2.equals(alumno3) ? "Sí" : "No"));
	}
}
