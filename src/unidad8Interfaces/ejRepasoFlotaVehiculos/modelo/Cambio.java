package unidad8Interfaces.ejRepasoFlotaVehiculos.modelo;

public enum Cambio {

	manual("cambio manual", 0.95f),
	automatico("cambio automático", 1.05f);
	
	private final String descripcion;
	private final float suplemento;
	
	Cambio(String descripcion, float suplemento) {
		
		this.descripcion = descripcion;
		this.suplemento = suplemento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public float getSuplemento() {
		return suplemento;
	}
}
