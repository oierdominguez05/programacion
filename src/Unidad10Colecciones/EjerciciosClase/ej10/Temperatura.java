package Unidad10Colecciones.EjerciciosClase.ej10;

import java.time.LocalTime;

public class Temperatura {

	private double temp;
	private LocalTime hora;
	public Temperatura(double temp, LocalTime hora) {
		super();
		this.temp = temp;
		this.hora = hora;
	}
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	@Override
	public String toString() {
		return temp + "," + hora;
	}
	
	
	
	
}
