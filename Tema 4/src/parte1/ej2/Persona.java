package parte1.ej2;

/**
 * Clase que representa una persona con su DNI, nombre, apellidos y edad.
 */
public class Persona {

	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;

	/**
	 * Constructor que inicializa una persona con el DNI, nombre, apellidos y edad
	 * dados.
	 * 
	 * @param dni       DNI de la persona.
	 * @param nombre    Nombre de la persona.
	 * @param apellidos Apellidos de la persona.
	 * @param edad      Edad de la persona.
	 */
	public Persona(String dni, String nombre, String apellidos, int edad) {
		setDni(dni);
		setNombre(nombre);
		setApellidos(apellidos);
		setEdad(edad);
	}

	/**
	 * Obtiene el DNI de la persona.
	 * 
	 * @return El DNI de la persona.
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Obtiene el nombre de la persona.
	 * 
	 * @return El nombre de la persona.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Obtiene los apellidos de la persona.
	 * 
	 * @return Los apellidos de la persona.
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Obtiene la edad de la persona.
	 * 
	 * @return La edad de la persona.
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Establece el DNI de la persona.
	 * 
	 * @param dni El DNI de la persona. No puede estar vacío.
	 */
	public void setDni(String dni) {
		if (dni != null && !dni.isEmpty()) {
			this.dni = dni;
		} else {
			throw new IllegalArgumentException("DNI no puede estar vacío.");
		}
	}

	/**
	 * Establece el nombre de la persona.
	 * 
	 * @param nombre El nombre de la persona. No puede estar vacío.
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		} else {
			throw new IllegalArgumentException("Nombre no puede estar vacío.");
		}
	}

	/**
	 * Establece los apellidos de la persona.
	 * 
	 * @param apellidos Los apellidos de la persona. No pueden estar vacíos.
	 */
	public void setApellidos(String apellidos) {
		if (apellidos != null && !apellidos.isEmpty()) {
			this.apellidos = apellidos;
		} else {
			throw new IllegalArgumentException("Apellidos no pueden estar vacíos.");
		}
	}

	/**
	 * Establece la edad de la persona.
	 * 
	 * @param edad La edad de la persona. No puede ser negativa.
	 */
	public void setEdad(int edad) {
		if (edad >= 0) {
			this.edad = edad;
		} else {
			throw new IllegalArgumentException("Edad no puede ser negativa.");
		}
	}

	/**
	 * Verifica si la persona es mayor de edad.
	 * 
	 * @return true si la persona es mayor de edad (18 años o más), false en caso
	 *         contrario.
	 */
	public boolean esMayorEdad() {
		return edad >= 18;
	}

	/**
	 * Verifica si la persona es jubilada.
	 * 
	 * @return true si la persona es jubilada (65 años o más), false en caso
	 *         contrario.
	 */
	public boolean esJubilado() {
		return edad >= 65;
	}

	/**
	 * Calcula la diferencia de edad con otra persona.
	 * 
	 * @param p Otra persona con la que calcular la diferencia de edad.
	 * @return La diferencia de edad con la otra persona.
	 */
	public int diferenciaEdad(Persona p) {
		return Math.abs(this.edad - p.edad);
	}

	@Override
	public String toString() {
		return "DNI: " + dni + ", Nombre: " + nombre + ", Apellidos: " + apellidos + ", Edad: " + edad;
	}
}
