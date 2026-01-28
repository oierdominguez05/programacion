package unidad7Herencia.CarreraCiclista.modelo;

public class Escalador extends Ciclista {

	private float aceleracion;
	private float gradosRampa;

	public Escalador(String nombreEquipo, String pais, float aceleracion, float gradosRampa) {
		super(nombreEquipo, pais);
		this.aceleracion = aceleracion;
		this.gradosRampa = gradosRampa;
	}

	public float getAceleracion() {
		return aceleracion;
	}

	public void setAceleracion(float aceleracion) {
		this.aceleracion = aceleracion;
	}

	public float getGradosRampa() {
		return gradosRampa;
	}

	public void setGradosRampa(float gradosRampa) {
		this.gradosRampa = gradosRampa;
	}

	@Override
	public String toString() {
		return "Escalador [aceleracion=" + aceleracion + ", gradosRampa=" + gradosRampa + "]";
	}

}
