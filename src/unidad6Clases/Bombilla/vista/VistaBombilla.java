package unidad6Clases.Bombilla.vista;

public class VistaBombilla {

	
	
	
	public void mostrar(String frase) {
		System.out.println(frase);
	}
	
	
	public void menuInicio() {
		System.out.println("Estas son las bombillas:\n"
				+ "1. Encender bombilla 1\n"
				+ "2. Apagar bombilla 1\n"
				+ "3. Encender bombilla 2\n"
				+ "4. Apagar bombilla 2\n"
				+ "5. Encender general\n"
				+ "6. Apagar interruptor general"
				+ "7.Mostrar estado de las bombillas"
				+ "0. Salir");
	}
	
}
