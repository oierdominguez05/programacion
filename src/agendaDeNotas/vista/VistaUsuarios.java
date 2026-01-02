package agendaDeNotas.vista;

import javax.swing.*;

	import javax.swing.border.EmptyBorder;
	import java.awt.*;
	
public class VistaUsuarios {

	

	    private static final long serialVersionUID = 1L;

	    private JPanel contentPane;

	    public JList<String> listaUsuarios;
	    public JButton btnAñadirUsuario;
	    public JButton btnEliminarUsuario;
	    public JButton btnEntrar;

	    public VistaUsuarios() {

	        setTitle("Agenda de notas - Selección de usuario");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 400, 350);

	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
	        setContentPane(contentPane);

	        JLabel lblTitulo = new JLabel("Haz click sobre el usuario para acceder:");
	        lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 12));

	        listaUsuarios = new JList<>();
	        listaUsuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	        JScrollPane scrollUsuarios = new JScrollPane(listaUsuarios);

	        btnAñadirUsuario = new JButton("Añadir usuario");
	        btnEliminarUsuario = new JButton("Eliminar usuario");
	        btnEntrar = new JButton("Entrar");

	        btnAñadirUsuario.setBackground(new Color(180, 180, 180));
	        btnEliminarUsuario.setBackground(new Color(180, 180, 180));
	        btnEntrar.setBackground(new Color(150, 200, 150));

	        GroupLayout layout = new GroupLayout(contentPane);
	        contentPane.setLayout(layout);

	        layout.setHorizontalGroup(
	            layout.createParallelGroup(GroupLayout.Alignment.CENTER)
	                .addComponent(lblTitulo)
	                .addComponent(scrollUsuarios, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
	                .addGroup(layout.createSequentialGroup()
	                    .addComponent(btnAñadirUsuario)
	                    .addGap(10)
	                    .addComponent(btnEliminarUsuario))
	                .addComponent(btnEntrar, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
	        );

	        layout.setVerticalGroup(
	            layout.createSequentialGroup()
	                .addComponent(lblTitulo)
	                .addGap(10)
	                .addComponent(scrollUsuarios, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
	                .addGap(15)
	                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	                    .addComponent(btnAñadirUsuario)
	                    .addComponent(btnEliminarUsuario))
	                .addGap(15)
	                .addComponent(btnEntrar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
	        );
	    }
	}


