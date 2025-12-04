package Repaso.NumeroReves;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Realiza un programa que pida un número por teclado y que luego muestre
		ese número al revés.*/
		
	Scanner teclado = new Scanner(System.in);
	int numero = teclado.nextInt();
	int reves = 0;
	
	while (numero != 0) {
		
	
	int digito = numero % 10;
	reves = reves * 10 + digito;
	 numero /= 10;
	}
	 System.out.println(reves);
	 
	}
}
