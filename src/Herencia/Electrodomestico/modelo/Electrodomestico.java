package Herencia.Electrodomestico.modelo;

public class Electrodomestico {

	private double precio;
	private String color;
	private String[] consumo = { "A", "B", "C", "D", "E", "F" };
	private double peso;

	public Electrodomestico(double precio, String color, String[] consumo, double peso) {
		super();
		this.precio = precio;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
	}

	public String comprobarConsumoEnergetico(String letra) {
		for (int i = 0; i < consumo.length; i++) {
			if (consumo[i].equals(letra)) {
				return consumo[i];
			}
		}
		return "No hay letra";
	}
	
	
	public boolean comprobarColor(String color) {
		
				
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

}
