package clases.Bombilla.controlador;

import java.util.Scanner;

import clases.Bombilla.modelo.Bombilla;
import clases.Bombilla.vista.VistaBombilla;

public class ControladorBombilla {

	
	private VistaBombilla vista;
	private Bombilla modelo;
	
	
	public ControladorBombilla(VistaBombilla vista, Bombilla modelo) {
		super();
		this.vista = vista;
		this.modelo = modelo;
	}
	
	
	public void inicio() {
		vista.menuInicio();
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		if (numero == 11) {
			vista.mostrar("General encendido");
			int numero1 = teclado.nextInt();
			
			if (numero1 == 1) {
				modelo.setBombilla1(true);
				vista.mostrar("Bombilla 1 encendida");
				
			} else if (numero1 == 2) {
				modelo.setBombilla2(true);
				vista.mostrar("Bombilla 2 encendida");
			} else if (numero1 == 3) {
				modelo.setBombilla3(true);
				vista.mostrar("Bombilla 3 encendida");
			}
			
		} else {
			vista.mostrar("General Apagado, introduce 11 para encender");
		}
		
		
		
		
	}
	
	
	
	
}
