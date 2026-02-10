package Examenes.PrimeraRecuperacion1ªev;

import java.util.Arrays;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribir la función: public static int[] eliminarMayores(int t[], int valor)
		 * que crea y devuelve una copia de la tabla t donde se han eliminado todos los
		 * elementos que son mayores que "valor".
		 */



		        int[] t = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		        int valor = 13;

		        int[] copia = eliminarMayores(t, valor);

		        System.out.println(Arrays.toString(copia));
		    }

		    public static int[] eliminarMayores(int t[], int valor) {

		    	int posicion = 0;
		    	for(int i = 0; i < t.length;i++) {
		    		if(t[i] == valor) {
		    			posicion = i;
		    		}
		    	}
		    	int[] resultado = Arrays.copyOf(t, posicion + 1);
		    	return resultado;
		    	
		    	
		    	
		       /* int contador = 0;
		        for (int i = 0; i < t.length; i++) {
		            if (t[i] <= valor) {
		                contador++;
		            }
		        }

		        int[] copia = new int[contador];
		        int j = 0;

		        for (int i = 0; i < t.length; i++) {
		            if (t[i] <= valor) {
		                copia[j] = t[i];
		                j++;
		            }
		        }

		        return copia;*/
		    }
		}
