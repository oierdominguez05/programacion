package unidad6Clases.Calendario;

import unidad6Clases.Calendario.modelo.Calendario;
import unidad6Clases.Calendario.vista.VistaCalendario;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Diseña la clase Calendario que representa una fecha concreta (año, mes y
		 * dia). La clase debe disponer de los métodos: • Calendario(int año, int mes,
		 * int dial: que crea un objeto con los datos pasados como parámetros, siempre y
		 * cuando, la fecha que representensea correcta. • void incrementarDia(): que
		 * incrementa en un día la fecha del calendario. • void incrementarMes(): que
		 * incrementa en un mes la fecha del calendario. • void incrementarAño(int
		 * cantidad): que incrementa la fecha del calendario en el número de años
		 * especificados. Ten en cuenta que el año 0 no existió. • void mostrar():
		 * muestra la fecha por consola. • boolean iguales(Calendario otraFecha): que
		 * determina si la fecha invocante y la que se pasa como parámetro son iguales o
		 * distintas. Por simplicidad, solo tendremos en consideración que existen meses
		 * con distinto número de días, pero no tendremos en cuenta los años bisiestos.
		 */

		Calendario calendario = new Calendario(34, 4, 0);
		VistaCalendario vista = new VistaCalendario(calendario);
		
		
		vista.iniciar();
		
		
	}

}
