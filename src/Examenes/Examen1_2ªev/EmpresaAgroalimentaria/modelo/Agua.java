package Examen1_2ªev.EmpresaAgroalimentaria.modelo;

public class Agua extends Congelado {

	private double salinidad;

	public Agua(int fechaCad, int numLote, String fechaEnvasado, String pais, double temperatura, double salinidad) {
		super(fechaCad, numLote, fechaEnvasado, pais, temperatura);
		this.salinidad = salinidad;
	}

	public double getSalinidad() {
		return salinidad;
	}

	public void setSalinidad(double salinidad) {
		this.salinidad = salinidad;
	}

}
