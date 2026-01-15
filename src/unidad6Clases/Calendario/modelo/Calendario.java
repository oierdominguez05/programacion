package unidad6Clases.Calendario.modelo;

public class Calendario {

	
	private int año;
	private int mes;
	private int dia;
	
	
	
	public Calendario(int año, int mes, int dia) {
		super();
		this.año = año;
		this.mes = mes;
		this.dia = dia;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	
	public void incrementarDia() {
		dia++;
	}
	
	public void incrementarMes() {
		mes++;
	}
	
	
	public void incrementarAño(int cantidad) {
		año += cantidad;
	}
	
	
	@Override
	public String toString() {
		return "Calendario [año=" + año + ", mes=" + mes + ", dia=" + dia + "]";
	}
	
}
