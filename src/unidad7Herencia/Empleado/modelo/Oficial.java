package unidad7Herencia.Empleado.modelo;

public class Oficial extends Operario {

	public Oficial(String nombre) {
		super(nombre);
		
	}
	
	public String toString() {
		return "Oficial: " + getNombre();
	}
	
}
