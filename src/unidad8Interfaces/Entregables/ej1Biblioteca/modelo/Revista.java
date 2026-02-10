package unidad8Interfaces.Entregables.ej1Biblioteca.modelo;

public class Revista extends Publicacion {

	
	
	private double numero;
	
	public Revista(double codISBN, String titulo, int anioPublicacion, double numero) {
		super(codISBN, titulo, anioPublicacion);
		this.numero = numero;
	}

}
