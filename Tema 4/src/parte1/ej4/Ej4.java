package parte1.ej4;

public class Ej4 {

	public static void main(String[] args) {
		Articulo objeto = new Articulo();
		objeto.nombre = "Sal";
		objeto.precio = 2;
		objeto.cuantosQuedan = 6;

		System.out.println(objeto);

		objeto.precio = 3;
		objeto.cuantosQuedan = 5;

		System.out.println(objeto);
	}

}
