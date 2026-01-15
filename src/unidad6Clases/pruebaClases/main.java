package unidad6Clases.pruebaClases;

import pruebaClases.controlador.UsuarioControlador;
import pruebaClases.modelo.Usuario;
import pruebaClases.vista.UsuarioVista;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Usuario modelo = new Usuario();
		UsuarioVista vista = new UsuarioVista();
		UsuarioControlador controlador = new UsuarioControlador(modelo, vista);
		
		controlador.IniciarLogin();
	}
}
