package Unidad11JDBC.Entregables.ej9;

import java.sql.Date;

public class Empleado {

	private String nombre;
	private int edad;
	private String oficina;
	private int puesto;
	private Date contrato;

	public Empleado(String nombre, int edad, String oficina, int puesto, Date contrato) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.oficina = oficina;
		this.puesto = puesto;
		this.contrato = contrato;
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

	public String getOficina() {
		return oficina;
	}

	public void setOficina(String oficina) {
		this.oficina = oficina;
	}

	public int getPuesto() {
		return puesto;
	}

	public void setPuesto(int puesto) {
		this.puesto = puesto;
	}

	public Date getContrato() {
		return contrato;
	}

	public void setContrato(Date contrato) {
		this.contrato = contrato;
	}

	@Override
	public String toString() {
		return "Empleado " + ", nombre=" + nombre + ", edad=" + edad + ", oficina=" + oficina
				+ ", puesto=" + puesto + ", contrato=" + contrato + "]";
	}

}
