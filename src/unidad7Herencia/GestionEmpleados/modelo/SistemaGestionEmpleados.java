package unidad7Herencia.GestionEmpleados.modelo;

public class SistemaGestionEmpleados extends Empleado{

	public SistemaGestionEmpleados(String nombre, int codEmpleado, double salarioBase) {
		super(nombre, codEmpleado, salarioBase);
		// TODO Auto-generated constructor stub
	}

	private String[] empleado = new String[empleado];

	
	@Override
	public double calcularSalario(double horas) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
