package unidad8Interfaces.Entregables.ej1Biblioteca.modelo;

public class Libro extends Publicacion implements Prestable {

	private boolean prestado;

	public Libro(double codISBN, String titulo, int anioPublicacion) {
		super(codISBN, titulo, anioPublicacion);
		this.prestado = false;
	}

	public boolean estaPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	@Override
	public void presta() {
		System.out.println("Libro prestado");

	}

	@Override
	public void devuelve() {
	System.out.println("Libro devuelto");

	}

}
