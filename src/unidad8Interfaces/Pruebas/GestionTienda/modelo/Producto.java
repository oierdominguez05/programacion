package unidad8Interfaces.Pruebas.GestionTienda.modelo;

import java.time.LocalDate;


public class Producto implements Comparable<Producto> {

	private int id;
	private String nombre;
	private double precio;
	Categoria categoria;
	private LocalDate fechaEntrada;

	public Producto(int id, String nombre, double precio, Categoria categoria, LocalDate fechaEntrada) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
		this.fechaEntrada = fechaEntrada;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public LocalDate getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(LocalDate fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	@Override
	public String toString() {
		return "Producto id= " + id + ", nombre= " + nombre + ", precio= " + precio + ", categoria= " + categoria
				+ ", fechaEntrada= " + fechaEntrada;
	}

	@Override
	public int compareTo(Producto o) {
		return this.fechaEntrada.compareTo(o.fechaEntrada);
	}

}
