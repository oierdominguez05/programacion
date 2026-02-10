package unidad8Interfaces.Pruebas.FlotaVehiculo.modelo;

public class Motos extends Vehiculo {

	Cilindrada cilindrada;

	public Motos(int id, String marca, String modelo, int anioFabricacion, Cilindrada cilindrada) {
		super(id, marca, modelo, anioFabricacion);
		this.cilindrada = cilindrada;
	}

	public Cilindrada getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(Cilindrada cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return super.toString() + "Motos cilindrada= " + cilindrada;
	}

	
	
}
