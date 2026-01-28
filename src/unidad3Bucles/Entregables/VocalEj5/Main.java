package unidad3Bucles.Entregables.VocalEj5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner teclado = new Scanner(System.in);
        char caracter;

        System.out.println("Ingresa caracteres uno por uno. El programa termina al ingresar un espacio.");

        
        while (true) {
            System.out.print("Caracter: ");
            String entrada = teclado.nextLine();

            
            if (entrada.length() == 0) {
                System.out.println("No ingresaste ningún carácter.");
                continue;
            }

            
            caracter = entrada.charAt(0);

           
            if (caracter == ' ') {
                System.out.println("Programa finalizado.");
                break;
            }

           
            caracter = Character.toLowerCase(caracter);

            
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                System.out.println("vocal");
            } else {
                System.out.println("NO vocal");
            }
        }
    }
}