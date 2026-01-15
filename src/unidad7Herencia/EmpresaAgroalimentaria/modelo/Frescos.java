package unidad7Herencia.EmpresaAgroalimentaria.modelo;

public class Frescos extends Productos{

	
	private double fechaEnvasado;
	private String paisOrigen;
	
	
	public Frescos(int fechaCad, double numLote, double fechaEnvasado, String paisOrigen) {
		super(fechaCad, numLote);
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}

	
	
}
