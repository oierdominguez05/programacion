package unidad7Herencia.Instrumentos.modelo;

import unidad7Herencia.Instrumentos.modelo.Notas;

public class Piano extends Instrumento {

	
	public void interpretar() {
		for (Notas nota : melodia) {
			System.out.println("Notas: " + nota);
		}
		System.out.println();
	}

}
