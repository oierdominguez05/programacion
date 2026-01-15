package Examen1_2ªev.EmpresaAgroalimentaria.modelo;

public class Refrigerado extends Producto {

	private int codOrganismo;
	private int fechaEnvasado;
	private String pais;
	private double temperatura;

	public Refrigerado(int fechaCad, int numLote, int codOrganismo, int fechaEnvasado, String pais,
			double temperatura) {
		super(fechaCad, numLote);
		this.codOrganismo = codOrganismo;
		this.fechaEnvasado = fechaEnvasado;
		this.pais = pais;
		this.temperatura = temperatura;
	}

	public int getCodOrganismo() {
		return codOrganismo;
	}

	public void setCodOrganismo(int codOrganismo) {
		this.codOrganismo = codOrganismo;
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

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

}
