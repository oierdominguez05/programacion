package unidad8Interfaces.Entregables.ej3Serie;

import java.util.Arrays;

import unidad8Interfaces.Entregables.ej3Serie.modelo.Serie;
import unidad8Interfaces.Entregables.ej3Serie.modelo.Videojuego;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Serie[] serie = new Serie[5];
		Videojuego[] juego = new Videojuego[5];

		serie[0] = new Serie("Breaking Bad", 5, "Drama", "Vince Gilligan");
		serie[1] = new Serie("Dark", 3, "Sci-Fi", "Baran bo Odar");
		serie[2] = new Serie("Friends", 10, "Comedia", "NBC");
		serie[3] = new Serie("Vikingos", 6, "Acción", "History");
		serie[4] = new Serie("The Witcher", 2, "Fantasia", "Netflix");

		juego[0] = new Videojuego("Zelda", 50, "Aventura", "Nintendo");
		juego[1] = new Videojuego("FIFA", 20, "Deportes", "EA");
		juego[2] = new Videojuego("Minecraft", 100, "Sandbox", "Mojang");
		juego[3] = new Videojuego("GTA V", 60, "Acción", "Rockstar");
		juego[4] = new Videojuego("Fortnite", 30, "Shooter", "Epic");

		serie[1].entregar();
		serie[3].entregar();
		juego[0].entregar();
		juego[3].entregar();

		int seriesEntregadas = 0;
		for (int i = 0; i < serie.length; i++) {
			if (serie[i].isEntregado()) {
				seriesEntregadas++;
			}
		}

		int juegosEntreagados = 0;
		for (int i = 0; i < juego.length; i++) {
			if (juego[i].isEntregado()) {
				juegosEntreagados++;
			}
		}
		System.out.println("Series entreagdas: " + seriesEntregadas);
		System.out.println("Juegos Entregados: " + juegosEntreagados);

		System.out.println(Arrays.toString(serie));
		System.out.println(Arrays.toString(juego));
	}

}
