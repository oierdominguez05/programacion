package unidad8Interfaces.Pruebas.FlotaVehiculo.modelo;

public enum Cambio {

	manual("Cambio manual", 1.23), automatico("Cambio automatico", 1.11);
	
	private final String descripcion;
	private final double suplemento;
	public String getDescripcion() {
		return descripcion;
	}
	public double getSuplemento() {
		return suplemento;
	}
	private Cambio(String descripcion, double suplemento) {
		this.descripcion = descripcion;
		this.suplemento = suplemento;
	}
	
	
	
	
}
