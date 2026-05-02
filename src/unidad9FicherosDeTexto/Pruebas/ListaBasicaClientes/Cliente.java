package unidad9FicherosDeTexto.Pruebas.ListaBasicaClientes;

public class Cliente {

	String dni;
	String nombre;
	double saldo;

	public Cliente(String dni, String nombre, double saldo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return dni + ";" + nombre + ";" + saldo;
	}

}
