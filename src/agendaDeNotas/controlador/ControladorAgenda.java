package agendaDeNotas.controlador;

import modelo.Usuario;

import vista.VistaAgenda;

import javax.swing.JOptionPane;

public class ControladorAgenda {

    private Usuario usuario;
    private VistaAgenda vista;

    public ControladorAgenda(Usuario usuario, VistaAgenda vista) {
        this.usuario = usuario;
        this.vista = vista;

        // Listeners
        vista.getBtnIntroducir().addActionListener(e -> procesarOpcion());
        vista.getBtnImportante().addActionListener(e -> marcarImportante());
    }


    private void procesarOpcion() {
        String numero = vista.getTextField().getText().trim();

        switch (numero) {
            case "1":
                mostrarMensajes();
                break;

            case "2":
                añadirMensaje();
                break;

            case "3":
                borrarMensaje();
                break;

            case "4":
                marcarImportante();
                break;

            default:
                JOptionPane.showMessageDialog(vista, "Debes introducir 1, 2, 3 o 4");
        }
    }

 
    private void mostrarMensajes() {
        vista.getTextArea().setText("");

        if (usuario.getMensajes().isEmpty()) {
            vista.getTextArea().setText("No hay mensajes guardados.\n");
        } else {
            for (int i = 0; i < usuario.getMensajes().size(); i++) {
                vista.getTextArea().append((i + 1) + "- " + usuario.getMensajes().get(i) + "\n");
            }
        }
    }

    
    private void añadirMensaje() {
        String nuevoMensaje = JOptionPane.showInputDialog(
                vista,
                "Introduce un nuevo mensaje:",
                "Añadir mensaje",
                JOptionPane.PLAIN_MESSAGE
        );

        if (nuevoMensaje != null && !nuevoMensaje.trim().isEmpty()) {
            usuario.añadirMensaje(nuevoMensaje);
            vista.getTextArea().append("Añadido: " + nuevoMensaje + "\n");
        }
    }

    private void borrarMensaje() {
        if (usuario.getMensajes().isEmpty()) {
            JOptionPane.showMessageDialog(vista, "No hay mensajes para eliminar.");
            return;
        }

        String lista = "";
        for (int i = 0; i < usuario.getMensajes().size(); i++) {
            String msg = usuario.getMensajes().get(i);
            if (msg.length() > 20) msg = msg.substring(0, 20) + "...";
            lista += (i + 1) + "- " + msg + "\n";
        }

        String input = JOptionPane.showInputDialog(
                vista,
                "Estos son los mensajes almacenados:\n" + lista +
                        "\nIntroduce el número a borrar (-1 para cancelar):",
                "Eliminar mensaje",
                JOptionPane.PLAIN_MESSAGE
        );

        try {
            int opcion = Integer.parseInt(input);
            if (opcion > 0 && opcion <= usuario.getMensajes().size()) {
                usuario.borrarMensaje(opcion - 1);
                JOptionPane.showMessageDialog(vista, "Mensaje eliminado.");
            }
        } catch (Exception ignored) {}
    }

    private void marcarImportante() {

        if (usuario.getMensajes().isEmpty()) {
            JOptionPane.showMessageDialog(vista, "No hay mensajes para marcar.");
            return;
        }

        String input = JOptionPane.showInputDialog(
                vista,
                "¿Qué mensaje quieres marcar como importante?\nIntroduce el número:",
                "Marcar importante",
                JOptionPane.PLAIN_MESSAGE
        );

        try {
            int index = Integer.parseInt(input) - 1;

            if (index >= 0 && index < usuario.getMensajes().size()) {

                int confirm = JOptionPane.showConfirmDialog(
                        vista,
                        "¿Quieres marcar este mensaje como importante?",
                        "Confirmar",
                        JOptionPane.YES_NO_OPTION
                );

                if (confirm == JOptionPane.YES_OPTION) {
                    String msg = usuario.getMensajes().get(index);

           
                    if (!msg.startsWith("✓ ")) {
                        usuario.getMensajes().set(index, "✓ " + msg);
                    }

                    JOptionPane.showMessageDialog(vista, "Mensaje marcado como importante.");
                    mostrarMensajes();
                }
            }
        } catch (Exception ignored) {}
    }
}
