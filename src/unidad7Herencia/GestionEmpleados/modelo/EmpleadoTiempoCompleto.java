package unidad7Herencia.GestionEmpleados.modelo;

public class EmpleadoTiempoCompleto extends Empleado {

	private int horasExtra;

	public EmpleadoTiempoCompleto(String nombre, int codEmpleado, double salarioBase, int horasExtra) {
		super(nombre, codEmpleado, salarioBase);
		this.horasExtra = horasExtra;
	}
	
	

	@Override
	public double calcularSalario(double horasExtra) {
		 return salarioBase + horasExtra;
		
	}



	@Override
	public String toString() {
		return "EmpleadoTiempoCompleto [horasExtra=" + horasExtra + "]";
	}
	

}
