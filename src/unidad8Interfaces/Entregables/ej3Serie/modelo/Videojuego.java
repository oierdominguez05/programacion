package unidad8Interfaces.Entregables.ej3Serie.modelo;

public class Videojuego implements Entregable{

	private String titulo;
	private float horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compañia;

	public Videojuego() {
		this.horasEstimadas = 10;
		this.entregado = false;
		this.titulo = "";
		this.genero = "";
		this.compañia = "";

	}

	public Videojuego(String titulo, float horasEstimadas) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = "";
		this.compañia = "";
		this.entregado = false;
	}

	public Videojuego(String titulo, float horasEstimadas, String genero, String compañia) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compañia = compañia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public float getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(float horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compañia=" + compañia + "]";
	}

	@Override
	public void entregar() {
		this.entregado = true;
		
	}

	@Override
	public void devolver() {
		this.entregado = false;
		
	}

	@Override
	public boolean isEntregado() {
		
		return entregado;
	}

	@Override
	public int compareTo(Object a) {
		Videojuego otro = (Videojuego) a;
		if(this.horasEstimadas > otro.getHorasEstimadas()) {
			return 1;
		} else if (this.horasEstimadas < otro.getHorasEstimadas()){
			return -1;
		} else {
			return 0;
		}
	}

	
	
}
