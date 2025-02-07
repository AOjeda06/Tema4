package parte1.ej2;

public class Persona {
    // Atributos
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    // Override
    public String toString() {
        return nombre + " " + apellidos + " con dni: " + dni + (edad >= 18 ? " es " : " no es ") + "mayor de edad";
    }

    // Constructor
    public Persona(String dni, String nombre, String apellidos, int edad) {
        setDni(dni);
        setNombre(nombre);
        setApellidos(apellidos);
        setEdad(edad);
    }

    // Getters
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    // Setters
    public void setDni(String dni) {
        if (dni != null && !dni.isEmpty()) {
            this.dni = dni;
        } else {
            throw new IllegalArgumentException("DNI no puede estar vacío.");
        }
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("Nombre no puede estar vacío.");
        }
    }

    public void setApellidos(String apellidos) {
        if (apellidos != null && !apellidos.isEmpty()) {
            this.apellidos = apellidos;
        } else {
            throw new IllegalArgumentException("Apellidos no pueden estar vacíos.");
        }
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("Edad no puede ser negativa.");
        }
    }
}
