package unidad6Clases.SistemaSolar.vista;

import unidad6Clases.SistemaSolar.modelo.Planeta;

public class VistaSistema {

	Planeta modelo;
	
	public void mostrar() {
		System.out.println("Nombre:" + modelo.getNombre());
		System.out.println("Cantidad satelites: " + modelo.getCantSatelites());
		System.out.println("Masa: " + modelo.getMasa());
		System.out.println("Division densidad: " + modelo.densidad());
	}
	
}
