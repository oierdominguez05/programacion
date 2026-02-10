package Examenes.Examen1_2ªev.GestionEmpleados.modelo;

public class EmpleadoTiempoCompleto extends Empleado {

	private int horasExtra;

	public EmpleadoTiempoCompleto(String nombre, int codigoEmpleado, float salarioBase, int horasExtra) {
		super(nombre, codigoEmpleado, salarioBase);
		this.horasExtra = horasExtra;
	}

	
	public double calcularSalario(double horasExtra) {
		return horasExtra;
		
	}
	
	
}
