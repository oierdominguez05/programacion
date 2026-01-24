package unidad8Interfaces.ej4Telecomunicaciones.modelo;

public enum Interlocutor {

	ZONA1(80), ZONA2(60), ZONA3(66), ZONA4(59), ZONA5(46);

	private final int tarifa;

	Interlocutor(int tarifa) {
		this.tarifa = tarifa;
	}

	public int getTarifa() {
		return tarifa;
	}

}
