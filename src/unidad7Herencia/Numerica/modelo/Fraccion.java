package unidad7Herencia.Numerica.modelo;

public class Fraccion extends Numerica {

	public Fraccion(double numerador, double denominador) {
		super(numerador, denominador);
		// TODO Auto-generated constructor stub

		Fraccion modelo = null;
		modelo.numericaSumar(numerador);

		modelo.numericaMultiplicar(numerador);
		modelo.numericaDividir(denominador);
		modelo.numericaRestar(denominador);

	}
}
