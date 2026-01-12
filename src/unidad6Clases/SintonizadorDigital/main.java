package unidad6Clases.SintonizadorDigital;

import unidad6Clases.SintonizadorDigital.controlador.ControladorSintonizador;
import unidad6Clases.SintonizadorDigital.modelo.Sintonizador;
import unidad6Clases.SintonizadorDigital.vista.VistaSintonizador;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VistaSintonizador vista = new VistaSintonizador();
		Sintonizador modelo = new Sintonizador(80);
		ControladorSintonizador controlador = new ControladorSintonizador(modelo, vista);

		controlador.iniciar();
	}

}
