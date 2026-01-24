package unidad8Interfaces.ej6Scocio.modelo;

public class Socio implements Comparable<Socio> {

	private int id;
	private String nombre;

	public Socio(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	@Override
	public int compareTo(Socio otro) {
		return Integer.compare(this.id, otro.id);
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
