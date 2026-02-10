package Examenes.Examen2SegundaEv.Pregunta21.modelo;

public enum TipoEnvio {

	ECONOMICO(1.10), ESTANDAR(1.25), URGENTE(1.50);
	
	

	public final double multiplicador;
	
	

	TipoEnvio(double multiplicador) {
		this.multiplicador = multiplicador;
	}
	
	public double getMultiplicador() {
		return multiplicador;
	}
	
}
