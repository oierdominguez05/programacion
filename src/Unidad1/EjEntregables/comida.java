package Unidad1.EjEntregables;

import java.util.Date;


public class comida {

	
	private int id;
	private String nombre;
	private float precio;
	private int tamaño;
	private Date fechaCaducidad;
	
	
	public comida() {
		
	}
	
	
	public comida(int id, String nombre, float precio, int tamaño, Date fechaCaducidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.tamaño = tamaño;
		this.fechaCaducidad = fechaCaducidad;
	
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


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	public int getTamaño() {
		return tamaño;
	}


	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}


	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}


	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	
	
	@Override
	public String toString() {
		return "comida [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", tamaño=" + tamaño
				+ ", fechaCaducidad=" + fechaCaducidad + "]";
	}


	public boolean equals(Object obj) {
		return this.id == ((comida) obj).getId() && this.nombre.equals(((comida) obj).getNombre());
				
				
	}
	
	
}
