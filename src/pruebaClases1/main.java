package pruebaClases1;

import pruebaClases1.controlador.UsuarioControlador;
import pruebaClases1.modelo.Usuario;
import pruebaClases1.modelo.UsuarioModelo;
import pruebaClases1.vista.UsuarioVista;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UsuarioModelo usuarioModelo = new UsuarioModelo();
		
		UsuarioVista usuarioVista = new UsuarioVista();
		UsuarioControlador controlador = new UsuarioControlador( usuarioModelo, usuarioVista);
		controlador.iniciar();

		

	}

}
