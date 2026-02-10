package unidad8Interfaces.Pruebas.GestionBiblioteca.modelo;

public class Libro extends Publicacion implements Prestamo {

	private String autor;
	private boolean prestado;

	public Libro(String titulo, int añoPublicacion, String autor, boolean prestado) {
		super(titulo, añoPublicacion);
		this.autor = autor;
		this.prestado = prestado;
	}

	@Override
	public void prestado() {
		prestado = true;

	}

	@Override
	public void devolver() {
		prestado = false;

	}

	@Override
	public void consultarEstado() {
	if(prestado) System.out.println("Esta prestado");
	if(!prestado)System.out.println("No esta prestado");

	}

}
