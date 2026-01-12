package unidad7Herencia.BiciExpress.modelo;

public class Caja {

	protected double alto;
	protected double ancho;
	protected double fondo;

	public Caja(double alto, double ancho, double fondo) {
		super();
		this.alto = alto;
		this.ancho = ancho;
		this.fondo = fondo;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getFondo() {
		return fondo;
	}

	public void setFondo(double fondo) {
		this.fondo = fondo;
	}

	public double getVolumen() {
		return fondo * alto * ancho;
	}

	@Override
	public String toString() {
		return "Caja alto=" + alto + " x " + ancho + " x " + fondo;
	}

}
