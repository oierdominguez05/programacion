package pruebaClases1.vista;

import java.util.Scanner;

public class UsuarioVista {

	private Scanner teclado = new Scanner(System.in);

	public int mostrarMenu() {
		System.out.println("----- MENÚ -----");
		System.out.println("1. Registrar usuario");
		System.out.println("2. Iniciar sesión");
		System.out.println("3. Salir");
		System.out.print("Elige una opción: ");
		int resultado = teclado.nextInt();

		if (teclado.hasNextLine()) {
			teclado.nextLine();
		}
		return resultado;
	}

	public String pedirNombre() {
		System.out.println("Introduce el nombre:");
		String nombre1 = teclado.nextLine();
		return nombre1;

	}

	public String pedirContrasena() {
		System.out.println("Introduce la contraseña:");
		String contrasena1 = teclado.nextLine();
		return contrasena1;
	}

	public void mostrar(String frase) {

		System.out.println(frase);
	}
}
