package clases.Bombilla.vista;

public class VistaBombilla {

	
	
	
	public void mostrar(String frase) {
		System.out.println(frase);
	}
	
	
	public void menuInicio() {
		System.out.println("Estas son las bombillas:\n"
				+ "Selecciona la que quieras encender pero para ello debes encender el interruptor general\n"
				+ "11. Encender interruptor general\n"
				+ "1. Encender bombilla nº1\n"
				+ "2. Encender bombilla nº2\n"
				+ "3. Encender bombilla nº3\n");
	}
	
}
