package Unidad10Colecciones.Pruebas.ContadorPalabras;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una frase");
		String frase = teclado.nextLine();
		Map<String, Integer> registro = new HashMap<>();
		if (frase != null) {
			String[] palabras = frase.split(" ");
			for (String s : palabras) {
				if (registro.containsKey(s)) {
					registro.put(s, registro.get(s)+1);
				} else {
					registro.put(s, 1);

				}
			}

		}
		
		System.out.println(registro);

	}

}
