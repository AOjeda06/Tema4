package parte2.ej1;

public class CuentaCorriente {
	private String dni;
	private String nombre;
	private double saldo;
	private nacion nacionalidad;

	/**
	 * Enumeración que define las posibles nacionalidades de una cuenta corriente.
	 */
	enum nacion {
		ESPAÑOLA, EXTRANJERA
	}

	/**
	 * Constructor que inicializa una cuenta corriente con el DNI del titular y un
	 * saldo inicial.
	 *
	 * @param dni   el DNI del titular de la cuenta
	 * @param saldo el saldo inicial de la cuenta
	 */
	public CuentaCorriente(String dni, double saldo) {
		this.dni = dni;
		this.saldo = saldo;
		this.nacionalidad = nacion.ESPAÑOLA; // Nacionalidad por defecto si no se especifica
	}

	/**
	 * Constructor que inicializa una cuenta corriente con el DNI, nombre del
	 * titular y un saldo inicial.
	 *
	 * @param dni    el DNI del titular de la cuenta
	 * @param nombre el nombre del titular de la cuenta
	 * @param saldo  el saldo inicial de la cuenta
	 */
	public CuentaCorriente(String dni, String nombre, double saldo) {
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
		this.nacionalidad = nacion.ESPAÑOLA; // Nacionalidad por defecto si no se especifica
	}

	/**
	 * Constructor que inicializa una cuenta corriente con el DNI, nombre del
	 * titular, un saldo inicial y la nacionalidad.
	 *
	 * @param dni          el DNI del titular de la cuenta
	 * @param nombre       el nombre del titular de la cuenta
	 * @param saldo        el saldo inicial de la cuenta
	 * @param nacionalidad la nacionalidad del titular de la cuenta
	 */
	public CuentaCorriente(String dni, String nombre, double saldo, nacion nacionalidad) {
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
		this.nacionalidad = nacionalidad;
	}

	/**
	 * Devuelve el DNI del titular de la cuenta.
	 *
	 * @return el DNI del titular de la cuenta
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Establece el DNI del titular de la cuenta.
	 *
	 * @param dni el DNI del titular de la cuenta
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * Devuelve el nombre del titular de la cuenta.
	 *
	 * @return el nombre del titular de la cuenta
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del titular de la cuenta.
	 *
	 * @param nombre el nombre del titular de la cuenta
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el saldo de la cuenta.
	 *
	 * @return el saldo de la cuenta
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Establece el saldo de la cuenta.
	 *
	 * @param saldo el saldo de la cuenta
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Devuelve la nacionalidad del titular de la cuenta.
	 *
	 * @return la nacionalidad del titular de la cuenta
	 */
	public nacion getNacionalidad() {
		return nacionalidad;
	}

	/**
	 * Establece la nacionalidad del titular de la cuenta.
	 *
	 * @param nacionalidad la nacionalidad del titular de la cuenta
	 */
	public void setNacionalidad(nacion nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	/**
	 * Saca una cantidad de dinero de la cuenta, si hay saldo suficiente.
	 *
	 * @param sustraccion la cantidad de dinero a sacar
	 * @return true si se ha podido realizar la operación, false en caso contrario
	 */
	public boolean sacarDinero(double sustraccion) {
		boolean viable = true;

		if (saldo >= sustraccion) {
			saldo -= sustraccion;
		} else {
			viable = false;
		}

		return viable;
	}

	/**
	 * Ingresa una cantidad de dinero en la cuenta, si la cantidad es positiva.
	 *
	 * @param ingreso la cantidad de dinero a ingresar
	 * @return true si se ha podido realizar la operación, false en caso contrario
	 */
	public boolean ingresarDinero(double ingreso) {
		boolean viable = true;

		if (ingreso > 0) {
			saldo += ingreso;
		} else {
			viable = false;
		}

		return viable;
	}

	/**
	 * Devuelve una cadena con la información de la cuenta corriente.
	 *
	 * @return una cadena con la información de la cuenta corriente
	 */
	@Override
	public String toString() {
		return "DNI: " + dni + ", NOMBRE: " + nombre + ", SALDO: " + saldo + ", NACIONALIDAD: " + nacionalidad;
	}

	/**
	 * Compara esta cuenta corriente con otro objeto para determinar si son iguales.
	 *
	 * @param objeto el objeto a comparar
	 * @return true si los objetos son iguales, false en caso contrario
	 */
	@Override
	public boolean equals(Object objeto) {
		boolean equivalentes = false;
		// Comprueba que objeto es de tipo CuentaCorriente
		if (objeto instanceof CuentaCorriente) {
			CuentaCorriente cc = (CuentaCorriente) objeto;
			equivalentes = this.dni.equals(cc.dni) && this.nombre.equals(cc.nombre) && this.saldo == cc.saldo
					&& this.nacionalidad == cc.nacionalidad;
		}
		return equivalentes;
	}
}
