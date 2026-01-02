package agendaDeNotas.controlador;

import modelo.Usuario;
import vista.VistaAgenda;
import vista.VistaUsuarios;

import javax.swing.*;

public class ControladorUsuarios {

	private Usuario modeloUsuario;
	private VistaUsuarios vistaUsuario;

	public ControladorUsuarios(ModeloUsuarios modeloUsuarios, VistaUsuarios vistaUsuarios) {
		this.modeloUsuario = modeloUsuario;
		this.vistaUsuario = vistaUsuario;

		cargarListaUsuarios();

	
		vistaUsuarios.btnAñadirUsuario.addActionListener(e -> añadirUsuario());
		vistaUsuarios.btnEliminarUsuario.addActionListener(e -> eliminarUsuario());
		vistaUsuarios.btnEntrar.addActionListener(e -> entrarUsuario());
	}

	private void cargarListaUsuarios() {
		DefaultListModel<String> modeloLista = new DefaultListModel<>();

		for (Usuario u : modeloUsuarios.getUsuarios()) {
			modeloLista.addElement(u.getNombre());
		}

		vistaUsuarios.listaUsuarios.setModel(modeloLista);
	}

	private void añadirUsuario() {
		String nombre = JOptionPane.showInputDialog(vistaUsuarios, "Introduce el nombre del nuevo usuario:",
				"Añadir usuario", JOptionPane.PLAIN_MESSAGE);

		if (nombre != null && !nombre.trim().isEmpty()) {
			modeloUsuarios.añadirUsuario(nombre);
			cargarListaUsuarios();
		}
	}

	private void eliminarUsuario() {
		int index = vistaUsuarios.listaUsuarios.getSelectedIndex();

		if (index == -1) {
			JOptionPane.showMessageDialog(vistaUsuarios, "Selecciona un usuario para eliminar.");
			return;
		}

		int confirm = JOptionPane.showConfirmDialog(vistaUsuarios, "¿Seguro que quieres eliminar este usuario?",
				"Confirmar eliminación", JOptionPane.YES_NO_OPTION);

		if (confirm == JOptionPane.YES_OPTION) {
			Usuario.eliminarUsuario(index);
			cargarListaUsuarios();
		}
	}

	private void entrarUsuario() {
		int index = vistaUsuarios.listaUsuarios.getSelectedIndex();

		if (index == -1) {
			JOptionPane.showMessageDialog(vistaUsuarios, "Selecciona un usuario para entrar.");
			return;
		}

		Usuario usuario = modeloUsuarios.getUsuario(index);

		VistaAgenda vistaAgenda = new VistaAgenda();
		ControladorAgenda controladorAgenda = new ControladorAgenda(usuario, vistaAgenda);

		vistaAgenda.setVisible(true);
	}
}
