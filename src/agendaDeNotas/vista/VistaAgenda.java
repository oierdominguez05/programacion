package agendaDeNotas.vista;

import javax.swing.*;

import javax.swing.border.EmptyBorder;
import java.awt.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class VistaAgenda extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel contentPane;

    public JButton btnImportante;
    public JTextField textField;
    public JTextArea textArea;
    public JButton btnIntroducir;

    public VistaAgenda() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 400);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        setContentPane(contentPane);

        JLabel lblTitulo = new JLabel("Bienvenido a Agenda de notas. ¿Qué deseas hacer?");
        lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 12));

        JTextArea txtrOpciones = new JTextArea();
        txtrOpciones.setFont(new Font("Monospaced", Font.PLAIN, 12));
        txtrOpciones.setEditable(false);
        txtrOpciones.setBackground(UIManager.getColor("Panel.background"));
        txtrOpciones.setText(
                "1- Mostrar todos los mensajes guardados.\n" +
                "2- Añadir un mensaje nuevo.\n" +
                "3- Eliminar un mensaje.\n" +
                "4- Marcar un mensaje como importante."
        );

        JLabel lblIntroduce = new JLabel("Introduce el número (1, 2, 3, 4):");

        textField = new JTextField();
        textField.setColumns(10);

        btnIntroducir = new JButton("Introducir");
        btnIntroducir.setFont(new Font("Tahoma", Font.BOLD, 10));
        btnIntroducir.setBackground(new Color(180, 180, 180));

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 12));

        JScrollPane scrollPane = new JScrollPane(textArea);


        btnImportante = new JButton("⭐ Importante");
        btnImportante.setFont(new Font("Tahoma", Font.BOLD, 10));
        btnImportante.setBackground(new Color(255, 255, 128));

        GroupLayout layout = new GroupLayout(contentPane);
        layout.setHorizontalGroup(
            layout.createParallelGroup(Alignment.LEADING)
                .addComponent(lblTitulo)
                .addComponent(txtrOpciones, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(lblIntroduce)
                    .addGap(10)
                    .addComponent(textField, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                    .addGap(10)
                    .addComponent(btnIntroducir)
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addComponent(btnImportante))
                .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 450, GroupLayout.PREFERRED_SIZE)
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(lblTitulo)
                    .addGap(10)
                    .addComponent(txtrOpciones, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(lblIntroduce)
                        .addComponent(textField, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnIntroducir, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnImportante))
                    .addGap(20)
                    .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
        );

        contentPane.setLayout(layout);
    }


    public JTextField getTextField() {
        return textField;
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public JButton getBtnIntroducir() {
        return btnIntroducir;
    }

    public JButton getBtnImportante() {
        return btnImportante;
    }
}
