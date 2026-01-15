package unidad6Clases.PedidoRestaurante.modelo;

public class Pedido {

	private String nombre;
	private double valor;

	public Pedido(String nombre, double valor) {
		super();
		this.nombre = nombre;
		this.valor = valor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
