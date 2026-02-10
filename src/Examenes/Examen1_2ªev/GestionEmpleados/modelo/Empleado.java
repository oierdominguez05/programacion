package Examenes.Examen1_2ªev.GestionEmpleados.modelo;

public abstract class Empleado {

	protected String nombre;
	protected int codigoEmpleado;
	protected float salarioBase;

	public Empleado(String nombre, int codigoEmpleado, float salarioBase) {
		super();
		this.nombre = nombre;
		this.codigoEmpleado = codigoEmpleado;
		this.salarioBase = salarioBase;
	}

	
	public double calcularSalario(double salario) {
		return salarioBase + salario;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCodigoEmpleado() {
		return codigoEmpleado;
	}


	public void setCodigoEmpleado(int codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}


	public float getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}


	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", codigoEmpleado=" + codigoEmpleado + ", salarioBase=" + salarioBase
				+ "]";
	}
	
	
	
}
