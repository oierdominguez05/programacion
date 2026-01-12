package unidad6Clases.SintonizadorDigital.modelo;

public class Sintonizador {

	private double frecuencia;

	public Sintonizador(double frecuencia) {
		this.frecuencia = 80.0;
	}

	public double getSintonizador() {
		return frecuencia;
	}

	public void setSintonizador(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	public void subir() {
		frecuencia += 0.5;
		if (frecuencia > 108) {
			frecuencia = 80;
		}
	}

	public void bajar() {
		frecuencia -= 0.5;
		if (frecuencia < 80) {
			frecuencia = 108;
		}
	}

}
