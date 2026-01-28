package unidad7Herencia.GestionEmpleados.modelo;

public class EmpleadoTiempoParcial extends Empleado {

	private int horasTrabajadas;

	public EmpleadoTiempoParcial(String nombre, int codEmpleado, double salarioBase, int horasTrabajadas) {
		super(nombre, codEmpleado, salarioBase);
		this.horasTrabajadas = horasTrabajadas;
	}
	
	

	@Override
	public double calcularSalario(double horasTrabajadas) {
		return salarioBase + horasTrabajadas;
	}



	@Override
	public String toString() {
		return "EmpleadoTiempoParcial [horasTrabajadas=" + horasTrabajadas + "]";
	}
	
	
	
	
}
