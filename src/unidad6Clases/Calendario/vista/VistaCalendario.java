package unidad6Clases.Calendario.vista;

import java.util.Scanner;

import clases.Calendario.modelo.Calendario;

public class VistaCalendario {

	
	private Calendario calendario;
	
	
	public VistaCalendario(Calendario calendario) {
		this.calendario = calendario;
	}


	public void iniciar( ) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un año");
		int año1 = teclado.nextInt();
		calendario.incrementarAño(año1);
		System.out.println(calendario);
	}
	
	
}
