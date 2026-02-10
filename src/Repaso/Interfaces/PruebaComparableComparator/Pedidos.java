package Repaso.Interfaces.PruebaComparableComparator;

import java.time.LocalDate;

public class Pedidos implements Comparable<Pedidos> {

	private int idPedido;
	private String cliente;
	private double importeTotal;
	private LocalDate fechaPedido;

	@Override
	public int compareTo(Pedidos o) {
		return this.fechaPedido.compareTo(o.fechaPedido);
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

}
