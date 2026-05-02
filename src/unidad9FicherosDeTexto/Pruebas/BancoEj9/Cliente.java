package unidad9FicherosDeTexto.Pruebas.BancoEj9;

import java.util.Date;

public class Cliente implements Comparable<Cliente>{

	private String dni;
	private String nombre;
	private String fecha;
	private double saldo;

	public Cliente(String dni, String nombre, String fecha, double saldo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fecha = fecha;
		this.saldo = saldo;
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

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", fecha=" + fecha + ", saldo=" + saldo + "]";
	}

	@Override
	public int compareTo(Cliente o) {
		return this.dni.compareTo(o.dni);
	}

}
