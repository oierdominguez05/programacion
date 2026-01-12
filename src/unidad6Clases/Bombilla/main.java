package unidad6Clases.Bombilla;

import unidad6Clases.Bombilla.controlador.ControladorBombilla;
import unidad6Clases.Bombilla.modelo.Bombilla;
import unidad6Clases.Bombilla.vista.VistaBombilla;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		VistaBombilla vista = new VistaBombilla();

		ControladorBombilla controlador = new ControladorBombilla(vista);
		
		controlador.inicio();
		
	}

}
