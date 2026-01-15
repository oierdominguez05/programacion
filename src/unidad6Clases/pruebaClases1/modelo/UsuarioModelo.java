package unidad6Clases.pruebaClases1.modelo;

import java.util.ArrayList;

public class UsuarioModelo {

	private ArrayList<Usuario> listaUsuarios = new ArrayList<>();

	public void registrarUsuario(String nombre, String contrasena) {
		Usuario nuevo = new Usuario(nombre, contrasena);
		listaUsuarios.add(nuevo);
	}

	public boolean validarLogin(String nombre, String contrasena) {
		for (Usuario u : listaUsuarios) {
			if (u.getNombre().equals(nombre) && (u.getContrasena().equals(contrasena))) {
				return true;

			}

		}
		return false;

	}

}
