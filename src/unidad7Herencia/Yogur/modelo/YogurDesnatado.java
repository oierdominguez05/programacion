package unidad7Herencia.Yogur.modelo;

public class YogurDesnatado extends Yogur {

	public double getCalorias() {
		return super.getCalorias() / 2;
	}
}
