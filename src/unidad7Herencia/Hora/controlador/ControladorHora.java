package unidad7Herencia.Hora.controlador;

import java.util.Scanner;

import unidad7Herencia.Hora.modelo.Hora;
import unidad7Herencia.Hora.vista.VistaHora;

public class ControladorHora {

	private Hora modelo;
	private VistaHora vista;

	public ControladorHora(Hora modelo, VistaHora vista) {
		super();
		this.modelo = modelo;
		this.vista = vista;
	}

	public void iniciar() {
		vista.mensaje();
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		while (numero == 1) {
			if (modelo.getMinuto() < 59) {
				modelo.incremento();
				vista.mensaje1("minuto añadido " + modelo.getMinuto());
			}
			if (modelo.getMinuto() == 59) {
				modelo.addHora();
				vista.mensaje1("hora sumada " + modelo.getHora() + "y minuto " + modelo.getMinuto());
			}
			if (modelo.getHora() == 23 && modelo.getMinuto() == 59) {
				modelo.setHora(0);
				modelo.setMinuto(0);
				
			}
			teclado.nextInt();
		}

		while (numero == 2) {
			if (modelo.getMinuto() < 0) {
				modelo.setHora(0);
				modelo.setMinuto(59);
				teclado.nextInt();
			}
			if (modelo.getMinuto() == 0 && modelo.getHora() == 0) {
				break;
			}
		}
	}
}
