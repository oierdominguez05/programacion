package unidad6Clases.pruebaClases.modelo;

public class Usuario {

	
	
	
	private String usuarioCorrecto = "oier";
	private String passwordCorrecta = "0000";
	
	
	public boolean validarLogin(String usuario, String password) {
		//return usuario.equals(usuarioCorrecto) && password.equals(passwordCorrecta);
		
		if (usuario.equals(usuarioCorrecto) && (password.equals(passwordCorrecta))) {
			return true;
		} else {
			return false;
		}
		
	
		
	}
	
	
}
