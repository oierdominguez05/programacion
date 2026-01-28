package unidad7Herencia.Empresa.modelo;

public class JefeZona extends Empleado {

	private String despacho;
	private String secretario;
	private String listaVendedores;
	private String cocheEmpresa;
	
	
	public JefeZona(String nombre, String apellidos, String dni, String direccion, int añosAntiguedad, double telefono,
			double salario, String despacho, String secretario, String listaVendedores, String cocheEmpresa) {
		super(nombre, apellidos, dni, direccion, añosAntiguedad, telefono, salario);
		this.despacho = despacho;
		this.secretario = secretario;
		this.listaVendedores = listaVendedores;
		this.cocheEmpresa = cocheEmpresa;
	}
	
	public String setSecretario() {
		return secretario;
	}
	
public String Coche(String modeloNuevo) {
	return modeloNuevo;
}
	


}
