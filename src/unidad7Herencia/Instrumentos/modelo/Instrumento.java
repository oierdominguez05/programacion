package unidad7Herencia.Instrumentos.modelo;

import java.util.ArrayList;


import unidad7Herencia.Instrumentos.NotasMusicales;

public abstract class Instrumento {

	
	protected ArrayList<NotasMusicales> melodia = new ArrayList<>();
	
	public void add(NotasMusicales nota) {
		melodia.add(nota);
	}
	
	
	 public abstract void interpretar();
	
}
