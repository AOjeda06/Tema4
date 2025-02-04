package parte1.ej4;

public class Ej4 {

	public static void main(String[] args) {
		// Creamos el objeto y modificamos sus atributos
		Articulo objeto = new Articulo("sal", 2, 21, 6);

		// Imprimimos los datos
		System.out.println(objeto);

		// Modificamos los datos
		objeto.precio = 3;
		objeto.cuantosQuedan = 5;

		// Imprimimos los datos
		System.out.println(objeto);
	}

}
