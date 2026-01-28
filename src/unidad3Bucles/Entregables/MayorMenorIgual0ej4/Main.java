package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
        System.out.print("Cuantos numeros deseas ingresar? ");
        Scanner teclado = new Scanner(System.in);
        int cantidad = teclado.nextInt();

        
        int mayor = 0;
        int menor = 0;
        int igual = 0;

     
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingresa el número " + i + ": ");
            int numero = teclado.nextInt();


            if (numero > 0) {
                mayor++;
                
            } else if (numero < 0) {
                menor++;
            } else if (numero == 0)
                igual++;
            }
        

    
        System.out.println("Cantidad de numeros mayores que 0: " + mayor);
        System.out.println("Cantidad de numeros menores que 0: " + menor);
        System.out.println("Cantidad de numeros iguales a 0: " + igual);
		
		
		
		
		
	}

}
