package parte2.ej4;

public class Ej4 {

	public static void main(String[] args) {
		// Crear instancias de Pizza usando el constructor
		Pizza pizza1 = new Pizza(1, Pizza.tamaños.MEDIANA, Pizza.tipos.MARGARITA);
		Pizza pizza2 = new Pizza(2, Pizza.tamaños.FAMILIAR, Pizza.tipos.CUATROQUESOS);

		// Probar los métodos get
		System.out.println("Código pizza1: " + pizza1.getCodigo());
		System.out.println("Tamaño pizza1: " + pizza1.getTamaño());
		System.out.println("Tipo pizza1: " + pizza1.getTipo());
		System.out.println("Estado pizza1: " + pizza1.getEstado());

		System.out.println("Código pizza2: " + pizza2.getCodigo());
		System.out.println("Tamaño pizza2: " + pizza2.getTamaño());
		System.out.println("Tipo pizza2: " + pizza2.getTipo());
		System.out.println("Estado pizza2: " + pizza2.getEstado());

		// Probar los métodos set
		pizza1.setCodigo(3);
		pizza1.setTamaño(Pizza.tamaños.FAMILIAR);
		pizza1.setTipo(Pizza.tipos.FUNGHI);
		pizza1.setEstado(Pizza.estados.SERVIDA);

		pizza2.setCodigo(4);
		pizza2.setTamaño(Pizza.tamaños.MEDIANA);
		pizza2.setTipo(Pizza.tipos.MARGARITA);
		pizza2.setEstado(Pizza.estados.SERVIDA);

		System.out.println("\nDespués de modificar los atributos:");
		System.out.println(pizza1.toString());
		System.out.println(pizza2.toString());

		// Probar el método equals
		Pizza pizza3 = new Pizza(4, Pizza.tamaños.MEDIANA, Pizza.tipos.MARGARITA);
		pizza3.setEstado(Pizza.estados.SERVIDA);
		System.out.println("\n¿Pizza2 es igual a Pizza3? " + (pizza2.equals(pizza3) ? "Sí" : "No"));
	}
}
