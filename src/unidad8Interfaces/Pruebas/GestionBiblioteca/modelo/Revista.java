package unidad8Interfaces.Pruebas.GestionBiblioteca.modelo;

public class Revista extends Publicacion implements Prestamo {

	private int numero;
	private final boolean prestar = false;
	private boolean prestado;

	public Revista(String titulo, int añoPublicacion, int numero) {
		super(titulo, añoPublicacion);
		this.numero = numero;
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
		if(prestado)System.out.println("Esta prestado");
		if(!prestado)System.out.println("No esta prestado");
	}

}
