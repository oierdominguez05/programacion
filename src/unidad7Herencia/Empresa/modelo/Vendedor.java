package unidad7Herencia.Empresa.modelo;

public class Vendedor extends Empleado {

	private String matricula;
	private String marca;
	private String modelo;
	private double telefono;
	private String area;
	private String listaClientes;
	private double porcentajeVentas;

	public Vendedor(String nombre, String apellidos, String dni, String direccion, int añosAntiguedad, double telefono,
			double salario, String matricula, String marca, String modelo, double telefono2, String area,
			String listaClientes, double porcentajeVentas) {
		super(nombre, apellidos, dni, direccion, añosAntiguedad, telefono, salario);
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		telefono = telefono2;
		this.area = area;
		this.listaClientes = listaClientes;
		this.porcentajeVentas = porcentajeVentas;
		incrementarSalario(0.90);
	}

	public String cambiarCoche() {
		return coche;
	}

	public String altaCliente() {
		return cliente;
	}

	public String bajaCliente() {
		return cliente;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getTelefono() {
		return telefono;
	}

	public void setTelefono(double telefono) {
		this.telefono = telefono;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(String listaClientes) {
		this.listaClientes = listaClientes;
	}

	public double getPorcentajeVentas() {
		return porcentajeVentas;
	}

	public void setPorcentajeVentas(double porcentajeVentas) {
		this.porcentajeVentas = porcentajeVentas;
	}

}
