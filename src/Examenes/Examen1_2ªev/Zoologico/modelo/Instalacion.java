package Examenes.Examen1_2ªev.Zoologico.modelo;

public class Instalacion extends Zoologico {

	private String zona;
	private String descripcion;
	private int añoInstalado;

	public Instalacion(String zona, String descripcion, int añoInstalado) {
		super();
		this.zona = zona;
		this.descripcion = descripcion;
		this.añoInstalado = añoInstalado;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getAñoInstalado() {
		return añoInstalado;
	}

	public void setAñoInstalado(int añoInstalado) {
		this.añoInstalado = añoInstalado;
	}

}
