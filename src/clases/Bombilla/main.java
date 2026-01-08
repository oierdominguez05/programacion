package clases.Bombilla;

import clases.Bombilla.controlador.ControladorBombilla;
import clases.Bombilla.modelo.Bombilla;
import clases.Bombilla.vista.VistaBombilla;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		VistaBombilla vista = new VistaBombilla();
		Bombilla modelo = new Bombilla(false, false, false, false);
		ControladorBombilla controlador = new ControladorBombilla(vista, modelo);
		
		controlador.inicio();
		
	}

}
