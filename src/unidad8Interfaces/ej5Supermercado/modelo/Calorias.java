package unidad8Interfaces.ej5Supermercado.modelo;

public enum Calorias {

	ESPELTA(5), MAIZ(8), TRIGO(12), OTRO(15);

	private final int calorias;
	
	Calorias(int calorias) {
		this.calorias = calorias;
	}
}
