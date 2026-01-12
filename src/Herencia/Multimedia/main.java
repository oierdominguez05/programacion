package Herencia.Multimedia;

import Herencia.Multimedia.modelo.Multimedia;
import Herencia.Multimedia.modelo.Pelicula;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribe una clase Multimedia para almacenar información de los objetos de
		 * tipo multimedia (películas, discos, mp3,mp4…). Esta clase contiene título,
		 * autor, formato, y duración como atributos. El formato puede ser uno de los
		 * siguientes: wav, mp3, midi, avi, mov, mpg, cdAudio y dvd. El valor de todos
		 * los atributos se pasa por parámetro en el momento de crear el objeto. Esta
		 * clase tiene además, un método para devolver cada TEMA 7 – HERENCIA
		 * PROGRAMACIÓN uno de los atributos y un método toString() que devuelve la
		 * información del objeto. Por último, un método equals() que recibe un objeto
		 * de tipo Multimedia y devuelve true en caso de que el título y el autor sean
		 * iguales y false en caso contrario
		 */

		Multimedia modelo = new Multimedia("Avatar", "Cameron", "mp4", 120);
		Multimedia otro = new Multimedia("Avatar", "Cameron", "mp4", 120);
		Pelicula modelo1 = new Pelicula("Avatar", "Cameron", "mp4", 90, "Oier", "Dominguez");

		if (modelo.equals(otro) == true) {
			System.out.println("El titulo y autor son iguales");
		} else {
			System.out.println("El titulo y autor NO son iguales");
		}
		System.out.println("Pelicula sin actor y actriz: " + modelo);
		System.out.println("Pelicula con actor y actriz: " + modelo1);
	}

}
