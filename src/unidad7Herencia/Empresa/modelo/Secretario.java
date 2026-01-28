package unidad7Herencia.Empresa.modelo;

public class Secretario extends Empleado {

	private String despacho;
	private double numeroFax;

	public Secretario(String nombre, String apellidos, String dni, String direccion, int añosAntiguedad,
			double telefono, double salario, String despacho, double numeroFax) {
		super(nombre, apellidos, dni, direccion, añosAntiguedad, telefono, salario);
		this.despacho = despacho;
		this.numeroFax = numeroFax;
		incrementarSalario(0.95);
	}

	public String getDespacho() {
		return despacho;
	}

	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	public double getNumeroFax() {
		return numeroFax;
	}

	public void setNumeroFax(double numeroFax) {
		this.numeroFax = numeroFax;
	}

}
