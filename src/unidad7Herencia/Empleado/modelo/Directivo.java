package unidad7Herencia.Empleado.modelo;

public class Directivo extends Empleado{

	
	public Directivo(String nombre) {
		super(nombre);
	}
	
	
	
	public String toString() {
		return "Directivo: " + getNombre();
	}
}
