package Examenes.Examen2SegundaEv.Pregunta23.modelo;

public class Producto implements CalcularProducto{

	private String nombre;
	private float precio;

	public Producto(String nombre, float precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
	}

	@Override
	public void calcular(int cantidad) {
		double operacion = precio * cantidad;
		
	}

}
