package Examenes.Examen1_2ªev.Zoologico.modelo;

public class Animal extends Zoologico {

	private String nombre;
	private String especie;
	private int añoNacimiento;
	private String codigo;

	public Animal(String nombre, String especie, int añoNacimiento, String codigo) {
		super();
		this.nombre = nombre;
		this.especie = especie;
		this.añoNacimiento = añoNacimiento;
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getAñoNacimiento() {
		return añoNacimiento;
	}

	public void setAñoNacimiento(int añoNacimiento) {
		this.añoNacimiento = añoNacimiento;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
