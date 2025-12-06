package Repaso.Funciones.MinutosDiferencia;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* Diseña una función a la que se le pasan las horas y minutos de dos instantes
de tiempo, con el siguiente prototipo:
public static int difMin(int hora1, int minuto1, int hora2, int minuto2)
La función devolverá la cantidad de minutos que existen de diferencia entre
los dos instantes utilizados.*/
		
		horasMinutos(12, 33, 7, 30);
	}
		
		
		public static void horasMinutos (int hora1, int minuto1, int hora2, int minuto2) {
			
			if (hora1 < 24 && hora1 > 0 && minuto1 <= 60 && minuto1 > 0 && hora2 < 24 && hora2 > 0 && minuto2 <= 60 && minuto2 > 0) {
				int resultado1 = hora1 * 60;
				int resultado2 = hora2 * 60;
				
				int suma1 = resultado1 + minuto1;
				int suma2 = resultado2 + minuto2;
				
				System.out.println("Cantidad de minutos de diferencia: " + (resultado1 - resultado2));
				
			
		}
		
		
		
		
		
		
	}

}
