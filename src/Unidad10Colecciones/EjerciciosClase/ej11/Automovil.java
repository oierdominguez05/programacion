package Unidad10Colecciones.EjerciciosClase.ej11;

public class Automovil {

	private double codigo;
	private String producto;
	private boolean estado;
	private int stock;

	public Automovil(double codigo, String producto, boolean estado, int stock) {
		super();
		this.codigo = codigo;
		this.producto = producto;
		this.estado = estado;
		this.stock = stock;
	}

	public double getCodigo() {
		return codigo;
	}

	public void setCodigo(double codigo) {
		this.codigo = codigo;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return codigo + "," + producto + "," + estado + "," + stock;
	}
	
	
	
	

	
	


}
