package unidad8Interfaces.Entregables.ej5Cartas.modelo;

import java.util.Random;

public class Carta implements Comparable<Carta> {

	private Palo palo;
	private int numero; // 1–12

	public Carta(Palo palo, int numero) {
		this.palo = palo;
		this.numero = numero;
	}

	public Palo getPalo() {
		return palo;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public int compareTo(Carta o) {
		int cmp = this.palo.compareTo(o.palo);
		if (cmp != 0)
			return cmp;
		return Integer.compare(this.numero, o.numero);
	}

	public static Carta cartaAlAzar() {
		Random r = new Random();
		Palo paloRandom = Palo.values()[r.nextInt(Palo.values().length)];
		int numeroRandom = r.nextInt(12) + 1; // 1–12
		return new Carta(paloRandom, numeroRandom);
	}

	@Override
	public String toString() {
		return numero + " de " + palo;
	}
}
