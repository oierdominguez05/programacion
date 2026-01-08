package unidad8Interfaces.InformacionEmpleados.modelo;

public class Empleado implements Persona{

	
	
	private double numHoras;
	private String dni;
	private String nombre;
	

	public Empleado(String dni,String nombre, double numHoras) {
		this.dni = dni;
		this.nombre = nombre;
		this.numHoras = numHoras;
	}



	public double getNumHoras() {
		return numHoras;
	}



	public void setNumHoras(double numHoras) {
		this.numHoras = numHoras;
	}
	
	@Override
	public String getDni() {
		return dni();
	
	
	}
	
	
}
