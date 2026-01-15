package Examen1_2ªev.Zoologico.modelo;

public class Asignacion extends Trabajador{
	
	private int diasTrabajados;

	public Asignacion(String nombre, String apellidos, String especialidad, String dni, int diasTrabajados) {
		super(nombre, apellidos, especialidad, dni);
		this.diasTrabajados = diasTrabajados;
	}
	

}
