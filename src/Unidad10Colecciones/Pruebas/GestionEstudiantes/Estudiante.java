package Unidad10Colecciones.Pruebas.GestionEstudiantes;

public class Estudiante implements Comparable<Estudiante> {

	private String dni;
	private String nombre;
	private double nota;

	public Estudiante(String dni, String nombre, double nota) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.nota = nota;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	public boolean aprobado() {
		if(nota >= 5) {
			return true;
		}
		return false;
	}
	public int hasCode() {
		return dni.hashCode();
	}

	@Override
	public int compareTo(Estudiante o) {
		return this.nombre.compareTo(o.nombre);
	}

}
