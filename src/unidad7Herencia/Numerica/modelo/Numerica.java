package unidad7Herencia.Numerica.modelo;

public abstract class Numerica {

	
	
	private double numerador;
	private double denominador;
	
	
	
	
	
	public Numerica(double numerador, double denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public String toString(double numero) {
		return numero + "";
	}

	public boolean equals(Object ob) {
		return ob.equals(ob);
	}

	public double numericaSumar(double numerador2) {
		return numerador2 + numerador2;
	}

	public double numericaRestar(double numero) {
		return numero - numero;
	}

	public double numericaMultiplicar(double numerador2) {
		return numerador2 * numerador2;
	}

	public void numericaDividir(double denominador2) {
		return denominador2 / denominador2;
	}

}
