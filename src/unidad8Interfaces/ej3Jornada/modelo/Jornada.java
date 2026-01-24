package unidad8Interfaces.ej3Jornada.modelo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Jornada {

	private String dni;
	private LocalDate fecha;
	private LocalTime horaEntrada;
	private LocalTime horaSalida;

	public Jornada(String dni, LocalDate fecha, LocalTime horaEntrada, LocalTime horaSalida) {
		super();
		this.dni = dni;
		this.fecha = fecha;
		this.horaEntrada = horaEntrada;
		this.horaSalida = horaSalida;
	}

	// calcular minutos

	public double minutosTrabajados() {
		return Duration.between(horaEntrada, horaSalida).toMinutes();
	}

	// orden primero dni y luego fecha

	public int compareTo(Jornada otra) {
		int comp = this.dni.compareTo(otra.dni);
		if (comp == 0) {
			return this.fecha.compareTo(otra.fecha);
		}
		return comp;
	}
	
	
	
	

	@Override
	public String toString() {
		return "Jornada [dni=" + dni + ", fecha=" + fecha + ", horaEntrada=" + horaEntrada + ", horaSalida="
				+ horaSalida + "]";
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public LocalDate getFechaEntrada() {
		return fecha;
	}

	public void setFechaEntrada(LocalDate fechaEntrada) {
		this.fecha = fechaEntrada;
	}

	public LocalTime getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(LocalTime horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public LocalTime getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(LocalTime horaSalida) {
		this.horaSalida = horaSalida;
	}

}
