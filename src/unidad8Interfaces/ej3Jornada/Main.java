package unidad8Interfaces.ej3Jornada;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import unidad8Interfaces.ej3Jornada.modelo.Jornada;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Implementar la clase Jornada, cuyos objetos son los datos de cada día de
		 * trabajo de los empleados de una empresa. En ella se identificará al
		 * trabajador por su DNI y figurarán la fecha y las horas de entrada y salida
		 * del trabajo de cada jornada. Un método computará el número de minutos
		 * trabajados en la jornada. El criterio de orden natural de las jornadas será
		 * el de los DNI, y para igual DNI, el de la fecha de la jornada, con objeto de
		 * que aparezcan consecutivas todas las jornadas de cada trabajador. Asimismo,
		 * implementar el método toString() que muestre el DNI del empleado, la fecha y
		 * la duración en minutos de las jornadas.
		 */

		
		
		Jornada j1 = new Jornada("12345678F", LocalDate.of(2024, 5, 12), LocalTime.of(23, 33), LocalTime.of(12, 44));
		Jornada j2 = new Jornada("12345678F", LocalDate.of(2021, 2, 16), LocalTime.of(23, 33), LocalTime.of(12, 44));
		Jornada j3 = new Jornada("12345678F", LocalDate.of(2015, 11, 18), LocalTime.of(23, 33), LocalTime.of(12, 44));
		Jornada j4 = new Jornada("12345678F", LocalDate.of(2005, 9, 14), LocalTime.of(23, 33), LocalTime.of(12, 44));
	
		ArrayList <Jornada> jornadas = new ArrayList<>();
		jornadas.add(j1);
		jornadas.add(j2);
		jornadas.add(j3);
		jornadas.add(j4);
		
		
		
		for (Jornada j : jornadas) {
			System.out.println(j);
		}
		
	}

}
