package unidad6Clases.pruebaClases.vista;

import java.util.Scanner;

public class UsuarioVista {

	
	Scanner teclado = new Scanner(System.in);
	
	public String pedirUsuario () {
		System.out.println("Introduce el usuario");
		String usuario1 = teclado.nextLine();
		return usuario1;
		
	}
	public String pedirContraseña () {
		System.out.println("Introduce la contraseña");
		String contraseña = teclado.nextLine();
		return contraseña;
	}
	
	public void registroCorrecto () {
		System.out.println("El registro ha sido correcto");
	}
	
	public void registroIncorrecto() {
		System.out.println("El registro no ha sido correcto");
	
	
	
	
	}
	
}
