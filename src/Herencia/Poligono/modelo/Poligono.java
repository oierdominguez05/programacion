package Herencia.Poligono.modelo;

public abstract class Poligono {

	private double base;
	private double altura;

	public Poligono(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public abstract double area();

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
