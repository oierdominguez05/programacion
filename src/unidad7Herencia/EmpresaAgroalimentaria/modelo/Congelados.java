package unidad7Herencia.EmpresaAgroalimentaria.modelo;

public class Congelados extends Productos {

	private double fechaEnvasado;
	private String paisOrigen;
	private double temperatura;

	public Congelados(int fechaCad, double numLote, double fechaEnvasado, String paisOrigen, double temperatura) {
		super(fechaCad, numLote);
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
		this.temperatura = temperatura;
	}

}
