package unidad8Interfaces.GestionBiblioteca.modelo;

public class Libro extends Publicacion implements Prestamo {

	private String autor;
	private boolean estaPrestado;

	public Libro(String titulo, int anio, String autor) {
		super(titulo, anio);
		this.autor = autor;
		estaPrestado = false;
	}

	public boolean getEstaPrestado() {
		return estaPrestado;
	}

	@Override
	public void prestar() {
		this.estaPrestado = true;

	}

	@Override
	public void devolver() {
		this.estaPrestado = false;

	}

	@Override
	public boolean getEstadoPrestamo() {
		return estaPrestado;

	}

	@Override
	public String toString() {
		return super.toString() + "autor= " + autor + " Prestamo=" + estaPrestado;
	}
	
	

}
