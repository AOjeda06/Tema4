package parte1.ej4;

public class Ej4 {

    public static void main(String[] args) {
        try {
            // Creamos los objetos
            Articulo articulo1 = new Articulo("sal", 2, 21, 6);
            Articulo articulo2 = new Articulo("azúcar", 1.5, 10, 10);

            // Imprimimos los datos iniciales
            System.out.println(articulo1);
            System.out.println(articulo2);

            // Modificamos los atributos utilizando setters
            articulo1.setPrecio(3);
            articulo1.setCuantosQuedan(5);
            articulo2.setNombre("Azúcar refinado");
            articulo2.setPrecio(2.5);

            // Imprimimos los datos después de modificarlos
            System.out.println("\nDespués de las modificaciones:");
            System.out.println(articulo1);
            System.out.println(articulo2);

            // Intentamos asignar valores erróneos
            System.out.println("\nProbando con valores erróneos:");
            articulo1.setPrecio(-1); // Esto debería lanzar una excepción
            articulo2.setCuantosQuedan(-3); // Esto debería lanzar una excepción
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
