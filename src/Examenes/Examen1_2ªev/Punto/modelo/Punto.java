package Examenes.Examen1_2ªev.Punto.modelo;

public class Punto {

	private double x;
	private double y;

	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	public void desplazaX(double dx) {
		x += dx;
	}
	
	public void desplazaY(double dy) {
		y += dy;
	}
	
	public void desplaza(double dx, double dy) {
		x += dx;
		y += dy;
	}
	
	public double distanciaEuclidea(Punto otro) {
		return (((x * 2 - x * 1) * 2) + ((y * 2 - y * 1) * 2));
	}
	
	

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}


	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

}
