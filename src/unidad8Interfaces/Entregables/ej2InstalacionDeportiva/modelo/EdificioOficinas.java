package unidad8Interfaces.Entregables.ej2InstalacionDeportiva.modelo;

public class EdificioOficinas implements Edificio {

	private double superficie;
	private double numeroOficinas;

	public EdificioOficinas(double superficie, double numeroOficinas) {
		super();
		this.superficie = superficie;
		this.numeroOficinas = numeroOficinas;
	}

	public double getSuperficie() {
		return superficie;
	}

	public double getNumeroOficinas() {
		return numeroOficinas;
	}

	@Override
	public double getSuperficieEdificio() {
		return superficie;
		// TODO Auto-generated method stub

	}

}
