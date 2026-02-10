package unidad8Interfaces.ejRepasoFlotaVehiculos.modelo;

public class Furgoneta extends Vehiculo implements Alquilar{

	private Categoria categoria;
	private boolean alquilado;
	private int dias;

	public Furgoneta(int id, String marca, String modelo, int anioFabricacion, float alquilerBase,
			Categoria categoria) {
		
		super(id, marca, modelo, anioFabricacion, alquilerBase);
		this.categoria = categoria;
		this.alquilado = false;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	@Override
	public void alquilar() {
		this.alquilado = true;
	}

	@Override
	public void entregar() {
		this.alquilado = false;
	}

	@Override
	public float calcularPrecio(int dias) {
		
		this.dias = dias;
		return super.getAlquilerBase() * this.categoria.getSuplemento() * dias;
	}

	@Override
	public boolean mostrarEstado() {
		return alquilado;
	}
	
	@Override
	public String toString() {
		
		return super.toString()
				+ "\nCategoría: " + this.categoria
				+ "\nCapacidad de carga: " + this.categoria.getCapacidadCarga() + "Kg";
	}
}
