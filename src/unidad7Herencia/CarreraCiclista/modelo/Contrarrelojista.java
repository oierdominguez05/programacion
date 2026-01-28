package unidad7Herencia.CarreraCiclista.modelo;

public class Contrarrelojista extends Ciclista{

	
	private double velocidadMaxima;

	public Contrarrelojista(String nombreEquipo, String pais, double velocidadMaxima) {
		super(nombreEquipo, pais);
		this.velocidadMaxima = velocidadMaxima;
	}

	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	@Override
	public String toString() {
		return "Contrarrelojista [velocidadMaxima=" + velocidadMaxima + "]";
	}
	
	
	
	
}
