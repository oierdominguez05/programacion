package unidad8Interfaces.Ej9EdadCreciente.modelo;

public class SocioEdadCreciente implements Comparable<SocioEdadCreciente> {

	private int id;
	private String nombre;
	private int edad;

	public SocioEdadCreciente(int id, String nombre, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public int compareTo(SocioEdadCreciente otro) {
		return Integer.compare(edad, otro.edad);
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "SocioEdadCreciente id= " + id + " nombre= " + nombre + " edad= " + edad;
	}

}
