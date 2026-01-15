package unidad6Clases.ArticuloCientifico.modelo;

public class Articulo {

	private String nombreArt;
	private String autor;
	private String clave;
	private String nombrePublic;
	private int año;
	private String resumen;

	public Articulo(String nombreArt, String autor) {
		this.nombreArt = nombreArt;
		this.autor = autor;

	}

	public Articulo(String nombreArt, String autor, String clave, String nombrePublic, int año) {
		this(nombreArt, autor);
		this.clave = clave;
		this.nombrePublic = nombrePublic;
		this.año = año;
	}

	public Articulo(String nombreArt, String autor, String clave, String nombrePublic, int año, String resumen) {
		this(nombreArt, autor, clave, nombrePublic, año);
		this.resumen = resumen;
	}

	@Override
	public String toString() {
		return "Articulo nombreArt=" + nombreArt + ", autor=" + autor + ", clave=" + clave + ", nombrePublic="
				+ nombrePublic + ", año=" + año + ", resumen=" + resumen;
	}

	
	
	
	
}
