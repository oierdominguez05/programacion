package Examen1_2ªev.EmpresaAgroalimentaria.modelo;

public class Congelado extends Producto {

	private String fechaEnvasado;
	private String pais;
	private double temperatura;

	public Congelado(int fechaCad, int numLote, String fechaEnvasado, String pais, double temperatura) {
		super(fechaCad, numLote);
		this.fechaEnvasado = fechaEnvasado;
		this.pais = pais;
		this.temperatura = temperatura;
	}

	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

}
