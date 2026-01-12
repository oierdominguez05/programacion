package unidad7Herencia.Empleado.modelo;

public class Tecnico extends Operario {

	
	public Tecnico(String nombre) {
		super(nombre);
	}
	
	
	
	public String toString() {
		return "Tecnico: " + getNombre();
	}
}
