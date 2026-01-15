package Examen1_2ªev.Zoologico.modelo;

public class Trabajador extends Zoologico {

	private String nombre;
	private String apellidos;
	private String especialidad;
	private String dni;

	public Trabajador(String nombre, String apellidos, String especialidad, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.especialidad = especialidad;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}
