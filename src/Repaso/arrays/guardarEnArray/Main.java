package Repaso.arrays.guardarEnArray;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//Pide al usuario 6 números y guarda en un array solo los que no estén repetidos.
		
		
		Scanner teclado = new Scanner(System.in);
		
		int[] numeros = new int[6];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Dime un numero");
			int numero1 = teclado.nextInt();
			 // Mientras el número esté repetido, pide otro
            while (existe(numero1, numeros, i)) {
                System.out.println("Ese número ya está, introduce otro:");
                numero = teclado.nextInt();
            }

            numeros[i] = numero;
			}
			
			
		
		
			/*while (numero1 != numeros) {
				numeros[i] = teclado.nextInt();*/
		
	// Mostrar resultado
    for (int num : numeros) {
        System.out.print(num + " ");
    }
}

// Función simple para comprobar duplicados
public static boolean existe(int num, int[] arr, int hasta) {
    for (int i = 0; i < hasta; i++) {
        if (arr[i] == num) return true;
    }
    return false;
}
}