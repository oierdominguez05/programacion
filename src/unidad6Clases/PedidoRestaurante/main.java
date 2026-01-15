package unidad6Clases.PedidoRestaurante;

import clases.PedidoRestaurante.controlador.ControladorPedido;
import clases.PedidoRestaurante.modelo.Bebida;
import clases.PedidoRestaurante.modelo.Pedido;
import clases.PedidoRestaurante.modelo.Postre;
import clases.PedidoRestaurante.modelo.PrimerPlato;
import clases.PedidoRestaurante.modelo.SegundoPlato;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realizar un programa en Java que permita calcular el pedido que realiza un
		 * cliente en un restaurante. Los pedidos de un restaurante están conformados
		 * por las siguientes partes: • Un primer plato. • Un segundo plato. • Una
		 * bebida. • Un postre. Cada uno de dichas partes tiene un nombre y un valor. Se
		 * requiere definir métodos sobrecargados para calcular el valor del pedido
		 * dependiendo si el cliente solicita: • Un primer plato y una bebida. • Un
		 * primer plato, un segundo plato y una bebida. • Un primer plato, un segundo
		 * plato, una bebida y un postre. Implementar un método main que utilice los
		 * tres métodos sobrecargados en tres diferentes pedidos.
		 */

		
		Pedido pedido = new Pedido("Oier", 10); 
		PrimerPlato sopa = new PrimerPlato("Sopa", 5.0); 
		SegundoPlato carne = new SegundoPlato("Carne", 10.0); 
		Bebida agua = new Bebida("Agua", 2.0);
		Postre flan = new Postre("Flan", 3.0);
		
		ControladorPedido controlador = new ControladorPedido();
		
		System.out.println(controlador.Plato1Y2Bebida(sopa, carne, agua));
		
	}

}
