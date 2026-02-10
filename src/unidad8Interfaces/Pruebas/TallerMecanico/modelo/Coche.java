package unidad8Interfaces.Pruebas.TallerMecanico.modelo;

public class Coche extends Vehiculo implements Reparacion{

	private int numPuertas;

	public Coche(String matricula, String marca, double precio, Combustible combustible, int numPuertas) {
		super(matricula, marca, precio, combustible);
		this.numPuertas = numPuertas;
	}
	
	
	public void abrirmaletero() {
		System.out.println("Maletero abierto");
	}


	@Override
	public void reparar() {
	System.out.println("Reparando coche");
		
	}
}
