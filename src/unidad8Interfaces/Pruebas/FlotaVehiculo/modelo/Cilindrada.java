package unidad8Interfaces.Pruebas.FlotaVehiculo.modelo;

public enum Cilindrada {

	cc50(1.23), cc125(1.45), cc500(1.11);

	private final double recargo;

	private Cilindrada(double recargo) {
		this.recargo = recargo;
	}

	public double getRecargo() {
		return recargo;
	}

}
