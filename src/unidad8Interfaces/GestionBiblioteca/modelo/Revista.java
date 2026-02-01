package unidad8Interfaces.GestionBiblioteca.modelo;

public class Revista extends Publicacion{

	
	private String titulo;
	private int numero;
	
	public Revista(String titulo, int anio, int numero) {
		super(titulo, anio);
		this.numero = numero;
	}
	
	
}
