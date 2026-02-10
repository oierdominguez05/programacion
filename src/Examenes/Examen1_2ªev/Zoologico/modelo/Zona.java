package Examenes.Examen1_2ªev.Zoologico.modelo;

public abstract class Zona extends Zoologico {

	private double codigo;
	private String nombre;
	private double metrosCaudrados;

	public Zona(double codigo, String nombre, double metrosCaudrados) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.metrosCaudrados = metrosCaudrados;
	}

	public double getCodigo() {
		return codigo;
	}

	public void setCodigo(double codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getMetrosCaudrados() {
		return metrosCaudrados;
	}

	public void setMetrosCaudrados(double metrosCaudrados) {
		this.metrosCaudrados = metrosCaudrados;
	}

}
