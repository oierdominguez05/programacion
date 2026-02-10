package unidad8Interfaces.Pruebas.FlotaVehiculo.modelo;

public class Coches extends Vehiculo implements Alquilar {

	private int numPuertas;
	Cambio cambio;
	private boolean alquilado;
	private int dias;

	public Coches(int id, String marca, String modelo, int anioFabricacion, int numPuertas,
			Cambio cambio) {
		super(id, marca, modelo, anioFabricacion);
		this.numPuertas = numPuertas;
		this.cambio = cambio;
		this.alquilado = false;
	}

	@Override
	public void alquilar() {
		alquilado = true;

	}

	@Override
	public void entregar() {
		alquilado = false;

	}

	@Override
	public double calcularPrecio(int dias) {
		this.dias = dias;
		return super.getPrecioBaseAlquiler() * this.cambio.getSuplemento() * dias;

	}

	@Override
	public boolean mostrarEstado() {
		return alquilado;

	}

	@Override
	public String toString() {
		return super.toString() + "Coches numPuertas= " + numPuertas + ", cambio= " + cambio + ", alquilado= " + alquilado + ", dias= "
				+ dias;
	}
	
	

}
