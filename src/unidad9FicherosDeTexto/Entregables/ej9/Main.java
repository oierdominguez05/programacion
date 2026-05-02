package unidad9FicherosDeTexto.Entregables.ej9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("MENÚ  "
				+ "1. Alta cliente.\r\n"
				+ "2. Baja cliente.\r\n"
				+ "3. Listar clientes.\r\n"
				+ "4. Salir");
		
		int opcion = teclado.nextInt();
		BufferedReader br = null;
		BufferedWriter bw = null;
				int contador = 0;
		switch(opcion) {
		
		case 1:
		System.out.println("Introduce el nombre");
		String nombre = teclado.nextLine();
		teclado.nextLine();
		System.out.println("Introduce el DNI");
		String dni = teclado.nextLine();
		System.out.println("Introduce tu fecha de nacimiento");
		int fecha = teclado.nextInt();
		System.out.println("Introduce tu saldo");
		double saldo = teclado.nextDouble();
		
		String cliente = dni + nombre + fecha + saldo;
		
		String[] clienteOrden = new String[contador];
		clienteOrden[clienteOrden.length+1] = cliente;
		Arrays.sort(clienteOrden);
		contador++;
		for(String n : clienteOrden) {
		try {
			bw = new BufferedWriter(new FileWriter("clientes.txt"));
			bw.write(n);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		}
		break;
		
		}
		
		
		
		
		
		
		
		
		
		
	}

}
