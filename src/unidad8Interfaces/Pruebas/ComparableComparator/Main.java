package unidad8Interfaces.Pruebas.ComparableComparator;

import java.time.LocalDate;
import java.util.Arrays;

import unidad8Interfaces.Pruebas.ComparableComparator.modelo.Pedido;
import unidad8Interfaces.Pruebas.ComparableComparator.modelo.CompararFechaPedido;
import unidad8Interfaces.Pruebas.ComparableComparator.modelo.CompararImporte;

public class Main {
	private static Pedido[] pedido = new Pedido[0];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pedido p1 = new Pedido(2, "Oier", 123, LocalDate.of(2024, 6, 23));
		Pedido p2 = new Pedido(2, "Ane", 980.00, LocalDate.of(2023, 11, 3));
		Pedido p3 = new Pedido(3, "Jon", 45.99, LocalDate.of(2022, 1, 20));
		Pedido p4 = new Pedido(4, "Oier", 300.00, LocalDate.of(2024, 2, 1));
		Pedido p5 = new Pedido(5, "Mikel", 1500.00, LocalDate.of(2023, 6, 15));

		aniadir(p1);
		aniadir(p2);
		aniadir(p3);
		aniadir(p4);
		aniadir(p5);

		/*
		 * Arrays.sort(pedido, new CompararFechaPedido()); mostrar();
		 */

		/*Arrays.sort(pedido, new CompararImporte());
		mostrar();*/
		
		Arrays.sort(pedido, new CompararFechaPedido());
		mostrar();
		
		

	}

	public static void aniadir(Pedido nuevo) {
		pedido = Arrays.copyOf(pedido, pedido.length + 1);
		pedido[pedido.length - 1] = nuevo;
	}

	public static void mostrar() {
		for (Pedido p : pedido) {
			System.out.println(p);
		}
	}

}
