package unidad7Herencia.Hora.modelo;

public class Hora {

	
	
	private double hora;
	private double minuto;
	
	
	
	public Hora(double hora, double minuto) {
		super();
		this.hora = hora;
		this.minuto = minuto;
	}



	public double getHora() {
		return hora;
	}



	public void setHora(double hora) {
		this.hora = hora;
	}



	public double getMinuto() {
		return minuto;
	}



	public void setMinuto(double minuto) {
		this.minuto = minuto;
	}
	
	
	public void incremento () {
		minuto++;
	}
	
	public void addHora() {
		hora++;
	}
}
