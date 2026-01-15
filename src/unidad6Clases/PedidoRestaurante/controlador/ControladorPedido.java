package unidad6Clases.PedidoRestaurante.controlador;

import unidad6Clases.PedidoRestaurante.modelo.Bebida;
import unidad6Clases.PedidoRestaurante.modelo.Pedido;
import unidad6Clases.PedidoRestaurante.modelo.Postre;
import unidad6Clases.PedidoRestaurante.modelo.PrimerPlato;
import unidad6Clases.PedidoRestaurante.modelo.SegundoPlato;

public class ControladorPedido {
	
	private Bebida bebida;
	private Pedido pedido;
	private Postre postre;
	private PrimerPlato primerPlato;
	private SegundoPlato segundoPlato;
	
	
	public double PrimerPlatoBebida() {
		double resultado = primerPlato.getValor() + bebida.getValor();
		return resultado;
	}
	
	public double Plato1Y2Bebida(PrimerPlato p1, SegundoPlato p2, Bebida p3) {
		double resultado1 = p1.getValor() + p2.getValor() + p3.getValor();
		return resultado1;
	}
	
	public double PrimeroSegundoBebidaPostre() {
		double resultado2 = primerPlato.getValor() + segundoPlato.getValor() + bebida.getValor() + postre.getValor();
		return resultado2;
	}
	
}
