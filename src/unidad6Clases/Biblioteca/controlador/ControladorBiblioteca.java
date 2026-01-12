package unidad6Clases.Biblioteca.controlador;

import unidad6Clases.Biblioteca.modelo.Libro;
import unidad6Clases.Biblioteca.vista.VistaBiblioteca;

public class ControladorBiblioteca {


	
	private Libro modelo;
	private VistaBiblioteca vista;
	
	public ControladorBiblioteca(Libro modelo, VistaBiblioteca vista) {
		super();
		this.modelo = modelo;
		this.vista = vista;
	}
	
	public void iniciar() {
		modelo.mostrar();
	}
	
}
