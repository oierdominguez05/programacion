package unidad8Interfaces.Pruebas.FlotaVehiculo.modelo;

public enum Capacidad {

	pesada(1.45), mediana(2.04), ligera(2.24);

	private final double suplemento;

	private Capacidad(double suplemento) {
		this.suplemento = suplemento;
	}

	public double getPesoKg() {
		return suplemento;
	}

	public double getSuplemento() {
		return suplemento;
	}

}
