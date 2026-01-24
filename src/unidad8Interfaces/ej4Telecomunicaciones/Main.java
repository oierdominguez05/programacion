package unidad8Interfaces.ej4Telecomunicaciones;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;

import unidad8Interfaces.ej4Telecomunicaciones.modelo.Interlocutor;
import unidad8Interfaces.ej4Telecomunicaciones.modelo.Llamada;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * En una compañía de telecomunicaciones se desean registrar los datos de todas
		 * las llamadas de sus clientes. Implementar la clase Llamada, que guardará los
		 * siguientes datos: número de teléfono del cliente, número del interlocutor,
		 * atributo booleano que indique si la llamada es saliente, fecha y hora del
		 * inicio de la llamada y del fin, atributo enumerado que indique la zona del
		 * interlocutor (suponer cinco zonas con tarifas distintas) y tabla de
		 * constantes con las tarifas de las zonas en céntimos de euro/minuto. En la
		 * clase se establecerá un orden natural compuesto basado en el número del
		 * teléfono del cliente como primer criterio y en la fecha y hora de inicio como
		 * segundo criterio. Asimismo, se implementará un método que devuelva la
		 * duración en minutos de la llamada y otro que calcule su coste, si es
		 * saliente. Por último, implementar el método toString(), que muestre los dos
		 * números de teléfono, la fecha y hora del inicio, la duración y el coste.
		 */

		
		
		Llamada llamada1 = new Llamada("1234556", "1234789", true, LocalDate.of(2022, 9, 13), LocalTime.of(14, 27),LocalTime.of(22, 49), Interlocutor.ZONA1);
		Llamada llamada2 = new Llamada("98654321", "9987766", false, LocalDate.of(2025, 9, 13), LocalTime.of(8, 27),LocalTime.of(12, 49), Interlocutor.ZONA4);
		
		ArrayList<Llamada> llamadas = new ArrayList<>();
		llamadas.add(llamada1);
		llamadas.add(llamada2);
		
		Collections.sort(llamadas);
		
		for (Llamada l : llamadas) {
			System.out.println(l);
		}
	
	}

}
