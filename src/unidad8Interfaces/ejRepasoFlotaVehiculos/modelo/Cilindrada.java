package unidad8Interfaces.ejRepasoFlotaVehiculos.modelo;

public enum Cilindrada {

	cc50(0.95f),
	cc125(1.05f),
	cc250(1.15f);
	
	private final float suplemento;
	
	Cilindrada(float suplemento) {
		
		this.suplemento = suplemento;
	}
	
	public float getSuplemento() {
		
		return this.suplemento;
	}

}
