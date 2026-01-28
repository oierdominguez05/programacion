package unidad7Herencia.Inmuebles.modelo;

public class Rural extends Casas {

	private double distanciaCabecera;
	private double altitudMar;
	
	
	public Rural(double distanciaCabecera, double altitudMar, int cantPisos) {
		super(cantPisos);
		this.distanciaCabecera = distanciaCabecera;
		this.altitudMar = altitudMar;
	}
	
	
	
}
