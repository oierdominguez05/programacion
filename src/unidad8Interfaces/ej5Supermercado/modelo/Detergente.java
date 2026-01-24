package unidad8Interfaces.ej5Supermercado.modelo;

public class Detergente implements ConDescuento,Productos {

	private final String producto = "Detergente";
	private String marca;
	private double precio;

	public Detergente(String marca, double precio) {
		super();
		this.marca = marca;
		this.precio = precio;
	}

	public String getProducto() {
		return producto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public void setDescuento(double des) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getDescuento() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPrecioDescuento() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Detergente producto= " + producto + " marca= " + marca + " precio= " + precio;
	}

	@Override
	public String marca() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double precio() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
}
