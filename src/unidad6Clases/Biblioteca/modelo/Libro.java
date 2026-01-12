package unidad6Clases.Biblioteca.modelo;

public class Libro {

	private String tituloLibro;
	private String autor;
	private int numEjemplares;
	private int numEjemplaresPrestados;

	public Libro(String tituloLibro, String autor, int numEjemplares, int numEjemplaresPrestados) {
		super();
		this.tituloLibro = tituloLibro;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		this.numEjemplaresPrestados = numEjemplaresPrestados;
	}

	public String getTituloLibro() {
		return tituloLibro;
	}

	public void setTituloLibro(String tituloLibro) {
		this.tituloLibro = tituloLibro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumEjemplares() {
		return numEjemplares;
	}

	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}

	public int getNumEjemplaresPrestados() {
		return numEjemplaresPrestados;
	}

	public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
		this.numEjemplaresPrestados = numEjemplaresPrestados;
	}

	public boolean prestamo() {
		if (numEjemplaresPrestados < numEjemplares) {
			numEjemplaresPrestados++;
			return true;
		} else {
			return false;
		}
	}

	public boolean devolucion() {
		if (numEjemplaresPrestados > 0) {
			numEjemplares--;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Libro [tituloLibro=" + tituloLibro + ", autor=" + autor + ", numEjemplares=" + numEjemplares
				+ ", numEjemplaresPrestados=" + numEjemplaresPrestados + "]";
	}

	
	public void mostrar() {
		System.out.println(getTituloLibro());
		System.out.println(getAutor());
		System.out.println(getNumEjemplares());
		System.out.println(getNumEjemplaresPrestados());
		System.out.println("Prestamo: " + prestamo());
		System.out.println("Devolucion: " + devolucion());

	}
	
	
}
