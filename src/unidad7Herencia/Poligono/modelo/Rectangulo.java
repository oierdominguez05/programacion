package unidad7Herencia.Poligono.modelo;

public class Rectangulo extends Poligono {

	public Rectangulo(double base, double altura) {
		super(base, altura);

	}

	public double area() {
		return (getBase() * getAltura());
	}
}
