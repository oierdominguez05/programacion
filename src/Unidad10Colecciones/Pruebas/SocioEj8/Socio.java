package Unidad10Colecciones.Pruebas.SocioEj8;

import java.sql.Date;

public class Socio implements Comparable<Socio> {

	private String dni;
	private String nombre;
	private String fecha;

	public Socio(String dni, String nombre, String fecha) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fecha = fecha;
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

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return dni + " ," + nombre + " , " + fecha;
	}

	@Override
	public int compareTo(Socio o) {
		if( this.dni.compareTo(o.dni) != 0) {
			return 1;
		} else {
			return this.fecha.compareTo(o.fecha);
		}
	}

}
