package unidad8Interfaces.ejRepasoFlotaVehiculos.modelo;

public abstract class Vehiculo implements Comparable<Object>{

	private final int id;
	private String marca;
	private String modelo;
	private int anioFabricacion;
	private float alquilerBase;
	
	public Vehiculo(int id, String marca, String modelo, int anioFabricacion, float alquilerBase) {

		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.anioFabricacion = anioFabricacion;
		this.alquilerBase = alquilerBase;
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

	public float getAlquilerBase() {
		return alquilerBase;
	}

	public void setAlquilerBase(float alquilerBase) {
		this.alquilerBase = alquilerBase;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		
		return "\n======================="
				+ "\nID: " + this.id
				+ "\nMarca: " + this.marca
				+ "\nModelo: " + this.modelo
				+ "\nAño de fabricación: " + this.anioFabricacion
				+ "\nAlquiler base: " + this.alquilerBase + "€";
	}
	
	@Override
	public int compareTo(Object o) {
		
		return ((Vehiculo)this).getId() - ((Vehiculo)o).getId();
	}
}
