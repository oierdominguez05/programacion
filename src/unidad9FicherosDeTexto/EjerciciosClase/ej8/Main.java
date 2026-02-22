package unidad9FicherosDeTexto.EjerciciosClase.ej8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * En el archivo numeros.txt disponemos de una serie de números (uno por cada
		 * línea). Diseña un programa que procese el fichero y nos muestre el menor y el
		 * mayor.
		 */
		
		try {
		BufferedWriter bw = new BufferedWriter(new FileWriter("MayorMenor.txt"));
		for(int i = 0; i < 10 ; i++) {
			int aleatorio = (int)(Math.random() * 300);
			bw.write(String.valueOf(aleatorio));
			bw.newLine();
		}
		bw.close();
		
		int maximo = Integer.MIN_VALUE;
		int minimo= Integer.MAX_VALUE;
		BufferedReader br = new BufferedReader(new FileReader("MayorMenor.txt"));
		String linea;
		while((linea = br.readLine())!= null) {
			int num = Integer.parseInt(linea);
		
		if(num > maximo) {
			maximo = num;
		}
		if (num < minimo) {
			minimo = num;
		}
		}
		System.out.println("El numero maximo es: " + maximo);
		System.out.println("El numero minimo es: " + minimo);
		
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
