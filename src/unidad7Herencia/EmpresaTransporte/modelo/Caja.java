package unidad7Herencia.EmpresaTransporte.modelo;

public class Caja {

	
	private int ancho;
	private int alto;
	private int fondo;
	private String unidad;
	
	
	public Caja(int ancho, int alto, int fondo, String unidad) {
		super();
		this.ancho = ancho;
		this.alto = alto;
		this.fondo = fondo;
		this.unidad = unidad;
	}


	public int getAncho() {
		return ancho;
	}


	public void setAncho(int ancho) {
		this.ancho = ancho;
	}


	public int getAlto() {
		return alto;
	}


	public void setAlto(int alto) {
		this.alto = alto;
	}


	public int getFondo() {
		return fondo;
	}


	public void setFondo(int fondo) {
		this.fondo = fondo;
	}


	public String getUnidad() {
		return unidad;
	}


	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	
	public double getVolumen() {
		double volumen = alto * fondo * ancho;
		return volumen;
	}
	
	
}
