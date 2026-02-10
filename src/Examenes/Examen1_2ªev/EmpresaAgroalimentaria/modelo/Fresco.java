package Examen1_2ªev.EmpresaAgroalimentaria.modelo;

public class Fresco extends Producto {

	private int fechaEnvasado;
	private String pais;

	public Fresco(int fechaCad, int numLote, int fechaEnvasado, String pais) {
		super(fechaCad, numLote);
		this.fechaEnvasado = fechaEnvasado;
		this.pais = pais;
	}

	public int getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(int fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

}
