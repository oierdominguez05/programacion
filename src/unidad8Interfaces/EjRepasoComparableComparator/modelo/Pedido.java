package unidad8Interfaces.EjRepasoComparableComparator.modelo;

import java.time.LocalDate;

public class Pedido {

	
	private int idPedidos;
	private String cliente;
	private double importeTotal;
	private LocalDate fechaPedido;
	
	
	
	public Pedido(int idPedidos, String cliente, double importeTotal, LocalDate fechaPedido) {
		super();
		this.idPedidos = idPedidos;
		this.cliente = cliente;
		this.importeTotal = importeTotal;
		this.fechaPedido = fechaPedido;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public double getImporte() {
		return importeTotal;
		
	}
	public double setImporteTotal() {
		return importeTotal;
	}
	
	public void setImporteTotal() {
		this.importeTotal = importeTotal;
	}

	@Override
	public String toString() {
		return "Pedido [idPedidos=" + idPedidos + ", cliente=" + cliente + ", importeTotal=" + importeTotal
				+ ", fechaPedido=" + fechaPedido + "]";
	}
	
	
	
	
	
	
}
