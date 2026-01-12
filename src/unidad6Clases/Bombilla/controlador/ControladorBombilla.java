package unidad6Clases.Bombilla.controlador;

import java.util.Scanner;

import unidad6Clases.Bombilla.modelo.Bombilla;
import unidad6Clases.Bombilla.vista.VistaBombilla;

public class ControladorBombilla {

	private VistaBombilla vista;
	private Bombilla b1;
	private Bombilla b2;

	public ControladorBombilla(VistaBombilla vista) {
		this.vista = vista;
		this.b1 = new Bombilla();
		this.b2 = new Bombilla();
	}

	public void inicio() {
		vista.menuInicio();
		Scanner teclado = new Scanner(System.in);
		int opcion;
		do {
		 opcion = teclado.nextInt();
		
		switch(opcion) {
		case 1:
			b1.encender();
			break;
		case 2:
			b1.apagar();
			break;
		case 3:
			b2.encender();
			break;
		case 4:
			b2.apagar();
			break;
		case 5:
			Bombilla.encenderGeneral();
			break;
		case 6:
			Bombilla.apagarGeneral();
			break;
		case 7:
			vista.mostrar("Bombilla 1:" + b1);
			vista.mostrar("Bombilla 2: " + b2);
			break;
		}
		} while(opcion != 0);
		
	}

}


