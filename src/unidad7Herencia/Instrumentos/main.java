package unidad7Herencia.Instrumentos;

import unidad7Herencia.Instrumentos.modelo.Instrumento;
import unidad7Herencia.Instrumentos.modelo.Notas;
import unidad7Herencia.Instrumentos.modelo.Piano;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crear la clase abstracta Instrumento, que almacena en una tabla las notas
		 * musicales de una melodía (dentro de una misma octava). El método add() añade
		 * nuevas notas musicales. La clase también dispone del método abstracto
		 * interpretar() que, en cada subclase que herede de Instrumento, mostrará por
		 * consola las notas musicales según las interprete. Utilizar enumerados para
		 * definir las notas musicales.
		 */

		
		Instrumento modelo = new Piano();
		Notas notas = new Notas();
		Piano piano = new Piano();
		
		modelo.add(Notas.doo);
		modelo.add(Notas.si);
		
		modelo.interpretar();
		
	}

}
