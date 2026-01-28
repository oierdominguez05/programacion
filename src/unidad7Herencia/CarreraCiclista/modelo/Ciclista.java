package unidad7Herencia.CarreraCiclista.modelo;

public abstract class Ciclista extends Equipo {

	public Ciclista(String nombreEquipo, String pais) {
		super(nombreEquipo, pais);
		
	}
	
	private int id;
	private String nombre;
	private double tiempo = 0;
	
	public abstract String imprimirTipo() {
		return "Es un: ";
	}
	

}
