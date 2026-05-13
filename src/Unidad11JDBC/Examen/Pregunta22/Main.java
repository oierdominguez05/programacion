package Unidad11JDBC.Examen.Pregunta22;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner teclado = new Scanner(System.in);
	static Map<Integer, Jugador> plantilla = new Map<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = 0;

		while (opcion != 5) {
			System.out.println("1 alta jugador");
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduce el dorsal");
				int dorsal = teclado.nextInt();
				System.out.println("INtroduce el dni");
				String dni = teclado.nextLine();
				System.out.println("Introduce el nombre");
				String nombre = teclado.nextLine();
				System.out.println("Introduce la posicion");
				String posicion = teclado.nextLine();
				System.out.println("introduce la estatura");
				double estatura = teclado.nextDouble();
				Jugador j = new Jugador(dni, nombre, posicion, estatura);

				altaJugador(dorsal, j, dorsal);
				break;
			case 2:
				System.out.println("introduce el dorsal a eliminar");
				int dorsalElim = teclado.nextInt();
				eliminar(Integer, Jugador plantilla,dorsalElim);
break;
			}

		}

	}

	public static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {

	}

	public static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
		plantilla.remove(dorsalElim);
	}

	public static void mostrar(Map<Integer, Jugador> plantilla) {

		for(Integer p : plantilla.keySet()) {
			System.out.println(p);
		}
		for(Jugador p : plantilla.values()) {
			System.out.println(p);
		}
		
		
	}

}
