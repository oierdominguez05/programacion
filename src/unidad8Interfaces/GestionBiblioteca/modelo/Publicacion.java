package unidad8Interfaces.GestionBiblioteca.modelo;

public abstract class Publicacion {

	
	private String titulo;
	private int anio;
	
	public Publicacion(String titulo, int anio) {
		this.titulo = titulo;
		this.anio = anio;
	}

	@Override
	public String toString() {
		return "Publicacion [titulo=" + titulo + ", anio=" + anio + "]";
	}
	
	
	
	public int getAnio() {
		return anio;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
}
