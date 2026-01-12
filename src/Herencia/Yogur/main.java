package Herencia.Yogur;

import Herencia.Yogur.modelo.Yogur;
import Herencia.Yogur.modelo.YogurDesnatado;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * .En primer lugar, diseña la clase Yogur sabiendo que un yogur siempre tiene
		 * 120.5 calorías. Se requiere implementar un método consultor para obtener sus
		 * calorías. A continuación, diseña la clase YogurDesnatado sabiendo que siempre
		 * tiene la mitad de calorías que un Yogur normal. Finalmente, construye una
		 * clase Main con un método principal que cree un objeto Yogur y un
		 * YogurDesnatado y muestre sus calorías.
		 */

		Yogur yogur = new Yogur();
		YogurDesnatado desnatado = new YogurDesnatado();

		System.out.println("Calorias yogur normal:" + yogur.getCalorias());
		System.out.println("Calorias yogur desnatado: " + desnatado.getCalorias());

	}

}
