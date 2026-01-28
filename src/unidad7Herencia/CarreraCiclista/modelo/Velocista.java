package unidad7Herencia.CarreraCiclista.modelo;

public class Velocista extends Ciclista {

	private double potencia;
	private double velocidadSprint;

	public Velocista(String nombreEquipo, String pais, double potencia, double velocidadSprint) {
		super(nombreEquipo, pais);
		this.potencia = potencia;
		this.velocidadSprint = velocidadSprint;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public double getVelocidadSprint() {
		return velocidadSprint;
	}

	public void setVelocidadSprint(double velocidadSprint) {
		this.velocidadSprint = velocidadSprint;
	}

	@Override
	public String toString() {
		return "Velocista [potencia=" + potencia + ", velocidadSprint=" + velocidadSprint + "]";
	}

	
	
}
