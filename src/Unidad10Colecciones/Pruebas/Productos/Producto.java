package Unidad10Colecciones.Pruebas.Productos;

public class Producto implements Comparable<Producto>{

	private String nombre;
	private String categoria;
	private String precio;

	public Producto(String nombre, String categoria, String precio) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto nombre= " + nombre + ", categoria= " + categoria + ", precio= " + precio;
	}

	@Override
	public int compareTo(Producto o) {
		return this.precio.compareTo(o.precio);
	}

}
