package unidad7Herencia.Instrumentos.modelo;

import unidad7Herencia.Instrumentos.NotasMusicales;

public class Piano extends Instrumento {

	
	public void interpretar() {
		for (NotasMusicales nota : melodia) {
			System.out.println("Notas: " + nota);
		}
		System.out.println();
	}

}
