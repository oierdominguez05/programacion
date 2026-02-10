package unidad8Interfaces.ejRepasoFlotaVehiculos.modelo;

public class Coche extends Vehiculo implements Alquilar{

	private int numPuertas;
	private Cambio cambio;
	private boolean alquilado;
	private int dias;
	
	public Coche(int id, String marca, String modelo, int anioFabricacion, float alquilerBase, int numPuertas,
			Cambio cambio) {
		
		super(id, marca, modelo, anioFabricacion, alquilerBase);
		this.numPuertas = numPuertas;
		this.cambio = cambio;
		this.alquilado = false;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public Cambio getCambio() {
		return cambio;
	}

	public void setCambio(Cambio cambio) {
		this.cambio = cambio;
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
		return super.getAlquilerBase() * this.cambio.getSuplemento() * dias;
	}

	@Override
	public boolean mostrarEstado() {
		return alquilado;
	}
	
	@Override
	public String toString() {
		
		return super.toString()
				+ "\nNúmero de puertas: " + this.numPuertas
				+ "\nTipo de cambio: " + this.cambio;
	}
}
