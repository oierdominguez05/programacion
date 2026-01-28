package unidad7Herencia.GestionEmpleados.modelo;

public abstract class Empleado {

	private String nombre;
	private int codEmpleado;
	protected double salarioBase;
	
	public Empleado(String nombre, int codEmpleado, double salarioBase) {
		super();
		this.nombre = nombre;
		this.codEmpleado = codEmpleado;
		this.salarioBase = salarioBase;
	}
	
	public abstract double calcularSalario(double horas);
	
	
}
