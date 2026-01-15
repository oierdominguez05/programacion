package unidad7Herencia.EmpresaAgroalimentaria.modelo;

public class Refrigerados extends Productos {

	private double codigoOrganismo;
	private double fechaEnvasado;
	private double temperatura;
	private String paisOrigen;

	public Refrigerados(int fechaCad, double numLote, double codigoOrganismo, double fechaEnvasado, double temperatura, String paisOrigen) {
		super(fechaCad, numLote);
		this.codigoOrganismo = codigoOrganismo;
		this.fechaEnvasado = fechaEnvasado;
		this.temperatura = temperatura;
		this.paisOrigen = paisOrigen;
	}
	
	
	

}
