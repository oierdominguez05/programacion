package unidad8Interfaces.Pruebas.FlotaVehiculo.modelo;

public class Vehiculo {

	private int id;
	private String marca;
	private String modelo;
	private int anioFabricacion;
	private double precioBaseAlquiler;

	public Vehiculo(int id, String marca, String modelo, int anioFabricacion) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.anioFabricacion = anioFabricacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public double getPrecioBaseAlquiler() {
		return precioBaseAlquiler;
	}

	public void setPrecioBaseAlquiler(double precioBaseAlquiler) {
		this.precioBaseAlquiler = precioBaseAlquiler;
	}

	@Override
	public String toString() {
		return "Vehiculo id= " + id + ", marca= " + marca + ", modelo= " + modelo + ", anioFabricacion= "
				+ anioFabricacion + ", precioBaseAlquiler= " + precioBaseAlquiler;
	}

	

}
