package unidad8Interfaces.ej5Supermercado.modelo;

public class Vino implements Productos, ConDescuento {

	private String tipoVino;
	private double gradosAlcohol;

	public Vino(String tipoVino, double gradosAlcohol) {
		super();
		this.tipoVino = tipoVino;
		this.gradosAlcohol = gradosAlcohol;
	}

	public double calcularCalorias() {
		return gradosAlcohol * 10;
	}
	
	
	@Override
	public String marca() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double precio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setDescuento(double des) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getDescuento() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPrecioDescuento() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Vino [tipoVino=" + tipoVino + ", gradosAlcohol=" + gradosAlcohol + "]";
	}

	
	
	
}
