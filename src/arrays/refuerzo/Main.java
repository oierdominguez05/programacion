package arrays.refuerzo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Implementa la función: int[] suma(int t[], int numElementos),
		que crea y devuelve una tabla con las sumas de los numElementos
		elementos consecutivos de t. Veamos un ejemplo, sea t = [10, 1, 5, 8,
		9, 2]. Si los elementos de t se agrupan de 3 en 3, se harán las sumas:
		10 + 1 + 5. Igual a 16.
		1 + 5 + 8. Igual a 14.
		5 + 8 + 9. Igual a 22.
		8 + 9 + 2. Igual a 19.*/
		
		
int [] t = {10, 1, 5, 8, 9, 6, 8, 3, 7};
System.out.println(Arrays.toString(suma t[2])));
		

		
		
		int[] suma(int t[], int numElementos) {
			String imprimir = "";
			int suma = 0;
			int[] array = new int [t.length - numElementos +1];
			int indice = 0;
			for (int j = 0, i = 0; j < t.length; j++) {
				if(i < numElementos) {
				suma += t[j];
				if (i!= numElementos -1) {
				imprimir += t[j] + " + ";
				} else {
					imprimir += t [j] + ". Igual a " + suma;
					array [indice] = suma;
					indice++;
				}
				i++;
				
				} else {
					suma = 0;
					System.out.println(imprimir);
					imprimir="";
					i = 0;
					j -= numElementos;
				}
				
				
				
				
				
				
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
