package Repaso.Funciones.Prueba;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		email();
		enviarEmail("Oier", "Dominguez");
		enviarEmailNumero("Oier", "Dominguez", 12345);
		emailEnviado();
	}
	
		
		
		public static void email() {
		System.out.println("email"); 
		}
		
		public static void enviarEmail (String nombre, String apellido) {
			System.out.println("El email se envia a: " + nombre + apellido);
		}
		
		public static void enviarEmailNumero (String nombre, String apellido, int numero) {
			System.out.println("Enviar email a: " + nombre + " " + apellido + " " + numero);
		}
		
		public static boolean emailEnviado () {
			System.out.println("Enviar email");
			return true;
		
		
			
			
			
			
		
	}

}
