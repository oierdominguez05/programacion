package unidad7Herencia.Hora;

import unidad7Herencia.Hora.controlador.ControladorHora;
import unidad7Herencia.Hora.modelo.Hora;
import unidad7Herencia.Hora.vista.VistaHora;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hora modelo = new Hora(0, 0);
		VistaHora vista = new VistaHora();
		ControladorHora controlador = new ControladorHora(modelo, vista);
		
		controlador.iniciar();
		
	}

}
