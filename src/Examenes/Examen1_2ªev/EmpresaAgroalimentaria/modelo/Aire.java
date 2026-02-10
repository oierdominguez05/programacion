package Examen1_2ªev.EmpresaAgroalimentaria.modelo;

public class Aire extends Congelado {

	private double porcNitrogeno;
	private double porcOxigeno;
	private double porcDioxidoCarbono;
	private double porcVaporAgua;

	public Aire(int fechaCad, int numLote, String fechaEnvasado, String pais, double temperatura, double porcNitrogeno,
			double porcOxigeno, double porcDioxidoCarbono, double porcVaporAgua) {
		super(fechaCad, numLote, fechaEnvasado, pais, temperatura);
		this.porcNitrogeno = porcNitrogeno;
		this.porcOxigeno = porcOxigeno;
		this.porcDioxidoCarbono = porcDioxidoCarbono;
		this.porcVaporAgua = porcVaporAgua;
	}

	public double getPorcNitrogeno() {
		return porcNitrogeno;
	}

	public void setPorcNitrogeno(double porcNitrogeno) {
		this.porcNitrogeno = porcNitrogeno;
	}

	public double getPorcOxigeno() {
		return porcOxigeno;
	}

	public void setPorcOxigeno(double porcOxigeno) {
		this.porcOxigeno = porcOxigeno;
	}

	public double getPorcDioxidoCarbono() {
		return porcDioxidoCarbono;
	}

	public void setPorcDioxidoCarbono(double porcDioxidoCarbono) {
		this.porcDioxidoCarbono = porcDioxidoCarbono;
	}

	public double getPorcVaporAgua() {
		return porcVaporAgua;
	}

	public void setPorcVaporAgua(double porcVaporAgua) {
		this.porcVaporAgua = porcVaporAgua;
	}

}
