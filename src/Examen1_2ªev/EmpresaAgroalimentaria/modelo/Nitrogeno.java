package Examen1_2ªev.EmpresaAgroalimentaria.modelo;

public class Nitrogeno extends Congelado {

	private double tiempoExposicion;

	public Nitrogeno(int fechaCad, int numLote, String fechaEnvasado, String pais, double temperatura,
			double tiempoExposicion) {
		super(fechaCad, numLote, fechaEnvasado, pais, temperatura);
		this.tiempoExposicion = tiempoExposicion;
	}

	public double getTiempoExposicion() {
		return tiempoExposicion;
	}

	public void setTiempoExposicion(double tiempoExposicion) {
		this.tiempoExposicion = tiempoExposicion;
	}

	
	
	
}
