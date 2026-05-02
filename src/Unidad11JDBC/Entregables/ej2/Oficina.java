package Unidad11JDBC.Entregables.ej2;

public class Oficina {

	private int oficina;
	private String ciudad;
	private double superficie;
	private double ventas;

	public Oficina(int oficina, String ciudad, double superficie, double ventas) {
		super();
		this.oficina = oficina;
		this.ciudad = ciudad;
		this.superficie = superficie;
		this.ventas = ventas;
	}

	public int getOficina() {
		return oficina;
	}

	public void setOficina(int oficina) {
		this.oficina = oficina;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public double getVentas() {
		return ventas;
	}

	public void setVentas(double ventas) {
		this.ventas = ventas;
	}

	@Override
	public String toString() {
		return "Oficina= " + oficina + " ciudad= " + ciudad + " superficie= " + superficie + " ventas= "
				+ ventas ;
	}

	
	
}
