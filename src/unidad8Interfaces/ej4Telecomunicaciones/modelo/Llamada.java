package unidad8Interfaces.ej4Telecomunicaciones.modelo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Llamada implements Comparable <Llamada> {

	private String telefono;
	private String numInterlocutor;
	private boolean llamadaSaliente;
	private LocalDate fechaLlamada;
	private LocalTime inicioLlamada;
	private LocalTime finLlamada;
	private Interlocutor zona;

	public Llamada(String telefono, String numInterlocutor, boolean llamadaSaliente, LocalDate fechaLlamada,
			LocalTime inicioLlamada, LocalTime finLlamada, Interlocutor zona) {

		this.telefono = telefono;
		this.numInterlocutor = numInterlocutor;
		this.llamadaSaliente = llamadaSaliente;
		this.fechaLlamada = fechaLlamada;
		this.inicioLlamada = inicioLlamada;
		this.finLlamada = finLlamada;
		this.zona = zona;
	}

	public int compareTo(Llamada otra) {
		int comp = this.telefono.compareTo(otra.telefono);
		if (comp == 0) {
			LocalDateTime date1 = LocalDateTime.of(this.fechaLlamada, this.inicioLlamada);
			LocalDateTime date2 = LocalDateTime.of(otra.fechaLlamada, otra.inicioLlamada);
			return date1.compareTo(date2);
		}
		return comp;
	}

	public double duracionLlamada() {
		LocalDateTime inicio = LocalDateTime.of(fechaLlamada, finLlamada);
		LocalDateTime fin = LocalDateTime.of(fechaLlamada, finLlamada);
		return Duration.between(inicio, fin).toMinutes();
	}

	public double coste() {
		if (llamadaSaliente == false) {
			return 0;
		}
		return duracionLlamada() * zona.getTarifa() / 100;
	}

	@Override
	public String toString() {
		return "Llamada [telefono=" + telefono + ", numInterlocutor=" + numInterlocutor + ", llamadaSaliente="
				+ llamadaSaliente + ", fechaLlamada=" + fechaLlamada + ", inicioLlamada=" + inicioLlamada
				+ ", finLlamada=" + finLlamada + ", zona=" + zona + "]";
	}

	
	
	
	
}
