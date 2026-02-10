package Examenes.Examen2SegundaEv.Pregunta21.modelo;

public class Informativos implements Comparable <Envio> {

	private int codigo;
	private String origen;
	private String destino;
	private double peso;

	public Informativos(int codigo, String origen, String destino, double peso) {
		super();
		this.codigo = codigo;
		this.origen = origen;
		this.destino = destino;
		this.peso = peso;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
		return "Informativos [codigo=" + codigo + ", origen=" + origen + ", destino=" + destino + ", peso=" + peso
				+ "]";
	}

	@Override
	public int compareTo(Envio o) {
		return Integer.compare(this.codigo, o.getId());
	}

}
