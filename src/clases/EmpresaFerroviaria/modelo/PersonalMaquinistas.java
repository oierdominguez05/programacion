package clases.EmpresaFerroviaria.modelo;

public class PersonalMaquinistas extends Personal {

	
	public String nombre;
	public String dni;
	public double sueldo;
	public String rango;
	
	
	
	public PersonalMaquinistas(String nombre, String dni, double sueldo, String rango) {
		super(nombre);
		this.dni = dni;
		this.sueldo = sueldo;
		this.rango = rango;
	}



	
	
	
	
}
