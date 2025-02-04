package parte1.ej2;

public class Persona {
	// Atributos
	String dni;
	String nombre;
	String apellidos;
	int edad;

	// Override
	public String toString() {
		return nombre + " " + apellidos + " con dni: " + dni + (edad >= 18 ? " es " : " no es ") + "mayor de edad";
	}

	// Constructor
	Persona(String dni, String nombre, String apellidos, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
}
