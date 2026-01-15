package unidad7Herencia.SeleccionDeFutbol.modelo;

public class Futbolista extends Seleccion {

	private int dorsal;
	private String demarcacion;
	public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion, int dorsal1, String demarcacion1) {
		super(id, nombre, apellido, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

	
	public void entrenar() {
		System.out.println("Esta entrenando: " + nombre);
	}
}
