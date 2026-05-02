package Unidad10Colecciones.Pruebas.TemperaturasEj10;

import java.io.Serializable;
import java.time.LocalTime;

public class Temperatura implements Serializable {

	private double temperatura;
	private LocalTime hora;

	public Temperatura(double temperatura, LocalTime hora) {
		super();
		this.temperatura = temperatura;
		this.hora = hora;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return temperatura + " ,  " + hora;
	}

}
