package Unidad11JDBC.Clase.ej10;

public class Alumno {

	private int id;
	private String nombre;
	private int fecNacimiento;
	private double notaMedia;
	private String curso;

	public Alumno(int id, String nombre, int fecNacimiento, double notaMedia, String curso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecNacimiento = fecNacimiento;
		this.notaMedia = notaMedia;
		this.curso = curso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFecNacimiento() {
		return fecNacimiento;
	}

	public void setFecNacimiento(int fecNacimiento) {
		this.fecNacimiento = fecNacimiento;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
