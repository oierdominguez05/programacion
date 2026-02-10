package unidad8Interfaces.ejRepasoFlotaVehiculos.modelo;

public class Moto extends Vehiculo implements Alquilar{

	private Cilindrada cilindrada;
	private boolean alquilado;
	private int dias;

	public Moto(int id, String marca, String modelo, int anioFabricacion, float alquilerBase, Cilindrada cilindrada) {
		
		super(id, marca, modelo, anioFabricacion, alquilerBase);
		this.cilindrada = cilindrada;
		this.alquilado = false;
	}

	public Cilindrada getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(Cilindrada cilindrada) {
		this.cilindrada = cilindrada;
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
		return super.getAlquilerBase() * this.cilindrada.getSuplemento() * dias;
	}

	@Override
	public boolean mostrarEstado() {
		return alquilado;
	}
	
	@Override
	public String toString() {
		
		return super.toString()
				+ "\nCilindrada: " + this.cilindrada;
	}
}
