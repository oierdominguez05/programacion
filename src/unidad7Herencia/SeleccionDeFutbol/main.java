package unidad7Herencia.SeleccionDeFutbol;

import unidad7Herencia.SeleccionDeFutbol.modelo.Entrenador;
import unidad7Herencia.SeleccionDeFutbol.modelo.Futbolista;
import unidad7Herencia.SeleccionDeFutbol.modelo.Masajista;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Entrenador entrenador = new Entrenador(12, "Hola", "Oier", 45);
		Futbolista futbolista = new Futbolista(2424, "Oier", "Dominguez", 34, 5677, "Hola", 3434, "Pepe");
		Masajista masajista = new Masajista(2424, "Oier", "Dominguez", 34);
		
		futbolista.entrenar();
	}

}
