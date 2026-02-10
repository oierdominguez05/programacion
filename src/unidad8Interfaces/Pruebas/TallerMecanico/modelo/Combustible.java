package unidad8Interfaces.Pruebas.TallerMecanico.modelo;

public enum Combustible {

	diesel(1.20), gasolina(1.36), electrico(0.60);

	private  double costeExtra;

	private Combustible(double costeExtra) {
		this.costeExtra = costeExtra;
	}

	public double getCosteExtra() {
		return costeExtra;
	}

	
	
	
	
}
