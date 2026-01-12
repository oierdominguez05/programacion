package unidad7Herencia.BiciExpress.modelo;

public class CajaCarton extends Caja {

	public CajaCarton(double altoCm, double anchoCm, double fondoCm) {
		super(altoCm / 100, anchoCm / 100, fondoCm / 100);
	}

	public double getVolumen() {
		return super.getVolumen() * 0.80;

	}

	public double getSuperficieCarton() {
		double a = ancho;
		double b = alto;
		double c = fondo;
		return 2 * (a * b + b * c + a * c);
	}

	@Override
	public String toString() {
		return "Caja: " + ancho + " m " + alto + " m " + fondo;
	}
}
