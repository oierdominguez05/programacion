package unidad8Interfaces.Pruebas.TallerMecanico.modelo;

public class Moto extends Vehiculo implements Reparacion{

	private int cilindrada;

	public Moto(String matricula, String marca, double precio, Combustible combustible, int cilindrada) {
		super(matricula, marca, precio, combustible);
		this.cilindrada = cilindrada;
	}
	
	public void hacercaballito() {
		System.out.println("Haciendo caballito");
	}

	@Override
	public void reparar() {
		System.out.println("Reparando moto");
		
	}
	
}
