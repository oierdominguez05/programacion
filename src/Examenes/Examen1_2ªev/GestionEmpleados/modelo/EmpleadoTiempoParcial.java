package Examenes.Examen1_2ªev.GestionEmpleados.modelo;

public class EmpleadoTiempoParcial extends Empleado{

	
	
	private int horasTrabajadas;

	public EmpleadoTiempoParcial(String nombre, int codigoEmpleado, float salarioBase, int horasTrabajadas) {
		super(nombre, codigoEmpleado, salarioBase);
		this.horasTrabajadas = horasTrabajadas;
	}
	
	
	public double calcularSalarioBase(double horasTrabajadas) {
		return horasTrabajadas;
		
	}
	
	
}
