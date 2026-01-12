package unidad7Herencia.BiciExpress;

import Herencia.BiciExpress.modelo.Caja;
import Herencia.BiciExpress.modelo.CajaCarton;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * La empresa de mensajería BiciExpress, que reparte en bicicleta, para
		 * disminuir el peso que transportan sus empleados solo utiliza cajas de cartón.
		 * El volumen de estas se calcula como el 80% del volumen real, con el fin de
		 * evitar que se deformen y se rompan. Otra característica de las cajas de
		 * cartón es que sus medidas siempre están en centímetros. Por último, la
		 * empresa, para controlar costes, necesita saber cuál es la superficie total de
		 * cartón utilizado para construir todas las cajas. Escribe la clase CajaCarton
		 * heredando de la clase caja.
		 */

		Caja modelo1 = new Caja(1.0, 0.5, 0.3);

		System.out.println("Volumen caja normal: " + modelo1.getVolumen());

		CajaCarton modelo = new CajaCarton(50, 60, 80);
		System.out.println("Volumen caja cartón (80%): " + modelo.getVolumen());
		System.out.println("Superficie total de cartón: " + modelo.getSuperficieCarton());

		System.out.println(modelo);

	}

}
