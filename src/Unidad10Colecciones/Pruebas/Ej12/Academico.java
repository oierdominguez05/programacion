package Unidad10Colecciones.Pruebas.Ej12;

public class Academico implements Comparable<Academico> {

	private String nombre;
	private int añoIngreso;

	public Academico(String nombre, int añoIngreso) {
		super();
		this.nombre = nombre;
		this.añoIngreso = añoIngreso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAñoIngreso() {
		return añoIngreso;
	}

	public void setAñoIngreso(int añoIngreso) {
		this.añoIngreso = añoIngreso;
	}

	@Override
	public String toString() {
		return "Academico nombre= " + nombre + ", añoIngreso= " + añoIngreso;
	}

	@Override
	public int compareTo(Academico o) {
		return this.nombre.compareTo(o.nombre);
	}

}
