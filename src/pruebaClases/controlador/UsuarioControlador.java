package pruebaClases.controlador;

import pruebaClases.modelo.Usuario;
import pruebaClases.vista.UsuarioVista;

public class UsuarioControlador {

	
	private Usuario modelo;
	private UsuarioVista vista;
	
	public UsuarioControlador (Usuario modelo, UsuarioVista vista) {
		this.modelo = modelo;
		this.vista = vista;
	}
	
	public void IniciarLogin () {
		
		String UsuarioIntroducido = vista.pedirUsuario();
		
		String ContraseñaIntroducida = vista.pedirContraseña();
		
		boolean validar = modelo.validarLogin(UsuarioIntroducido, ContraseñaIntroducida);
		
		if (validar) {
			vista.registroCorrecto();
			
		} else {
			vista.registroIncorrecto();
		}
	}
}
