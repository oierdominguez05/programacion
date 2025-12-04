package EjercicioCajeroAutomatico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		float saldo_inicial = 1200;
		float comision = 0;
		boolean salir = false;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Que quieres hacer?");
		String accion = teclado.nextLine();
		
		switch (accion) {
		
		case "Ingresar":
			System.out.println("Cuanto quieres ingresar");
			float ingresar = teclado.nextFloat();
		if (ingresar > 5000) {
			System.out.println("Ingreso sujeto a verificaon");
			
		} else {
			saldo_inicial += ingresar;
		}
		teclado.nextLine();
		break;
		case "Retirar":
		System.out.println("Cuanto quieres retirar");
		float retirar = teclado.nextFloat();
		if (retirar > 300) {
			saldo_inicial -= retirar;
			comision += 2;
		} else {
			saldo_inicial -= retirar;
		}
			teclado.nextLine();
			break;
		case "Consultar saldo":
			
			float resultadoFinal = saldo_inicial - comision;
		System.out.println("Saldo inicial: " + resultadoFinal);
		
		case "Salir":
			salir = true;
			System.out.println("Gacias!");
			break;
		}
		float resultadoFinal = saldo_inicial - comision;
		System.out.println("Saldo inicial: " + resultadoFinal);
		
		
		
		
		
		
		
		
	}

}
