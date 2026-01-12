package unidad6Clases.Biblioteca;

import unidad6Clases.Biblioteca.controlador.ControladorBiblioteca;
import unidad6Clases.Biblioteca.modelo.Libro;
import unidad6Clases.Biblioteca.vista.VistaBiblioteca;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Libro modelo = new Libro("El quijote", "Oier", 10, 5);
		VistaBiblioteca vista = new VistaBiblioteca();
		
		
		 ControladorBiblioteca controlador = new ControladorBiblioteca(modelo, vista);
		 
		controlador.iniciar();
		
	}

}
