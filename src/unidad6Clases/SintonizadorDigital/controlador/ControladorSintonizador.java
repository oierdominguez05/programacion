package unidad6Clases.SintonizadorDigital.controlador;

import java.util.Scanner;

import unidad6Clases.SintonizadorDigital.modelo.Sintonizador;
import unidad6Clases.SintonizadorDigital.vista.VistaSintonizador;

public class ControladorSintonizador {

	private Sintonizador modelo;
	private VistaSintonizador vista;

	public ControladorSintonizador(Sintonizador modelo, VistaSintonizador vista) {
		this.modelo = modelo;
		this.vista = vista;
	}

	public void iniciar() {
		vista.menu();
		Scanner teclado = new Scanner(System.in);
		int opcion;
		do {
			opcion = teclado.nextInt();
			if (opcion == 1) {
				modelo.subir();
				System.out.println("Se ha subido 0.5MHz fecuencia actual:" + modelo.getSintonizador());

			} else if (opcion == 2) {
				modelo.bajar();
				System.out.println("Se ha bajado 0.5MHz fecuencia actual:" + modelo.getSintonizador());
			}

		} while (opcion == 1 || opcion == 2);
	}

}
