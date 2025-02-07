package parte1.ej3;

public class Ej3 {

    public static void main(String[] args) {
        try {
            // Creamos los objetos
            Rectangulo r1 = new Rectangulo(0, 0, 5, 5);
            Rectangulo r2 = new Rectangulo(7, 9, 2, 3);

            // Imprimimos los datos
            imprimirRectangulo(r1);
            imprimirRectangulo(r2);

            // Modificamos los atributos utilizando setters
            r1.setX1(2);
            r1.setY1(2);
            r1.setX2(4);
            r1.setY2(4);

            r2.setX1(5);
            r2.setY1(7);
            r2.setX2(4);
            r2.setY2(5);

            // Imprimimos los datos después de modificarlos
            System.out.println("\nDespués de las modificaciones:");
            imprimirRectangulo(r1);
            imprimirRectangulo(r2);

            // Intentamos asignar valores erróneos
            System.out.println("\nProbando con valores erróneos:");
            r1.setX1(-1); // Esto debería lanzar una excepción
            r2.setY2(-2); // Esto debería lanzar una excepción
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Función para imprimir los datos
    public static void imprimirRectangulo(Rectangulo r) {
        System.out.println(r);
        System.out.println("Perimetro: " + r.getPerimetro());
        System.out.println("Area: " + r.getArea());
    }
}
