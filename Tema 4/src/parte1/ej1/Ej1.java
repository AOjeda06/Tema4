package parte1.ej1;

public class Ej1 {

    public static void main(String[] args) {
        // Inicializamos los objetos y sus atributos
        Punto cc1 = new Punto(5, 0);

        Punto cc2 = new Punto(10, 10);

        Punto cc3 = new Punto(-3, 7);

        // Imprimimos los valores iniciales
        System.out.println(cc1);
        System.out.println(cc2);
        System.out.println(cc3);
        System.out.println();

        // Modificamos los valores de los atributos utilizando los setters
        cc1.setX(cc1.getX() + 5);
        cc1.setY(cc1.getY() - 2);

        cc2.setX(cc2.getX() * 2);
        cc2.setY(cc2.getY() / 5);

        cc3.setX(cc3.getX() + 3);
        cc3.setY(cc3.getY() - 1);

        // Imprimimos los nuevos atributos
        System.out.println(cc1);
        System.out.println(cc2);
        System.out.println(cc3);
    }
}
