package unidad6Clases.EmpresaFerroviaria.modelo;

public class MaquinariaLocomotora {

	public String matricula;
	public String potencia;
	public int antiguedad;
	private PersonalMecanicos PersonalMecanicos;
	
	
	public MaquinariaLocomotora(String matricula, String potencia, int antiguedad, PersonalMecanicos PersonalMecanicos) {
		super();
		this.matricula = matricula;
		this.potencia = potencia;
		this.antiguedad = antiguedad;
		this.PersonalMecanicos = PersonalMecanicos ;
	}

}
