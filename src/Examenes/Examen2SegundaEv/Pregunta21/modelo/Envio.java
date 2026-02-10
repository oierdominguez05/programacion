package Examenes.Examen2SegundaEv.Pregunta21.modelo;

public abstract class Envio {

	private int id;
	private String origen;
	private String destino;
	private double peso;
	private double precioBase;

	public Envio(int id, String origen, String destino, double peso) {
		super();
		this.id = id;
		this.origen = origen;
		this.destino = destino;
		this.peso = peso;
		this.precioBase = 6.66;
	}

	public int getId() {
		return id;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Envio [id=" + id + ", origen=" + origen + ", destino=" + destino + ", peso=" + peso + "]";
	}

}
