package Unidad11JDBC.Examen.Pregunta21;

public class Libro {

	private String isbn;
	private String titulo;
	private int año;
	private boolean disponible;

	public Libro(String isbn, String titulo, int año, boolean disponible) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.año = año;
		this.disponible = disponible;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", año=" + año + ", disponible=" + disponible + "]";
	}

}
