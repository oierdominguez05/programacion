package unidad6Clases.SistemaSolar;

import java.util.Arrays;

import unidad6Clases.SistemaSolar.controlador.ControladorSistema;
import unidad6Clases.SistemaSolar.modelo.Planeta;
import unidad6Clases.SistemaSolar.vista.VistaSistema;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Planeta modelo = new Planeta("Mercurio", 13422, 3456, 6789, 1234, 24674);
		VistaSistema vista = new VistaSistema();
		ControladorSistema controlador = new ControladorSistema(modelo, vista);
		
		controlador.iniciar();
	}

}
