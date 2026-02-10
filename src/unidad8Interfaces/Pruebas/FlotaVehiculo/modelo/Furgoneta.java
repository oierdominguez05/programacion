package unidad8Interfaces.Pruebas.FlotaVehiculo.modelo;

public class Furgoneta extends Vehiculo implements Alquilar {

	
	Capacidad capacidad;
	private boolean alquilado;


	public Furgoneta(int id, String marca, String modelo, int anioFabricacion,
			Capacidad capacidad) {
		super(id, marca, modelo, anioFabricacion);
		this.capacidad = capacidad;
	}

	public Capacidad getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Capacidad capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public void alquilar() {
		if (alquilado) { System.out.println("La furgoneta ya está alquilada.");
		} else {
			alquilado = true; System.out.println("Furgoneta alquilada correctamente."); }
		
	}

	@Override
	public void entregar() {
		if (!alquilado) { System.out.println("La furgoneta no estaba alquilada.");
		} else { 
			alquilado = false;
			System.out.println("Furgoneta devuelta correctamente."); }
		
		
	}

	@Override public double calcularPrecio(int dias) {
		return (getPrecioBaseAlquiler() + capacidad.getSuplemento()) * dias; }

	@Override
	public boolean mostrarEstado() {
		return alquilado;
		
	}

	@Override
	public String toString() {
		return super.toString() + "Furgoneta capacidad= " + capacidad + ", alquilado= " + alquilado;
	}
	
	
	
	
	
}
