package Herencia.Poligono.modelo;

public class Triangulo extends Poligono {

	public Triangulo(double base, double altura) {
		super(base, altura);
	}

	public double area() {
		return (getBase() * getAltura()) / 2;
	}
}
