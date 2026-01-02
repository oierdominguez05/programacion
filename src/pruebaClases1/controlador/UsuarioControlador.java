package pruebaClases1.controlador;

import pruebaClases1.modelo.UsuarioModelo;
import pruebaClases1.vista.UsuarioVista;

public class UsuarioControlador {

	private UsuarioModelo modelo;
	private UsuarioVista vista;

	public UsuarioControlador(UsuarioModelo modelo, UsuarioVista vista) {
		this.modelo = modelo;
		this.vista = vista;
	}

	public void iniciar() {
		boolean salir = false;

		while (!salir) {
			int opcion = vista.mostrarMenu();

			switch (opcion) {
			case 1:
				String nom1 = vista.pedirNombre();
				String cont1 = vista.pedirContrasena();
				modelo.registrarUsuario(nom1, cont1);
				vista.mostrar("Registrado");
				break;

			case 2:
				String nom2 = vista.pedirNombre();
				String cont2 = vista.pedirContrasena();
				boolean valido = modelo.validarLogin(nom2, cont2);
				if (valido) {
					vista.mostrar("Sesion Iniciada");
				} else {
					vista.mostrar("Sesion NO iniciada");
				}
				
				break;
			case 3:
				vista.mostrar("Saliendo");
				salir = true;
				break;

			}

		}
	}

}
