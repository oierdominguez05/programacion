package Examenes.Examen2SegundaEv.Pregunta21.modelo;

import java.util.Comparator;

public class CompararPeso implements Comparator<Envio>{

	@Override
	public int compare(Envio o1, Envio o2) {
		return Double.compare(o1.getPeso(), o2.getPeso());
	}

	
	
	
	
}
