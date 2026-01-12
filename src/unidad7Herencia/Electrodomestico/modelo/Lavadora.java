package unidad7Herencia.Electrodomestico.modelo;

public class Lavadora extends Electrodomestico {

	
	private int carga = 5;
	
	public Lavadora(double precio, String color, String[] consumo, double peso, int carga) {
		super(precio, color, consumo, peso);
		this.carga = carga;
	
	}
	
	
	
	
}
