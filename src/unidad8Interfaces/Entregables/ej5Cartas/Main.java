package unidad8Interfaces.Entregables.ej5Cartas;

import java.util.Arrays;

import unidad8Interfaces.Entregables.ej5Cartas.modelo.Carta;
import unidad8Interfaces.Entregables.ej5Cartas.modelo.Palo;
import unidad8Interfaces.Entregables.ej5Cartas.modelo.CompararPorNumero;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carta[] mano = { new Carta(Palo.OROS, 3), new Carta(Palo.COPAS, 12), new Carta(Palo.ESPADAS, 1),
				new Carta(Palo.BASTOS, 7), Carta.cartaAlAzar() };

		System.out.println("Cartas originales:");
		System.out.println(Arrays.toString(mano));

		Arrays.sort(mano); // usa compareTo → palo + número
		System.out.println("\nOrdenadas por palo y número:");
		System.out.println(Arrays.toString(mano));

		Arrays.sort(mano, new CompararPorNumero());
		System.out.println("\nOrdenadas solo por número:");
		System.out.println(Arrays.toString(mano));

		System.out.println("\nCarta al azar:");
		System.out.println(Carta.cartaAlAzar());
	}
}
