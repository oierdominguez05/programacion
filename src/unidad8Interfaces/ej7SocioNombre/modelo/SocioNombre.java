package unidad8Interfaces.ej7SocioNombre.modelo;

public class SocioNombre implements Comparable<SocioNombre> {

	private int id;
	private String nombre;

	public SocioNombre(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	@Override
	public int compareTo(SocioNombre otro) {
		return this.nombre.compareTo(otro.nombre);
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

	@Override
	public String toString() {
		return "Socio id= " + id + " nombre= " + nombre;
	}
	
	
	

}
