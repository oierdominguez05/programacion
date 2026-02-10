package Examen1_2ªev.EmpresaAgroalimentaria.modelo;

public abstract class Producto {

	private int fechaCad;
	private int numLote;

	public Producto(int fechaCad, int numLote) {
		super();
		this.fechaCad = fechaCad;
		this.numLote = numLote;
	}

	public int getFechaCad() {
		return fechaCad;
	}

	public void setFechaCad(int fechaCad) {
		this.fechaCad = fechaCad;
	}

	public int getNumLote() {
		return numLote;
	}

	public void setNumLote(int numLote) {
		this.numLote = numLote;
	}

}
