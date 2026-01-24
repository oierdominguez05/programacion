package unidad8Interfaces.ej2Banco.modelo;

public class Persona implements Cliente, Empleado {

	private double numHoras;
	private double saldoCuenta;
	private final String dni;
	private String nombre;
	private boolean esCliente;
	private boolean esEmpleado;

	public Persona(String dni, String nombre, boolean esCliente, boolean esEmpleado) {

		this.dni = dni;
		this.nombre = nombre;
		this.esCliente = esCliente;
		this.esEmpleado = esEmpleado;
	}

	@Override
	public double getSaldo() {
		return saldoCuenta;
	}

	@Override
	public double incrementarSaldo(double cantidad) {
		if (esCliente) {
			saldoCuenta += cantidad;
		}
		return saldoCuenta;
	}

	@Override
	public double incrementarHoras(double horas) {
		if (esEmpleado) {
			numHoras += horas;
		}
		return numHoras;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	@Override
	public double getNumHoras() {

		return numHoras;
	}

}
