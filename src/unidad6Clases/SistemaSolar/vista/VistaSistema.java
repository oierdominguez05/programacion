package unidad6Clases.SistemaSolar.vista;

import unidad6Clases.SistemaSolar.controlador.ControladorSistema;
import unidad6Clases.SistemaSolar.modelo.Planeta;

public class VistaSistema {

	Planeta modelo;
	ControladorSistema controlador;
	
	public void mostrar() {
		System.out.println("Nombre:" + modelo.getNombre());
		System.out.println("Cantidad satelites: " + modelo.getCantSatelites());
		System.out.println("Masa: " + modelo.getMasa());
		System.out.println("Division densidad: " + modelo.densidad());
	}
	
}
