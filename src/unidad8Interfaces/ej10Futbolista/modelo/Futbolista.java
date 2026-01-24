package unidad8Interfaces.ej10Futbolista.modelo;

import java.util.Objects;

public class Futbolista implements Comparable<Futbolista>{

	private String dni;
	private String nombre;
	private int edad;
	private int numGoles;

	public Futbolista(String dni, String nombre, int edad, int numGoles) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.numGoles = numGoles;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Futbolista other = (Futbolista) obj;
		return Objects.equals(dni, other.dni);
	}
	
	public int compareTo(Futbolista otro) {
		return this.dni.compareTo(otro.dni);
		
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNumGoles() {
		return numGoles;
	}

	public void setNumGoles(int numGoles) {
		this.numGoles = numGoles;
	}

	@Override
	public String toString() {
		return "Futbolista dni= " + dni + " nombre= " + nombre + " edad= " + edad + " numGoles= " + numGoles;
	}

	

}
