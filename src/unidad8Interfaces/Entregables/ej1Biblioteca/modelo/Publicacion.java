package unidad8Interfaces.Entregables.ej1Biblioteca.modelo;

public class Publicacion {

	protected double codigoISBN;
	private String titulo;
	private int anioPublicacion;

	public Publicacion(double codigoISBN, String titulo, int anioPublicacion) {
		super();
		this.codigoISBN = codigoISBN;
		this.titulo = titulo;
		this.anioPublicacion = anioPublicacion;
	}

	public double getCodISBN() {
		return codigoISBN;
	}

	public void setCodISBN(double codigoISBN) {
		this.codigoISBN = codigoISBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	
	
	
}
