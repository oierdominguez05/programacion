package unidad8Interfaces.ejRepasoFlotaVehiculos.modelo;

public enum Categoria {

	ligera(500f, 1f),
	mediana(1000f, 1.15f),
	pesada(2000f, 1.25f);
	
	private final float capacidadCarga;
	private final float suplemento;
	
	Categoria(float capacidadCarga, float suplemento) {
		
		this.capacidadCarga = capacidadCarga;
		this.suplemento = suplemento;
	}

	public float getCapacidadCarga() {
		return capacidadCarga;
	}

	public float getSuplemento() {
		return suplemento;
	}
}
