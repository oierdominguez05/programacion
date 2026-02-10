package unidad8Interfaces.Pruebas.GestionBiblioteca.modelo;

public class Publicacion {

	private String titulo;
	private int añoPublicacion;

	public Publicacion(String titulo, int añoPublicacion) {
		super();
		this.titulo = titulo;
		this.añoPublicacion = añoPublicacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}

}
