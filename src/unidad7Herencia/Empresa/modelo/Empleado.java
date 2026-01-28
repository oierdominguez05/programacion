package unidad7Herencia.Empresa.modelo;

public class Empleado {

	private String nombre;
	private String apellidos;
	private String dni;
	private String direccion;
	private int añosAntiguedad;
	private double telefono;
	private double salario;

	public Empleado(String nombre, String apellidos, String dni, String direccion, int añosAntiguedad, double telefono,
			double salario) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
		this.añosAntiguedad = añosAntiguedad;
		this.telefono = telefono;
		this.salario = salario;
	}

	public double incrementarSalario(double cantidad) {
		return cantidad += salario;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getAñosAntiguedad() {
		return añosAntiguedad;
	}

	public void setAñosAntiguedad(int añosAntiguedad) {
		this.añosAntiguedad = añosAntiguedad;
	}

	public double getTelefono() {
		return telefono;
	}

	public void setTelefono(double telefono) {
		this.telefono = telefono;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
