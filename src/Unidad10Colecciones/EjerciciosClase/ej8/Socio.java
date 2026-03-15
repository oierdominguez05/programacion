package Unidad10Colecciones.EjerciciosClase.ej8;

import java.time.LocalDate;
import java.time.Period;

public class Socio implements Comparable<Socio> {

	private String dni;
	private String nombre;
	private LocalDate fechaAlta;

	public Socio(String dni, String nombre, LocalDate fechaAlta) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaAlta = fechaAlta;
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

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	@Override
	public int compareTo(Socio o) {
		return this.dni.compareTo(o.dni);
	}

	public boolean equals(Object o) {
		Socio s = (Socio) o;
		return this.dni.equals(s.dni);

	}

	@Override
	public String toString() {
		return dni + ";" + nombre + ";" + fechaAlta;
	}

	public int antiguedad() {
		return Period.between(fechaAlta, LocalDate.now()).getYears();
	}

}
