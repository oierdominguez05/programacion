package unidad8Interfaces.InformacionEmpleados.modelo;

public class Cliente implements Persona {

	
	
	private double saldoCuenta;
	private String dni;
	private String nombre;

	public Cliente(String dni, String nombre, double saldoCuenta) {
		this.dni = dni;
		this.nombre = nombre;
		this.saldoCuenta = saldoCuenta;
	}

	public double getSaldoCuenta() {
		return saldoCuenta;
	}

	public void setSaldoCuenta(double saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}
	
	@Override
	public String getDni() {
		return dni;
	}
	
	
}
