package unidad7Herencia.Instrumentos.modelo;

import java.util.ArrayList;
import unidad7Herencia.Instrumentos.modelo.Notas;




public abstract class Instrumento {

	protected ArrayList<Notas> melodia = new ArrayList<>();
	
	
	public void add(Notas n) {
		melodia.add(n);
	}
	
	
	
	 public abstract void interpretar();
	
}
