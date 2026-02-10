package unidad8Interfaces.Pruebas.ComparableComparator.modelo;

import java.time.LocalDate;
import java.util.Comparator;

public class Pedido implements Comparable<Pedido>{

	private int idPedido;
	private String cliente;
	private double importeTotal;
	private LocalDate fechaPedido;

	public Pedido(int idPedido, String cliente, double importeTotal, LocalDate fechaPedido) {
		super();
		this.idPedido = idPedido;
		this.cliente = cliente;
		this.importeTotal = importeTotal;
		this.fechaPedido = fechaPedido;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getImporteTotal() {
		return importeTotal;
	}

	public void setImporteTotal(double importeTotal) {
		this.importeTotal = importeTotal;
	}

	public LocalDate getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(LocalDate fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	
	@Override
	public String toString() {
		return "Pedido idPedido= " + idPedido + ", cliente= " + cliente + ", importeTotal= " + importeTotal
				+ ", fechaPedido= " + fechaPedido;
	}

	@Override
	public int compareTo(Pedido o) {
		this.getFechaPedido().compareTo(o.getFechaPedido());
		return 0;
	}
	

}
