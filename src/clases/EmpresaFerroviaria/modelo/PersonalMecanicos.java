package clases.EmpresaFerroviaria.modelo;

public class PersonalMecanicos extends Personal{

	
	public String nombre;
	public double telefono;
	public String especialidad;
	
	
	
	public PersonalMecanicos(String nombre, double telefono, String especialidad) {
		super(nombre);
		this.telefono = telefono;
		this.especialidad = especialidad;
		
	}

}
