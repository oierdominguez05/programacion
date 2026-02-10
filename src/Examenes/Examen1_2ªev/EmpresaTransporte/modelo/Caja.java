package Examenes.Examen1_2ªev.EmpresaTransporte.modelo;
import Examen1_2ªev.EmpresaTransporte.modelo.Unidad;

public final class Caja {

	
	
	private double ancho;
	private double alto;
	private double fondo;
	private String etiqueta;
	
	public Caja(double ancho, double alto, double fondo, Unidad unidad) {
		if(unidad.CM != null) {
			this.ancho = ancho / 100;
			this.alto = alto / 100;
			this.fondo = fondo / 100;
		} else if (unidad.M != null) {
			this.ancho = ancho;
			this.alto = alto;
			this.fondo = fondo;
		}
		
	}
	
	
	public double getVolumen() {
		return ancho * alto * fondo;
	}
	
	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}


	@Override
	public String toString() {
		return "Caja ancho= " + ancho + ", alto= " + alto + ", fondo= " + fondo + ", etiqueta= " + etiqueta;
	}
	
	
	
	
}
