package clases.EmpresaFerroviaria.modelo;

public class PersonalJefeEstacion extends Personal {

	
	
	public String dni;
	public int fecha;
	
	
	public PersonalJefeEstacion(String nombre, String dni, int fecha) {
		super(nombre);
		this.dni = dni;
		this.fecha = fecha;
	}


}