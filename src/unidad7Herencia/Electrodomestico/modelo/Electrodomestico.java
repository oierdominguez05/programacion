package unidad7Herencia.Electrodomestico.modelo;

public class Electrodomestico extends Object {

	private double precio;
	private String color;

	private double peso;

	public Electrodomestico(double precio, String color, double peso) {
		super();
		this.precio = precio;
		this.color = color;
		this.peso = peso;
	}

	
	
	
	public boolean comprobarColor(String color) {
		if (color.equals("azul") || color.equals("verde") || color.equals("rojo") || color.equals("amarillo") || color.equals("naranja")) {
			return true;
		}
		return false;		
	}
	
	public void precioFinal() {
		
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String[] getConsumo() {
		return consumo;
	}

	public void setConsumo(String[] consumo) {
		this.consumo = consumo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}




	@Override
	public String toString() {
		return "Electrodomestico [precio=" + precio + ", color=" + color + ", peso=" + peso + "]";
	}

	
	
	
}
