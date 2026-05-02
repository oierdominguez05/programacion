package unidad9FicherosDeTexto.Pruebas.GestionDeStock;

import java.util.Comparator;

public class Producto {

	private String codigo;
	private String nombre;
	private double precio;
	private int stock;

	public Producto(String codigo, String nombre, double precio, int stock) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}

	@Override
	public String toString() {
		return codigo + ";" + nombre + ";" + precio + ";" + stock;
	}

	public boolean equals(Object o) {
		return (o instanceof Producto p) && this.codigo.equals(p.codigo);
	}

	public int hasCode() {
		return codigo.hashCode();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	

}
