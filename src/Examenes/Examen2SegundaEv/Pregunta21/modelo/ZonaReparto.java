package Examenes.Examen2SegundaEv.Pregunta21.modelo;

public enum ZonaReparto {

	
	ZONA_1(5), ZONA_2(10), ZONA_3(15);
	
	private final int recargo;

	private ZonaReparto(int recargo) {
		this.recargo = recargo;
	}

	public int getRecargo() {
		return recargo;
	}


	
	
	
	
}
