package unidad9FicherosDeTexto.EjemploGestorAlumnos.modelo;

import java.io.Serializable;

public class Alumno implements Serializable {

	private String nombre;
	private String dni;
	private int numCLase;
	private String apelldio;

	public Alumno(String nombre, String dni, int numClase, String apelldio) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.numCLase = numClase;
		this.apelldio = apelldio;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", dni=" + dni + ", numCLase=" + numCLase + ", apelldio=" + apelldio + "]";
	}

}
