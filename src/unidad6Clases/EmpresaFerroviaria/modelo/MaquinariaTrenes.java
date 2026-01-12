package unidad6Clases.EmpresaFerroviaria.modelo;

public class MaquinariaTrenes {

	public String locomotora;

	public String maquinistaResponsable;
	private MaquinariaVagon[] vagones = new MaquinariaVagon[5];
	private int numeroVagones;

	public MaquinariaTrenes(String locomotora, int cantidadVagones, String maquinistaResponsable) {
		super();
		this.locomotora = locomotora;
		this.numeroVagones = cantidadVagones;
		this.maquinistaResponsable = maquinistaResponsable;
	}

}
