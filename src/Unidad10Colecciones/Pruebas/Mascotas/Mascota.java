package Unidad10Colecciones.Pruebas.Mascotas;

public class Mascota implements Comparable<Mascota>{

	private String nombre;
	private String especie;
	private int edad;

	public Mascota(String nombre, String especie, int edad) {
		super();
		this.nombre = nombre;
		this.especie = especie;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return nombre + " , " + especie + " , " + edad;
	}

	@Override
	public int compareTo(Mascota o) {
		return Integer.compare(this.edad, o.edad);
	}

}
