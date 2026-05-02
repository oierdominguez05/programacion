package Unidad10Colecciones.EjerciciosClase.ej12;

public class Academico implements Comparable<Academico> {

	private String nombre;
	private int anioIngreso;
	

	public Academico(String nombre, int anioIngreso) {
		super();
		this.nombre = nombre;
		this.anioIngreso = anioIngreso;
	}

	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnioIngreso() {
		return anioIngreso;
	}

	public void setAnioIngreso(int anioIngreso) {
		this.anioIngreso = anioIngreso;
	}



	@Override
	public int compareTo(Academico o) {
		return this.nombre.compareTo(o.nombre);
	}



	@Override
	public String toString() {
		return nombre + ";" + anioIngreso;
	}
	
	

}
